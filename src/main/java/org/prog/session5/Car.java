package org.prog.session5;

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

    public String carInfo() {
        return "This car has " + color + " color and its max speed is " + maxSpeed;
    }

    public int calc(int i, int j) {
        return i + j;
    }

    public String test(int i) {
        //6
        if (i <= 1) {
            return "a";
        }
        if (i <= 2) {
            return "b";
        }
        if (i <= 5) {
            return "c";
        }
        System.out.println("thinking");
        System.out.println("thinking more");
        System.out.println("thinking even more");
        return "d";
    }
}
