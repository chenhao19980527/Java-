package com.javase.day0301;

public class Sample9_1 {
    public static void main(String[] args) {
//        IFEx.intConst1 == IFEx.intConst1 + 1;
    }
}
interface IFEx {
    int intConst1 = 12;
    public static  final  int intConst2 = 23;
}
interface Flyer{
    int HIGHT = 1;
    int MIDDLE = 2;
    int LOW = 3;
}
class AirPlane implements Flyer {
    public void setFlyHeight(int height){
        switch (height) {
            case HIGHT:
                System.out.println("高空飞行");
                break;
            case MIDDLE:
                System.out.println("中空飞行");
                break;
            case LOW :
                System.out.println("低空飞行");
                break;
        }
    }
}

