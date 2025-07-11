package tasks;

public class AnimalSoundSimulator {
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.meow();
        mycat.makeSound();
    }
}

class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("Cat Sound");
    }
}