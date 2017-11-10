package com.keydak.bletest;

import java.util.HashMap;
import java.util.Map;

//将基站坐标的定义为常量
public class Constant {
    public static final int NO_ERROR_CORRECTED=0;
    public static final int ERROR_CORRECTED=1;
    public static final int BASE_STATION_DOWN_LIMIT=4;
    public static Map<String,double[]> factoryBaseStationInfoMap=new HashMap<String,double[]>();
    public static Map<String,double[]> companyBaseStationInfoMap=new HashMap<String,double[]>();


    static{
        //工厂基站坐标
        factoryBaseStationInfoMap.put("1",new double[]{7100.00,1040.0,3180.0});
        factoryBaseStationInfoMap.put("2",new double[]{1040.00,6530.00,3100.00});
        factoryBaseStationInfoMap.put("3",new double[]{5400.00,6500.00,3250.00});
        factoryBaseStationInfoMap.put("4",new double[]{5400.00,2870.00,3100.00});
        factoryBaseStationInfoMap.put("5",new double[]{5400.00,600.00,3550.00});
        factoryBaseStationInfoMap.put("6",new double[]{910.00,-220.00,3100.00});
        //公司基站坐标
        companyBaseStationInfoMap.put("1",new double[]{0,0,2100});
        companyBaseStationInfoMap.put("2",new double[]{0,5600,2000});
        companyBaseStationInfoMap.put("3",new double[]{4400,0,3300});
        companyBaseStationInfoMap.put("4",new double[]{4400,5600,2500});
        companyBaseStationInfoMap.put("5",new double[]{7000,2500,680});
        companyBaseStationInfoMap.put("6",new double[]{6600,5000,1800});
    }
}
