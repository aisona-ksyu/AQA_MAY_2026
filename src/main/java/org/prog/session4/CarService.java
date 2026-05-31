package org.prog.session4;

public class CarService {

    public void paintCar(Car car, String color) {
        System.out.println("Car color pre paint: " + car.color);
        System.out.println("Preparing car for repaint...");
        System.out.println("Repainting...");
        car.color = color;
        System.out.println("Car color changed. New color " + car.color);
    }
}
