package org.prog.session6.inheritance;

public class SelfPropelledCart extends DonkeyWithCart {

    public void goTo(){
        System.out.println("This cart moves on its own!");
    }

    public void fuelTransport(){
        System.out.println("Fuel transport!");
    }
}
