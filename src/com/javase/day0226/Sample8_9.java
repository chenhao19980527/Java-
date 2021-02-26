package com.javase.day0226;

public class Sample8_9 {
    public static void main(String[] args) {
        Fruit f = new Apply();
        // error ClassCastException;
//        Pear p = (Pear)f;
    }
}
class Fruit {

}
class Apply extends  Fruit {

}

class Pear extends Fruit {

}
