package com.javase.day0225;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LocalFinalDemo {
    public LocalFinalDemo(String s) {
        JFrame f;
        f = new JFrame(s);
        f.setSize(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container;
        container = f.getContentPane();
        JButton b;
        b = new JButton("Button");
        JLabel l;
        l = new JLabel("Label");
        container.add(b);
        container.add(l);
        f.setVisible(true);
        l.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                b.requestFocus();
                System.out.println( " Typed");
            }
        });
    }

    public static void main(String[] args) {
        LocalFinalDemo localFinalDemo = new LocalFinalDemo("1");

    }
}
