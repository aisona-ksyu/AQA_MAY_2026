package org.prog.session5;


public class Plane {

    public int maxSeats;
    public int passengers;

    public Plane(int passengers) {
        this.passengers = passengers;
        maxSeats = 200;
    }

    public int getFreeSeatsPercent() {
        return (maxSeats - passengers) * 100 / maxSeats;
    }

    public int getTakenSeatsPercent() {
        return passengers * 100 / maxSeats;
    }

    public String announcement() {
        return "Plane has " + passengers + " passengers, " + getFreeSeatsPercent() + "% free seats";
    }
}
