package org.prog.session5;

public class Main {

    //TODO: Create class Plane
    //TODO: Class Plane must have max seats (200)
    //TODO: Create array of 50 Planes
    //TODO: Seat random number of passengers in each plane (up to 200)
    //TODO: Add method that will return % of free seats in plane as int
    //TODO* : sort planes by taken seats amount as %
    //TODO** : use bubble sort

    public static void main(String[] args) {
        Train train1 = new Train("A-1", 10);
        Train train2 = new Train("B-2", 45);
        Train train3 = new Train("C-3", 90);
        Train train4 = new Train("D-4", 455);
        System.out.println(train1.announcement());
        System.out.println(train2.announcement());
        System.out.println(train3.announcement());
        System.out.println(train4.announcement());

//        Car redCar = new Car();
//        Car blueCar = new Car();
//        redCar.color = "red";
//        blueCar.color = "blue";
//        redCar.maxSpeed = 100;
//        blueCar.maxSpeed = 150;
//        System.out.println(redCar.carInfo());
//        System.out.println(blueCar.carInfo());
//        System.out.println(redCar.calc(-20, 20));
//
//        System.out.println("testing: 0" + redCar.test(0));
//        System.out.println("testing: 1" + redCar.test(1));
//        System.out.println("testing: 2" + redCar.test(2));
//        System.out.println("testing: 3" + redCar.test(3));
//        System.out.println("testing: 4" + redCar.test(4));
//        System.out.println("testing: 5" + redCar.test(5));
//        System.out.println("testing: 6" + redCar.test(6));

//        Car[] cars1 = new Car[1000];
//
//        Random rand = new Random();
//
//        for (int i = 0; i < cars1.length; i++) {
//            cars1[i] = new Car();
//            cars1[i].color = "red";
//            cars1[i].maxSpeed = rand.nextInt(120);
//        }
//
//        for (int i = 0; i < cars1.length; i++) {
//            System.out.println(cars1[i].color + " " + cars1[i].maxSpeed);
//        }
//
//        int index = 0;
//        boolean swapped = false;
//
//        while (true) {
//            if (!swapped || index == 0) {
//                index++;
//            }
//            if (cars1[index].maxSpeed < cars1[index - 1].maxSpeed) {
//                swapped = true;
//                Car temp = cars1[index];
//                cars1[index] = cars1[index - 1];
//                cars1[index - 1] = temp;
//                index--;
//            } else {
//                swapped = false;
//            }
//            if (!swapped && index == cars1.length - 1) {
//                break;
//            }
//        }
//
//        for (int i = 0; i < cars1.length; i++) {
//            System.out.println(cars1[i].color + " " + cars1[i].maxSpeed);
//        }

//        System.out.println(cars1[0].color);
//        Car[] cars2 = {
//                new Car(), //0
//                new Car(), //1
//                new Car(), //2
//                new Car(), //3
//                new Car(), //4
//                new Car()  //5
//        };
//
//        for (int i = 0; i < cars2.length; i++) {
//            cars2[i].color = "red";
//        }
    }
}
