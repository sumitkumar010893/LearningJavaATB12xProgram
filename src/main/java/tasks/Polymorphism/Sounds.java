package tasks.Polymorphism;

public class Sounds {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.sound();
        cat.sound();
        cow.sound();
    }
}

class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("meow");
    }
}

class Cow extends Animal{
    @Override
    public void sound(){
        System.out.println("moo");
    }
}