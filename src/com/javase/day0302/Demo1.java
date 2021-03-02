package com.javase.day0302;

/**
 * @author 陈浩
 */
public class Demo1 {
    public static void main(String[] args) {
        Food f = new Apple();
        f.doEat();
        f = new Beef();
        f.doEat();
    }
}
// 食物
interface Food {
    public void doEat();
}
// 水果抽象类
abstract class Fruit {

}
// 抽象肉类
abstract class Meat {

}
class Apple extends Fruit implements Food{

    @Override
    public void doEat() {
        System.out.println("吃苹果");
    }
}
class Beef extends Meat implements Food{

    @Override
    public void doEat() {
        System.out.println("吃肉");
    }
}

