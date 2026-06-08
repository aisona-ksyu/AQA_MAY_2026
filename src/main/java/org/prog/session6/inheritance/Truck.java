package org.prog.session6.inheritance;

public class Truck extends Crossover {

    public Truck(String color) {
        super(color);
    }

    public void deliverCargo(){
        System.out.println("Deliver Cargo!");
    }
}
