package com.javase.day0224;

/**
 * @author 陈浩
 * desc: 快速排序
 */
public class TestArraySort02 {
   private double[] theArray;
   private int nElems;

    public TestArraySort02(int max) {
        theArray = new double[max];
        nElems = 0;
    }
    public void insert(double value) {
        theArray[nElems] = value;
        nElems++;
    }
    public void display() {
        for (double v : theArray) {
            System.out.print(" " + v);
        }
    }
    public void quickSort() {
        recQuickSort(0,nElems-1);
    }
    public void recQuickSort(int left ,int right) {
        if (right - left <= 0){
            return;
        }else {
            // 获取最右元素值
            double pivot = theArray[right];
            int partition = partitionIt(left,right,pivot);
            recQuickSort(left,partition-1);
            recQuickSort(partition+1,right);
        }
    }
    public int partitionIt(int left ,int right,double pivot) {
        int leftPtr = left -1;
        int rightPtr = right;
        while (true) {
            while (theArray[++leftPtr] < pivot){
//                while (rightPtr > 0 && theArray[--rightPtr] > pivot);
            }
        }
    }
}

