package com.javase.day0302;

/**
 * @author 陈浩
 */
public class Demo4 {
    public static void main(String[] args) {
        Animal animal = Animal.getMe();
    }
}
class Animal {
    private Animal(){
        System.out.println("私有类型构造器");
    }
    public static Animal getMe() {
        return new Animal();
    }
}