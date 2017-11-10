package com.keydak.bletest;

/**
 * Created by admin on 2017/10/31.
 */

public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
        this.z=1000.0;
    }
    public Point(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x=x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y=y;
    }

    public double getZ(){
        return this.z;
    }

    public void setZ(double z){
        this.z=z;
    }
}
