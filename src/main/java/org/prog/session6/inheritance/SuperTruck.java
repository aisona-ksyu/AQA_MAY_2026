package org.prog.session6.inheritance;

public class SuperTruck extends Lorry {

    public SuperTruck(String color) {
        super(color);
    }

    public void deliverSuperCargo() {
        childrenOnly = "yes";
        System.out.println("super cargo!");
    }
}
