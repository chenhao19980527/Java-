package com.javase.day0301;

public class Sample9_4 {
    public static void main(String[] args) {
        CEx c = new CEx();
        IFEx1 ifEx1 = c;
        c = (CEx) ifEx1;
//        error:
//        IFEx2 ifEx2 = c;
//        String s = (String)ifEx1;
    }
}
interface IFEx1{
//    public final void fly();error
}
interface IFEx2{

}
class CEx implements  IFEx1 {

}
