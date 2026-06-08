package org.prog.session6.incapsulation;

public class Car {

    public String color;
    private Engine engine;

    public Car() {
        this.engine = new Engine();
        this.engine.volume = "2.0";
        this.color = "red";
    }

    public void goTo(String destination) {
        startEngine();
        System.out.println(color + " car is going to " + destination);
    }

    public void setEngine(Engine engine) {
        if (engine != null && engine.volume != null) {
            this.engine = engine;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    private void startEngine() {
        System.out.println("Inserting ignition key...");
        System.out.println("Rotate key...");
        engine.startEngine();
    }
}
