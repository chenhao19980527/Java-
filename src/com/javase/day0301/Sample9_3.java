package com.javase.day0301;

import javax.swing.*;

public class Sample9_3 {
    JavaDeveloper jd = new Person();
    Developer d = jd;
}
interface  Developer {

}
interface JavaDeveloper extends Developer {

}
interface Lecturer {

}
class Person implements JavaDeveloper {

}

