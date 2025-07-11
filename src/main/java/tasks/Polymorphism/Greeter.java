package tasks.Polymorphism;

public class Greeter {
    public void greet(){
        System.out.println("Hello!");
    }

    public void greet(String name){
        System.out.println("Hello, "+name +"!");
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Sumit");
    }
}
