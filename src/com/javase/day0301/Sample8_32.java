package com.javase.day0301;

public class Sample8_32 {
    public static void main(String[] args) {
        Car c = new Truck();
        c.startUp();
        c = new Mini();
        c.startUp();
    }
}
class Truck extends Car {

    @Override
    public void startUp() {
        System.out.println("卡车启动");
    }
}
class Mini extends  Car {

    @Override
    public void startUp() {
        System.out.println("迷你启动");
    }
}
