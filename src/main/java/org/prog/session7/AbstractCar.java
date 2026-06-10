package org.prog.session7;

public abstract class AbstractCar implements ICar {

    private String color;

    public AbstractCar(String color) {
        this.color = color;
    }

    public void smth() {
        System.out.println("Abstract method");
    }

    public abstract void goTo(String destination);

    public void turnLeft(){
        System.out.println("Abstract left");
    }
}
