package org.prog.session7;

//TODO: Write interface IPhone that will have methods:
// - call(String contact)
// - unlock()
// - Add class Android and Apple that implement IPhone
// - Android unlock with fingerprint
// - Apple unlocks face id
// - call works the same
// - Android and Apple must have model name and color
// - write hashCode and equals for color and model name

public class Main {
    /**
     * #################################
     * #################################
     * ######[car1@Car]#################
     * ######[car2@Car]#################
     * #################################
     * ---------------------------------
     * ###########10####################
     * @param args
     */

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "red";
        car1.plateNumber = "1234";
        car2.plateNumber = "1234";
        car1.model = "Ford";
        car2.model = "Ford";

        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

//        Car car = new Car();
//        car.goTo("Poltava");
//        car.goTo("Kyiv", "Lviv");
//        car.goTo("Kyiv", "Odessa", "Dnipro");
//        Ford ford = new Ford("AA0000AA");
//        Mazda mazda = new Mazda();
//        ford.color = "red";
//        drive(ford);
//        drive(mazda);
    }

    public static void drive(ICar car) {
        System.out.println("Driving car with plate number " + car.getPlateNumber());
        car.turnLeft();
        car.turnRight();
    }
}
