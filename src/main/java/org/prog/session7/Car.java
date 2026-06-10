package org.prog.session7;

public class Car {

    public String color;
    public String model;
    public String plateNumber;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return this.color.equals(car.color) &&
                    this.model.equals(car.model) &&
                    this.plateNumber.equals(car.plateNumber);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (color + model + plateNumber).hashCode();
    }

    public void goTo(String destination) {
        goTo("Current location", destination);
    }

    public void goTo(String from, String destination) {
        goTo(from, destination, "nowhere");
    }

    public void goTo(String from, String destination, String stoppingAt) {
        System.out.println("Car is going to " + destination + " from "
                + from + " stopping at " + stoppingAt);
    }
}
