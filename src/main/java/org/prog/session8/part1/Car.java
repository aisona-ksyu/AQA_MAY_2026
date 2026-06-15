package org.prog.session8.part1;

public class Car implements ICar, ITransport {
    public static String brandName;
    public String color;

    public static final int i = 10;

    public final void smth() {
        System.out.println("smth");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
        brandName = "red";
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Going to " + destination);
    }

    @Override
    public void boardPassengers(int amount) {
        System.out.println("Boarding : " + amount);
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning right");
    }
}
