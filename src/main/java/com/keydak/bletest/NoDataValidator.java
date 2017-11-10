package com.keydak.bletest;

/**
 * Created by admin on 2017/11/2.
 */
public class NoDataValidator extends  DataValidator {
    @Override
    public int validate(final byte[] sendData, final byte[] recvData){
        return 0;
    }
}
