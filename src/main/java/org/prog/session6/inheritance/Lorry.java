package org.prog.session6.inheritance;

public class Lorry extends Truck {

    public Lorry(String color) {
        super(color);
    }

    public void turn(String direction) {
        System.out.println("Long vehicles turns differently: " + direction);
    }
}
