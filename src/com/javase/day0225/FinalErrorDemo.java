package com.javase.day0225;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 陈浩
 */
public class FinalErrorDemo {
    private final FileInputStream in;

//    public FinalErrorDemo() {
//
//        try{
//            in = new FileInputStream("in.txt");
//        }catch (Exception e){
//            try {
//                in = new FileInputStream("error.text");
//            }catch (FileNotFoundException e1){
//                e1.printStackTrace();
//            }
//        }
//    }


    public FinalErrorDemo()  {
        FileInputStream temp = null;
        try {
            temp = new FileInputStream("in.text");
        }catch (FileNotFoundException e) {
            try {
                temp = new FileInputStream("error.text");
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        }
        in = temp;
    }
}
