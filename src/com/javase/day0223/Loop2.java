package com.javase.day0223;

public class Loop2 {
    public static void main(String[] args) {
        label : for (int i = 0; i<10;i++){
//                continue
                break label;
        }
    }
}
