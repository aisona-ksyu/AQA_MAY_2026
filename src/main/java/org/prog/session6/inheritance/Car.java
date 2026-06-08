package org.prog.session6.inheritance;

public class Car {

    public String color;

    protected String childrenOnly;

    public Car(String color) {
        this.color = color;
    }

    public void goTo() {
        System.out.println("Car go to!");
    }

    public void turn(String direction) {
        something();
        System.out.println("Car turn " + direction);
    }

    private void something(){
        System.out.println("Car does something private");
    }
}
