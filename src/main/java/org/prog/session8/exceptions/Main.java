package org.prog.session8.exceptions;

import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("==========================");
        smth1("null");
        System.out.println("==========================");
    }

    public static void smth1(String s) {
        smth2(s);
    }

    public static void smth2(String s) {
        smth3(s);
    }

    public static void smth3(String s) {
        smth4(s);
    }

    public static void smth4(String s) {
        try {
            FileReader fileReader = new FileReader(s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("this always runs!");
        }
    }
}
