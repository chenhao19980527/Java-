package com.javase.day0301;

/**
 * @author 陈浩
 */
public class Sample8_28 {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
    }
}
class Father {
    public final void  show() {
        System.out.println("final 方法 可以继承 , 但是不能重写");
    }
}
class Son extends Father {
//    public void show() {
//
//    }
}
