package org.prog.session4;

public class Car {
    //поле класса
    public String color;
    public int maxSpeed;

    //метод класса
    public void goTo(int distance) {
        System.out.println(color + " car starts engine");
        System.out.println(color + " car is going somewhere...");
        System.out.println(color + " car stops");
        if (maxSpeed > distance) {
            System.out.println("Cannot calculate time - car is too fast!");
        } else {
            System.out.println("Car will arrive in: " + distance / maxSpeed);
        }
    }
}
