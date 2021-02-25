package com.javase.day0225;

public class FinalArrayDemo {
    private final String[] names;

    public FinalArrayDemo() {
        names = new String[]{"Jack","Mike","Tom"};
    }
    public void printArray() {
        for (int i = 0 ;i< names.length;i++){
            System.out.println(names[i]);
        }
    }
    public void changeArray(){
        names[0] = "chenhao";
    }

    public static void main(String[] args) {
        FinalArrayDemo finalArrayDemo = new FinalArrayDemo();
        finalArrayDemo.printArray();
        finalArrayDemo.changeArray();
        finalArrayDemo.printArray();
    }
}
