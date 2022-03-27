package com.company;

public abstract class Car implements Refuelable {

    private String model;
    private int horsePower;

    public Car(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    public void drive() {
        System.out.println("The car drives...");
    }

    public void refuel() {
        System.out.println("You refuel the car...");
    }

    public abstract void openDoor();
}
