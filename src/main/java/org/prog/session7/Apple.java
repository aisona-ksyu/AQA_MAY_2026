package org.prog.session7;

import java.util.Objects;

public class Apple implements Phone {

    private String model;
    private String color;

    public Apple(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void unlock() {
        System.out.println(color + " " + model + " undlocked with Face ID.");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Objects.equals(model, apple.model) && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public void call(String contact) {
        System.out.println(color + " " + model + " is calling " + contact);

    }
}

