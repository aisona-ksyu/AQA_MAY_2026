package org.prog.session6.incapsulation;

import org.prog.session6.inheritance.SuperTruck;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.color = null;
        car.setEngine(null);
        car.goTo("Odessa");
    }
}
