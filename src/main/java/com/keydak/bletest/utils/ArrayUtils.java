package com.keydak.bletest.utils;

/**
 * Created by admin on 2016/12/2.
 */
public class ArrayUtils {
    public static void Revertse(byte[] src) {
        if (src == null) {
            return;
        }
        byte temp;
        int center = (src.length + 1) >> 1;
        for (int i = 0; i <= center - 1; i++) {
            temp = src[i];
            src[i] = src[src.length - i - 1];
            src[src.length - i - 1] = temp;
        }
    }

    public static byte[] concat(byte[] src,byte[] des,int desPos,int srcLength)
    {
        System.arraycopy(src,0,des,desPos,srcLength);
        return des;
    }
}
