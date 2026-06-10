package org.prog.session7;

public class Ford implements ICar {

    private String plateNumber;
    public String color;

    public Ford(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Ford(String plateNumber, String color) {
        this.plateNumber = plateNumber;
        this.color = color;
    }

    @Override
    public void turnLeft() {
        System.out.println("Ford turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Ford turns right");
    }

    @Override
    public String getPlateNumber() {
        return plateNumber;
    }
}
