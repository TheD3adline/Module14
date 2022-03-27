package com.company;

public class Audi extends Car {

    public Audi(String model, int horsePower) {
        super(model, horsePower);
    }

    @Override
    public void openDoor() {
        System.out.println("You open the door (Audi)...");
    }
}
