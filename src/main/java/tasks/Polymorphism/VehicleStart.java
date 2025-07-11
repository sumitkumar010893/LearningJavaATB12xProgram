package tasks.Polymorphism;

public class VehicleStart {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        bike.start();
        car.start();
    }
}

class Vehicle{
    public void start(){
        System.out.println("Start the Vehicle");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Turn the key to start the car");
    }
}