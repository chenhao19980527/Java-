package com.javase.day0302;

/**
 * @author 陈浩
 */
public class Demo3 {
    public static void main(String[] args) {
        Son s = null;
        if(s instanceof Father){

        }
        if (s instanceof Son) {

        }
        int[] intArray = null;
        if (intArray instanceof int[]){}

    }
}
class Father {}
class Son extends Father{}

