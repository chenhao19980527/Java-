package com.javase.day0223;

public class LuoJiCaoZuoFu {
    public static void main(String[] args) {
        // 移位运算符 >>  << >>>
        // >>
        System.out.println(8>>1);
        // <<   左移几位  结果*2的几次方
        System.out.println(8<<1);
        // >>>
        System.out.println(-8>>>1);
        // 下面出现的情况是因为java 会先将 32 进行被移位数的取余  取余为0  自然 数值不变
        System.out.println(88>>32);
        long l = 67<<64;
        System.out.println(l);
        System.out.println(32%2);
        System.out.println(64%2);
    }
}
