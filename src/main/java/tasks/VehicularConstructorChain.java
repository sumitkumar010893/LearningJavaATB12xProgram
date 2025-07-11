package tasks;

public class VehicularConstructorChain {
    public static void main(String[] args) {
        Bike bike = new Bike();
    }
}

class Vehicle{
    public Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    public Bike(){
        System.out.println("Bike is ready");
    }
}