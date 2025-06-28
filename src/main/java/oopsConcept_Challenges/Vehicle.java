package oopsConcept_Challenges;

public class Vehicle {
//    Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.
//    I/P - Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
//    o/P - Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
//    Explanation:Demonstrate runtime polymorphism where the actual method called depends on the object type, not the reference type.
    void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting with key ignition");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is starting with self-start button");
    }
}

class VehicleDemo{
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike()};

        for (Vehicle v : vehicles){
            v.start();
        }
    }
}
