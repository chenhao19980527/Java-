package com.javase.day0301;

/**
 * @author 陈浩
 */
public class Sample8_29 {
    public static void main(String[] args) {
//        Car c = new Car(); 无法实例化
        Audi_A6 a6 = new Audi_A6();
        a6.startUp();
        a6.turbo();
    }
}
abstract class Car {
    private double price;
    private String brand;
    private int speed;
    public abstract void startUp();
    public double getPrice() {
        return this.price;
    }
}
abstract class Audi extends Car {
    public abstract void turbo();
}
class Audi_A6 extends Audi{

    @Override
    public void startUp() {
        System.out.println("调用了奥迪A6的启动功能!!");
    }

    @Override
    public void turbo() {
        System.out.println("加速加速");
    }
}
