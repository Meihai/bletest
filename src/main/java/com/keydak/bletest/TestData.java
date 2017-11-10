package com.keydak.bletest;

import java.util.ArrayList;

/**
 * Created by admin on 2017/11/2.
 */
public class TestData {
    public static final String preStr="distance ";
    public static final String midStr=": ";
    public static final String endStr="mm";
    public static ArrayList<String> getFactorySendStrList(){
        ArrayList<String> testStr=new ArrayList<String>();
        ArrayList<Point> pointList=getFactoryPointList();
        for(int i=0;i<pointList.size();i++){
            Point insPoint=pointList.get(i);
            StringBuilder sb=new StringBuilder();
            //第一个基站的距离
            double[] bs1=Constant.factoryBaseStationInfoMap.get("1");
            double dist1=Math.sqrt(Math.pow(bs1[0]-insPoint.getX(),2)+Math.pow(bs1[1]-insPoint.getY(),2)+
            Math.pow(bs1[2]-insPoint.getZ(),2));
            //第2个基站的距离
            double[] bs2=Constant.factoryBaseStationInfoMap.get("2");
            double dist2=Math.sqrt(Math.pow(bs2[0]-insPoint.getX(),2)+Math.pow(bs2[1]-insPoint.getY(),2)+
                    Math.pow(bs2[2]-insPoint.getZ(),2));
            //第3个基站的距离
            double[] bs3=Constant.factoryBaseStationInfoMap.get("3");
            double dist3=Math.sqrt(Math.pow(bs3[0]-insPoint.getX(),2)+Math.pow(bs3[1]-insPoint.getY(),2)+
                    Math.pow(bs3[2]-insPoint.getZ(),2));
            //第4个基站的距离
            double[] bs4=Constant.factoryBaseStationInfoMap.get("4");
            double dist4=Math.sqrt(Math.pow(bs4[0]-insPoint.getX(),2)+Math.pow(bs4[1]-insPoint.getY(),2)+
                    Math.pow(bs4[2]-insPoint.getZ(),2));
            //第5个基站的距离
            double[] bs5=Constant.factoryBaseStationInfoMap.get("5");
            double dist5=Math.sqrt(Math.pow(bs5[0]-insPoint.getX(),2)+Math.pow(bs5[1]-insPoint.getY(),2)+
                    Math.pow(bs5[2]-insPoint.getZ(),2));
            //第6个基站的距离
            double[] bs6=Constant.factoryBaseStationInfoMap.get("6");
            double dist6=Math.sqrt(Math.pow(bs6[0]-insPoint.getX(),2)+Math.pow(bs6[1]-insPoint.getY(),2)+
                    Math.pow(bs6[2]-insPoint.getZ(),2));
            //1
            sb.append(preStr);
            sb.append("1");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist1));
            sb.append(endStr);
            sb.append("\r\n");
            //2
            sb.append(preStr);
            sb.append("2");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist2));
            sb.append(endStr);
            sb.append("\r\n");
            //3
            sb.append(preStr);
            sb.append("3");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist3));
            sb.append(endStr);
            sb.append("\r\n");
            //4
            sb.append(preStr);
            sb.append("4");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist4));
            sb.append(endStr);
            sb.append("\r\n");
            //5
            sb.append(preStr);
            sb.append("5");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist5));
            sb.append(endStr);
            sb.append("\r\n");
            //6
            sb.append(preStr);
            sb.append("6");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist6));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
            if(i==0){
                System.out.println(insPoint.getX()+","+insPoint.getY()+","+insPoint.getZ());
                System.out.println(sb.toString());
            }
        }
        return testStr;
    }

    public static ArrayList<String> getCompanySendStrList(){
        ArrayList<String> testStr=new ArrayList<String>();
        ArrayList<Point> pointList=getCompanyPointList();
        for(int i=0;i<pointList.size();i++){
            Point insPoint=pointList.get(i);
            StringBuilder sb=new StringBuilder();
            //第一个基站的距离
            double[] bs1=Constant.companyBaseStationInfoMap.get("1");
            double dist1=Math.sqrt(Math.pow(bs1[0]-insPoint.getX(),2)+Math.pow(bs1[1]-insPoint.getY(),2)+
                    Math.pow(bs1[2]-insPoint.getZ(),2));
            //第2个基站的距离
            double[] bs2=Constant.companyBaseStationInfoMap.get("2");
            double dist2=Math.sqrt(Math.pow(bs2[0]-insPoint.getX(),2)+Math.pow(bs2[1]-insPoint.getY(),2)+
                    Math.pow(bs2[2]-insPoint.getZ(),2));
            //第3个基站的距离
            double[] bs3=Constant.companyBaseStationInfoMap.get("3");
            double dist3=Math.sqrt(Math.pow(bs3[0]-insPoint.getX(),2)+Math.pow(bs3[1]-insPoint.getY(),2)+
                    Math.pow(bs3[2]-insPoint.getZ(),2));
            //第4个基站的距离
            double[] bs4=Constant.companyBaseStationInfoMap.get("4");
            double dist4=Math.sqrt(Math.pow(bs4[0]-insPoint.getX(),2)+Math.pow(bs4[1]-insPoint.getY(),2)+
                    Math.pow(bs4[2]-insPoint.getZ(),2));
            //第5个基站的距离
            double[] bs5=Constant.companyBaseStationInfoMap.get("5");
            double dist5=Math.sqrt(Math.pow(bs5[0]-insPoint.getX(),2)+Math.pow(bs5[1]-insPoint.getY(),2)+
                    Math.pow(bs5[2]-insPoint.getZ(),2));
            //第6个基站的距离
            double[] bs6=Constant.companyBaseStationInfoMap.get("6");
            double dist6=Math.sqrt(Math.pow(bs6[0]-insPoint.getX(),2)+Math.pow(bs6[1]-insPoint.getY(),2)+
                    Math.pow(bs6[2]-insPoint.getZ(),2));
            //1
            sb.append(preStr);
            sb.append("1");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist1));
            sb.append(endStr);
            sb.append("\r\n");
            //2
            sb.append(preStr);
            sb.append("2");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist2));
            sb.append(endStr);
            sb.append("\r\n");
            //3
            sb.append(preStr);
            sb.append("3");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist3));
            sb.append(endStr);
            sb.append("\r\n");
            //4
            sb.append(preStr);
            sb.append("4");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist4));
            sb.append(endStr);
            sb.append("\r\n");
            //5
            sb.append(preStr);
            sb.append("5");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist5));
            sb.append(endStr);
            sb.append("\r\n");
            //6
            sb.append(preStr);
            sb.append("6");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist6));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
            if(i==0){
                System.out.println(insPoint.getX()+","+insPoint.getY()+","+insPoint.getZ());
                System.out.println(sb.toString());
            }
        }
        return testStr;
    }

    //模拟标签接收数据的过程
    public static ArrayList<String> getCompanyBsSendStrList(){
        ArrayList<String> testStr=new ArrayList<String>();
        ArrayList<Point> pointList=getCompanyPointList();
        for(int i=0;i<pointList.size();i++){
            Point insPoint=pointList.get(i);
            //第一个基站的距离
            double[] bs1=Constant.companyBaseStationInfoMap.get("1");
            double dist1=Math.sqrt(Math.pow(bs1[0]-insPoint.getX(),2)+Math.pow(bs1[1]-insPoint.getY(),2)+
                    Math.pow(bs1[2]-insPoint.getZ(),2));
            //第2个基站的距离
            double[] bs2=Constant.companyBaseStationInfoMap.get("2");
            double dist2=Math.sqrt(Math.pow(bs2[0]-insPoint.getX(),2)+Math.pow(bs2[1]-insPoint.getY(),2)+
                    Math.pow(bs2[2]-insPoint.getZ(),2));
            //第3个基站的距离
            double[] bs3=Constant.companyBaseStationInfoMap.get("3");
            double dist3=Math.sqrt(Math.pow(bs3[0]-insPoint.getX(),2)+Math.pow(bs3[1]-insPoint.getY(),2)+
                    Math.pow(bs3[2]-insPoint.getZ(),2));
            //第4个基站的距离
            double[] bs4=Constant.companyBaseStationInfoMap.get("4");
            double dist4=Math.sqrt(Math.pow(bs4[0]-insPoint.getX(),2)+Math.pow(bs4[1]-insPoint.getY(),2)+
                    Math.pow(bs4[2]-insPoint.getZ(),2));
            //第5个基站的距离
            double[] bs5=Constant.companyBaseStationInfoMap.get("5");
            double dist5=Math.sqrt(Math.pow(bs5[0]-insPoint.getX(),2)+Math.pow(bs5[1]-insPoint.getY(),2)+
                    Math.pow(bs5[2]-insPoint.getZ(),2));
            //第6个基站的距离
            double[] bs6=Constant.companyBaseStationInfoMap.get("6");
            double dist6=Math.sqrt(Math.pow(bs6[0]-insPoint.getX(),2)+Math.pow(bs6[1]-insPoint.getY(),2)+
                    Math.pow(bs6[2]-insPoint.getZ(),2));
            //1
            StringBuilder sb=new StringBuilder();
            sb.append(preStr);
            sb.append("1");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist1));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
            //2
            sb=new StringBuilder();
            sb.append(preStr);
            sb.append("2");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist2));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
            //3
            sb=new StringBuilder();
            sb.append(preStr);
            sb.append("3");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist3));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
            //4
            sb=new StringBuilder();
            sb.append(preStr);
            sb.append("4");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist4));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
            //5
            sb=new StringBuilder();
            sb.append(preStr);
            sb.append("5");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist5));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
            //6
            sb=new StringBuilder();
            sb.append(preStr);
            sb.append("6");
            sb.append(midStr);
            sb.append(String.format("%6d",(int)dist6));
            sb.append(endStr);
            sb.append("\r\n");
            testStr.add(sb.toString());
        }
        return testStr;
    }

    public static ArrayList<Point> getFactoryPointList() {
        ArrayList<Point> pointList=new ArrayList<Point>();
        double x=640; //单位为mm
        double y=400;//
        double step=300; //走路步伐为300mm一步
        int i;
        for (i=0;i<50;i++){
            pointList.add(new Point(x,y+i*step));
        }
        y=y+(i-1)*step;
        for(i=1;i<16;i++){
            pointList.add(new Point(x+i*step,y));
        }
        x=x+(i-1)*step;
        for(i=1;i<50;i++){
            pointList.add(new Point(x,y-i*step));
        }
        y=400;
        x=640+15*step;
        for(i=1;i<16;i++){
            pointList.add(new Point(x-i*step,y));
        }
        x=640;
        for(i=1;i<9;i++){
            pointList.add(new Point(x+i*step,y));
        }
        x=x+(i-1)*step;
        for(i =1;i<50;i++){
            pointList.add(new Point(x,y+i*step));
        }
        return pointList;
    }

    public static ArrayList<Point> getCompanyPointList(){
        ArrayList<Point> pointList=new ArrayList<Point>();
        //走廊轨迹从前台往会议室走12m
        double x=-600;
        double y=-2400;
        double step=300;//单位mm
        int i=0; //12000/300=40
        for(i=0;i<41;i++){
            pointList.add(new Point(x,y+i*step));
        }
        //从会议室往回走6.9米 6900/300=23
        y=y+12000;
        for(i=0;i<24;i++){
            pointList.add(new Point(x,y-i*step));
        }
        //从展厅大门走入展厅 8700/300=29
        y=y-23*step; //12000-6900-2400=5100-2400=2700m
        for(i=0;i<30;i++){
            pointList.add(new Point(x+i*step,y));
        }
        x=x+29*step;//-600+8700=8100
        //靠近机柜边缘走动
        for(i=0;i<2;i++){
            pointList.add(new Point(x,y=y-i*step));
        }
        //往门口方向走动 8700-2400-300=6000/300=20
        y=y-1*step;
        for(i=0;i<21;i++){
            pointList.add(new Point(x-i*step,y));
        }
        //往机柜后面走5步1.5m
        x=x-20*step;
        for(i=0;i<6;i++){
            pointList.add(new Point(x,y-i*step));
        }
        //在机柜后面走3.6m 12步
        y=y-5*step;
        for(i=0;i<12;i++){
            pointList.add(new Point(x+i*step,y));
        }
        //走出机柜
        x=x+11*step;
        for(i=0;i<12;i++){
            pointList.add(new Point(x-i*step,y));
        }
        //走出展厅
        x=x-11*step;
        for(i=0;i<9;i++){
            pointList.add(new Point(x,y+i*step));
        }
        y=y+8*step;
        for(i=0;i<11;i++){
            pointList.add(new Point(x-i*step,y));
        }

        x=x-10*step;
        for(i=0;i<18;i++){
            pointList.add(new Point(x,y-i*step));
        }
        return pointList;

    }
}
