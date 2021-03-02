package com.javase.day0302;

/**
 * @author 陈浩
 */
public class Demo2 {
    public static void main(String[] args) {
        MyMoniter mm = new MyMoniter();
        ProcessorA pa = new ProcessorA();
        ProcessorB pb = new ProcessorB();
        mm.getListener(pa);
        mm.generalProcessEvent();
        mm.getListener(pb);
        mm.generalProcessEvent();
        if(pa instanceof ProcessorA){
            System.out.println("ProcessorA类型");
        }
        if(pa instanceof MyListener) {
            System.out.println("监听类");
        }
    }
}
interface MyListener {
    void specialProcessEvent();
}
class MyMoniter{
    MyListener myListener;
    // 注册监听器方法
    public void getListener(MyListener myListener) {
        this.myListener = myListener;
    }
    //事件处理方法
    public void generalProcessEvent() {
        this.myListener.specialProcessEvent();
    }
}
class ProcessorA implements MyListener{

    @Override
    public void specialProcessEvent() {
        System.out.println("采用A策略处理事件");
    }
}
class ProcessorB implements MyListener{

    @Override
    public void specialProcessEvent() {
        System.out.println("采用B策略处理事件");
    }
}

