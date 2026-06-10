package org.prog.session7;

public class Mazda implements ICar {
    @Override
    public void turnLeft() {
        System.out.println("Mazda turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Mazda turns right");
    }

    @Override
    public String getPlateNumber() {
        return "FACTORY_DEFAULT";
    }
}
