package com.company;

public class VW extends Car {

    public VW(String model, int horsePower) {
        super(model, horsePower);
    }

    @Override
    public void openDoor() {
        System.out.println("You open the door (VW)...");
    }
}
