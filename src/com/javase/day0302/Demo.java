package com.javase.day0302;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("");

        IntStream.range(1,10).forEach(i -> joiner.add(i+ ""));
        System.out.println(joiner.toString());
        joiner.add("Stringbuilder");
        System.out.println(joiner.length());

    }
}
