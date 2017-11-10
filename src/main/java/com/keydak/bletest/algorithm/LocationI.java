package com.keydak.bletest.algorithm;

/**
 * Created by admin on 2017/10/25.
 */

public interface LocationI {
    /*根据测距数据计算标签位置*/
    double[] covertDistanceToPos(String baseStationInfo);

}
