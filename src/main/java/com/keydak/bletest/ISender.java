package com.keydak.bletest;

/**
 * Created by admin on 2017/11/2.
 */
public interface ISender {
     void initConfig();
     void start();
     void stop();
     void sendCommand(CommandData data, DataValidator validator, ISendCallBack backResult);
     int isBusy();

}
