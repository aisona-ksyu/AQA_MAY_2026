package org.prog.session5;

import java.util.Random;

public class MainPlane {

    public static void main(String[] args) {

        Random rand = new Random();

        Plane[] planes = new Plane[50];

        for (int i = 0; i < planes.length; i++) {
            planes[i] = new Plane(rand.nextInt(201));
        }

        System.out.println("Percentage of Free Seats:");

        for (int i = 0; i < planes.length; i++) {
            System.out.println(planes[i].announcement());
        }

        int index = 0;
        boolean swapped = false;

        while (true) {

            if (!swapped || index == 0) {
                index++;
            }

            if (planes[index].getTakenSeatsPercent()
                    < planes[index - 1].getTakenSeatsPercent()) {

                swapped = true;

                Plane temp = planes[index];
                planes[index] = planes[index - 1];
                planes[index - 1] = temp;

                index--;

            } else {
                swapped = false;
            }

            if (!swapped && index == planes.length - 1) {
                break;
            }
        }

        System.out.println();
        System.out.println("List of Planes sorted by taken seats:");

        for (int i = 0; i < planes.length; i++) {
            System.out.println(planes[i].announcement());
        }
    }
}