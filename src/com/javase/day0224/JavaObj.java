package com.javase.day0224;

import java.util.Date;

/**
 * @author 陈浩
 */
public class JavaObj {
    public static void main(String[] args) {
        // 面向对象  oo oop
        /*      需要注意对象的引用地址 以及对象 是否初始化
        * */

        Date date = new Date();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date birdate = new Date();
        System.out.println(date);
        System.out.println(birdate);
        if (birdate.after(date)) {
            System.out.println(true);
        }
        
    }
}
