package com.javase.day0226;

public class Sample8_10 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println("调用结果");
        v.getMe();
    }
}
class  Father {}
class Son extends Father {}
class Vehicle {
    public Father getMe() {
        Father f = new Father();
        System.out.println("方法没有成功重写");
        return f;
    }
}
class Car extends Vehicle {
    @Override
    public Son getMe() {
        Son s = new Son();
        System.out.println("方法重写成功");
        return s;
    }
}
