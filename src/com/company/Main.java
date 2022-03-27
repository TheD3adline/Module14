package com.company;

public class Main {

    public static void main(String[] args) {

        Audi audi1 = new Audi("A3", 300);
        VW vw1 = new VW("Golf 7", 180);

        vw1.refuel();
        vw1.openDoor();
        vw1.drive();

        System.out.println();

        audi1.refuel();
        audi1.openDoor();
        audi1.drive();
    }

    //Abstract classes behave like normal classes with the exception that they can't be instantiated themselves, which helps to keep the code clean and reduce coding errors
    //They can also include abstract methods and also regular methods to be inherited and defined later by their child classes
    //Best used as "base" classes like for example a Car > Audi / VW inheritance hierarchy. Makes sure classes that are only used for inheritance can't be instantiated

    //Interfaces compared to that can obviously also not be instantiated themselves, but the main differences to abstract classes are that they can only include constants as data types, (aka final)
    //They can also have abstract methods, but not regular ones
    //Best used to give functions and attributes to other classes that implement them
}
