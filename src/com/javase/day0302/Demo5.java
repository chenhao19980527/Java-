package com.javase.day0302;

/**
 * @author 陈浩
 */
public class Demo5 {
    public static void main(String[] args) {
        new Bird();
    }
}
class Animal1 {
    public Animal1() {
        System.out.println("zhu");
    }
}
class Bird extends Animal1{
    public Bird() {
        System.out.println("bird");
    }
}
