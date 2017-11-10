package com.keydak.bletest;

/**
 * Created by admin on 2017/11/2.
 */
public class CommandData {
    private byte[] data;
    private String dataKey;
    private int priority;

    public CommandData(){
    }
    public CommandData(byte[] data, String dataKey, int priority){
        this.data=data;
        this.dataKey=dataKey;
        this.priority=priority;
    }

    public byte[] getData(){
        return this.data;
    }

    public void setData(byte[] data){
        this.data=data;
    }

    public void setDataKey(String dataKey){
        this.dataKey=dataKey;
    }

    public String getDataKey(){
        return this.dataKey;
    }

    public int getPriority(){
        return this.priority;
    }

    public void setPriority(int priority){
        this.priority=priority;
    }
}
