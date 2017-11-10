package com.keydak.bletest;

import java.util.List;

/**
 * Created by admin on 2017/11/8.
 */
public class BleReceiveDataTest {
    public static void main(String[] args){
        List<String> distStrList=TestData.getCompanyBsSendStrList();
        int i=0;
        ISender sender=new WinSerialSender("COM3",115200);
        sender.initConfig();
        sender.start();
        int index=0;
        while(true){
             CommandData insCommandData=new CommandData(distStrList.get(index).getBytes(),"sendDist",1);
            sender.sendCommand(insCommandData,new NoDataValidator(),new SendCallBack());
            if(index%6==0){
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            try{
                Thread.sleep(200);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            index++;
            if(index>=distStrList.size()){
                index=0;
            }
        }

    }
}
