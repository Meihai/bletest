package com.keydak.bletest;

import com.keydak.bletest.utils.ArrayUtils;
import com.keydak.bletest.utils.HexUtil;
import com.keydak.bletest.utils.LogUtil;
import gnu.io.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TooManyListenersException;

/**
 * Created by admin on 2017/11/2.
 */
public class WinSerialSender implements ISender,SerialPortEventListener {
    private String portName;
    private int baudRate;
    private InputStream inputStream;
    private OutputStream outputStream;
    private CommPortIdentifier portIdentifier;
    private SerialPort serialPort;
    private byte[] bytes_buffer = new byte[1024];
    private int actual_length = 0;

    private DataValidator dataValidator;
    private CommandData commandData;
    private ISendCallBack callBack;

    private Timer timer;
    private TimerTask timeoutTask;
    private final int TIME_OUT=100;
    private int busyStatus=0;

    public WinSerialSender(String device,int baudRate){
        this.portName=device;
        this.baudRate=baudRate;
    }

    @Override
    public void initConfig(){
        try{
            portIdentifier=CommPortIdentifier.getPortIdentifier(portName);
            LogUtil.info(this.getClass(),"成功初始化端口");
        } catch ( NoSuchPortException e ) {
            LogUtil.error(this.getClass(), "端口" + portName + "不存在");
            e.printStackTrace();
        }
    }

    @Override
    public void start(){
        try{
            int timeout = 2000;
            CommPort commPort = portIdentifier.open(this.getClass().getName(), timeout);
            if (commPort instanceof SerialPort) {
                serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(baudRate, SerialPort.DATABITS_8,
                        SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                serialPort.addEventListener(this);
                serialPort.notifyOnDataAvailable(true);
                outputStream = serialPort.getOutputStream();
                inputStream = serialPort.getInputStream();
            } else {
                LogUtil.error(this.getClass(),"Error: Only serial ports are handled by this example.");
            }
        }catch(PortInUseException e){
            LogUtil.error(this.getClass(),"端口"+portName+"已经被占用");
            e.printStackTrace();
        }catch(UnsupportedCommOperationException e){
            LogUtil.error(this.getClass(),"端口操作命令不支持");
            e.printStackTrace();
        }catch(TooManyListenersException e ){
            LogUtil.error(this.getClass(),"端口"+portName+"监听者过多");
            e.printStackTrace();
        }catch(IOException ex){
            LogUtil.error(this.getClass(),"打开端口"+portName+"失败");
        }
    }

    @Override
    public void stop(){
        cancelTimer();
        if (serialPort != null) {
            serialPort.notifyOnDataAvailable(false);
            serialPort.removeEventListener();
            serialPort.close();
            serialPort = null;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
                inputStream = null;
            }
            catch (IOException e) {}
        }
        if (outputStream != null) {
            try {
                outputStream.close();
                outputStream = null;
            }
            catch (IOException e) {}
        }
    }

    @Override
    public void sendCommand(CommandData data, DataValidator validator, ISendCallBack callBack){
        try
        {   busyStatus=1;
            this.commandData=data;
            this.dataValidator=validator;
            this.callBack=callBack;
            if(outputStream==null){
                LogUtil.info(this.getClass(),"outputStream 为null");
            }
            outputStream.write(data.getData());
            outputStream.flush();
            outputStream.close();
            timer=new Timer();
            timeoutTask=getTimeOutTask();
            timer.schedule(timeoutTask,TIME_OUT);//超时时间定义为100ms

        }catch ( IOException e ) {
            e.printStackTrace();
        }
    }
    private TimerTask getTimeOutTask(){
        TimerTask task=new TimerTask(){
            @Override
            public void run(){
                CallBackResult result=new CallBackResult();
                result.data=null;
                result.code=-1;
                result.message="接收数据超时";
                busyStatus=-1;
                actual_length=0;
                dealWithResult(result);
            }
        };
        return task;
    }

    private void  cancelTimer(){
        if (timeoutTask!=null){
            timer.cancel();
        }
    }

    private void dealWithResult(CallBackResult result){
        callBack.onReceive(commandData,result);
    }

    @Override
    public void serialEvent(SerialPortEvent event){
        switch (event.getEventType()) {
            case SerialPortEvent.DATA_AVAILABLE:{//数据可用
                cancelTimer();
                readComm();
                busyStatus=0;
                break;
            }
            default: {
                LogUtil.debug(this.getClass(), "event:" + event.getEventType());
                break;
            }
        }
    }

    @Override
    public int isBusy(){
        return busyStatus;
    }

    private void readComm() {
        byte[] readBuffer = new byte[1024];
        CallBackResult result=new CallBackResult();
        try {
            int len = 0;
            while ((len = inputStream.read(readBuffer)) != -1) {
                bytes_buffer = ArrayUtils.concat(readBuffer,bytes_buffer,actual_length,len);
                actual_length += len;
                byte[] recvArray = Arrays.copyOf(bytes_buffer,actual_length);
                if(dataValidator.validate(commandData.getData(),recvArray)>0){
                    result.data=recvArray;
                    result.code=1;
                    result.message=null;
                    dealWithResult(result);
                    actual_length = 0;
                    LogUtil.info(this.getClass(), HexUtil.encodeHexStr(recvArray));
                }
                break;
            }
        } catch (IOException e) {
            result.data=null;
            result.code=-1;
            result.message="读取串口数据失败";
            dealWithResult(result);
            actual_length = 0;
            e.printStackTrace();
        }
    }

    public void setPortName(String device){
        this.portName=device;
    }
    public String getPortName(){
        return this.portName;
    }

    public void setBaudRate(int baudRate){
        this.baudRate=baudRate;
    }

    public int getBaudRate(){
        return this.baudRate;
    }

}
