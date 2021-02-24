package com.javase.day0224;

import java.util.Arrays;

/**
 * @author 陈浩
 */
public class TestArray02 {
    public static void main(String[] args) {
        //二分查找 前提：数据是有序的
        int[] a = { 1, 3, 5, 6,7,8,9,34,45,67};
        int index = -1;
        int left = 0;
        int mid = -1;
        int right;
        int num = 45;
        // 数组终点下标
        right = a.length;
        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == num) {
                index = mid;
                break;
            } else if (a[mid] < num) {
                left = mid + 1;
            } else if (a[mid] > num) {
                left = mid - 1;
            }
        }
            if (index == -1) {
                System.out.println("数字 不存在 数组");
            }else {
                System.out.println( index + "===》 num 下标索引");
            }
        System.out.println(a[8]);
//        int[] b = {45 , 2, 4, 100 , 40};
        // Arrays 类中 binarySearch方法 折半查找算法 数组需要有序
        int i = Arrays.binarySearch(a, 45);
        System.out.println("Arrays方法"+i);
    }
}
