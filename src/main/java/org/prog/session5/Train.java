package org.prog.session5;

public class Train {
    public String id;
    public int maxSeats;
    public int passengers;

    public Train(String id, int passengers) {
        this.id = id;
        this.passengers = passengers;
        maxSeats = 500;
    }

    public int getFreeSeats() {
        return maxSeats - passengers;
    }

    public String announcement() {
        return "Train " + id + " has " + getFreeSeats() + " seats available";
    }
}
