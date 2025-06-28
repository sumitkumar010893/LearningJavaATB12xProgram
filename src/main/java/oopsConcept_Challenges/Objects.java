package oopsConcept_Challenges;

public class Objects {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        Parent parent = new Parent();
        Child child = new Child();
        parent.display();
        child.display();
    }
}
