package oopsConcept_Challenges;

public abstract class Shape {
//    Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
//    I/P - Rectangle: length=5, width=3; Circle: radius=4
//    O/P - Rectangle Area: 15.0 Circle Area: 50.26548245743669
//     Explanation:Abstract classes cannot be instantiated but can define common behavior. Subclasses must implement all abstract methods.
abstract double getArea();
}

class Area{
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1(5,3);
        Circle1 circle = new Circle1(4);
        System.out.println("Rectangle Area: "+ rect.getArea());
        System.out.println("Circle Area: "+ circle.getArea());
    }

}

class Rectangle1 extends Shape{
    private double length;
    private double breadth;

    public Rectangle1(double length, double breadth){
        this.length =length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length*breadth;
    }
}
 class Circle1 extends Shape{
    private double radius;
    final double pi = 3.14;

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     public Circle1(double radius){
        this.radius = radius;
    }


     @Override
     double getArea() {
         return pi*radius*radius;
     }
 }