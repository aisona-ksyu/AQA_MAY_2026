package org.prog.session5;

public class Main2 {

    public static void main(String[] args) {
        int[] ints = new int[456];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
