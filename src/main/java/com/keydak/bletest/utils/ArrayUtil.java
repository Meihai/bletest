package com.keydak.bletest.utils;

/**
 * Created by admin on 2017/10/26.
 */

public class ArrayUtil {
    public static final String TAG="ArrayUtil";
    public static void arrayCopy(double[][] srcArray,double[][] dstArray){
        if(srcArray==null || dstArray==null){

            return;
        }
        int row=dstArray.length;
        int col=dstArray[0].length;
        if(srcArray.length<row || srcArray[0].length<col){

            return;
        }
        for (int i=0;i<row;i++)
            for(int j=0;j<col;j++){
                dstArray[i][j]=srcArray[i][j];
            }
    }
}
