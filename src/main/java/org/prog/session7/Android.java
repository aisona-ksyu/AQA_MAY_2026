package org.prog.session7;

import java.util.Objects;

public class Android implements Phone{

    private String model;
    private String color;

    public Android (String model, String color){
    this.model = model;
    this.color = color;
    }



    @Override
    public void unlock() {
System.out.println(color + " " + model + " undlocked with fingerprint.");
    }


    @Override
    public void call(String contact) {
        System.out.println(color + " " + model + " is calling " + contact);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Android android = (Android) obj;
        return Objects.equals(model, android.model) && Objects.equals(color, android.color);
    }

      @Override
    public int hashCode() {
        return (color + model).hashCode();
    }


}
