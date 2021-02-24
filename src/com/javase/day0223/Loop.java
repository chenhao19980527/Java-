package com.javase.day0223;

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
       for(int j = init();condition(j);j++,update(j)){
           System.out.println(j);
       }
    }
    public static int init(){
        System.out.println("初始化");
        return 0;
    }
    public static boolean condition(int j){
        return j<2;
    }
    public static void update(int j){
        System.out.println("更新表达是"+j);
    }
}
