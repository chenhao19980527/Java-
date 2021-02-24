package com.javase.day0224;

import static java.lang.System.*;

public class TestArray {
    public static void main(String[] args) {
        boolean[] bs = {true,true,true};
        // 数组定义初始化 数据类型 0 char \u0000 逻辑类型 false
        boolean[] bs1 = new boolean[3];
        //1 复制数组参数1被复制数组对象 参数2 开始位置 参数3 新数组对象 参数四 开始位置 参数五 复制个数
        arraycopy(bs,0,bs1,0,2);
        for (boolean b : bs1) {
            out.println(b);

        }
        //数组在堆栈上的不同

        //数组修饰符
        String[][] list = {{"peng","钢笔"},{"pencil","铅笔"},{"rule","赤字"}};
        String steE = "peng";
        String strC ="";
        int flag = 0;
        for (int i=0;i<list.length;i++){
            if (list[i][0].compareTo(steE)==0){
                strC = list[i][1];
                out.println(strC);
                flag = 1;
                break;
            }
        }
        if (flag==0) {
            out.println("没有找到中文字义");
        }
    }
}
