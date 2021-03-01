package com.javase.day0301;

/**
 * @author 陈浩
 */
public class Sample9_2 implements Flyer,IFEx{
    public static void main(String[] args) {
        AirPlane ap = new AirPlane();
        ap.setFlyHeight(Flyer.LOW);
    }
}
