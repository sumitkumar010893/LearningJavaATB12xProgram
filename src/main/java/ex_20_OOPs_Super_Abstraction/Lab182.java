package ex_20_OOPs_Super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car car = new Car(100);
        car.display();

    }
}
class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }
    Vehicle(){
        System.out.println("Default const");
    }
    Vehicle(int a){
        System.out.println("Param const");
    }
    Vehicle(int a, int b){
        System.out.println("Param const");
    }
    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, no argument");
    }
    void message(int a){
        System.out.println("PC - argument");
    }
    void display(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    void test(){}

    Car(int a){
        System.out.println("PC Car");
    }
@Override
    void display(){
    System.out.println("Override of Car!");
    System.out.println(super.maxSpeed);
    System.out.println(this.maxSpeed);
    super.noTest();
    this.test();
}
}
