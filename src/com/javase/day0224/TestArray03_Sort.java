package com.javase.day0224;

import java.util.Arrays;

/**
 * @author 陈浩
 */
public class TestArray03_Sort {
    public static void main(String[] args) {
        //冒泡排序法
        int[] a = {45 ,5 , 4 ,3,89,23,54};
        int tamp;
        for (int i=0; i<a.length-1;i++){
            for (int j = i+1;j<a.length;j++){
                if(a[i] > a[j]) {
                    tamp = a[i];
                    a[i] = a[j];
                    a[j] = tamp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i+ " ");

        }
        int[] b = {45 ,5 , 4 ,3,89,23,54};
        Arrays.sort(b);
        for (int i : b) {
            System.out.print(i);
        }
        boolean equals = a.equals(b);
        System.out.println(Arrays.equals(a, b));


    }
}
