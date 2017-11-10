package com.keydak.bletest;

import java.util.List;

/**
 * Created by admin on 2017/11/2.
 */
public class BleLocTest {

    public static void main(String[] args){
       List<String> distStrList=TestData.getFactorySendStrList();
      //  List<String> distStrList=TestData.getCompanySendStrList();
//        LocationI locationins=new PosEstimationWithCG();
//        double[] tagPos=locationins.covertDistanceToPos(distStrList.get(0));
//        System.out.println(distStrList.get(0));
//        if(tagPos!=null) {
//            System.out.println("tag:"+tagPos[0] + "," + tagPos[1] + ","+tagPos[2]);
//        }
//        else{
//            System.out.println("解算位置失败");
//        }

        ISender sender=new WinSerialSender("COM3",115200);
        sender.initConfig();
        sender.start();
        int index=0;
        while(true){
            CommandData insCommandData=new CommandData(distStrList.get(index).getBytes(),"sendDist",1);
            sender.sendCommand(insCommandData,new NoDataValidator(),new SendCallBack());
            try{
                Thread.sleep(500);
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
