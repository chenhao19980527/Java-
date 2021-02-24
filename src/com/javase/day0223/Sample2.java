package com.javase.day0223;

import java.io.Serializable;

public class Sample2 {
    public static void main(String[] args) {
        int b;
        long c;
        c = 100 + 100L;
        byte a = 10;
        byte e = 10;
        int t;
        t = a+ e;
        double dou = 0.0 ;
        System.out.println(Double.isNaN(dou/0));
        System.out.println((12.0/0)==Double.POSITIVE_INFINITY);
        System.out.println((12.0%0)==Double.NaN);
        Serializable serializable = (a == e) ? true : 12;

        /*
        *       NaN 代表 不知道  俩个 NaN 进行 == 比较 一定是false
        *       ++ --  这两种操作不对数据进行类型提升
        * */
    }
}
