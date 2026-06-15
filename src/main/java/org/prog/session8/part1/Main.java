package org.prog.session8.part1;

public class Main {



    public static void main(String[] args) {
        final Car[] carParking = new Car[10];
        final int i = 10;


        final Car car = new Car();
        car.color = "red";
        System.out.println(car.color);
        car.color = "green";
        System.out.println(car.color);
        car.color = "blue";
        System.out.println(car.color);

//        Car.brandName = "BMW";
//        Car car = new Car();
//        drive(car);
//        transport(car);
//
//        Car car1 = new Car();
//        Car car2 = new Car();
//        System.out.println(car.color);
//        System.out.println(car.brandName);
//        System.out.println(car1.color);
//        System.out.println(car1.brandName);
//        System.out.println(car2.color);
//        System.out.println(car2.brandName);
    }

    public static void drive(ICar car) {
        car.goTo("Odessa");
        car.turnRight();
        car.turnLeft();
    }

    public static void transport(ITransport transport) {
        transport.boardPassengers(10);
        transport.goTo("Lviv");
    }
}
