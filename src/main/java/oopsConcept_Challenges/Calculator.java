package oopsConcept_Challenges;

public class Calculator {
//    Write a program to demonstrate method overloading by creating multiple "add" methods with different parameters.
//    I/P - add(5, 3), add(2.5, 3.7), add(1, 2, 3)
//    O/P -Integer addition: 8 Double addition: 6.2 Three integers addition: 6
//     Explanation:Method overloading allows multiple methods with the same name but different parameter lists in the same class.
public static void add(int a,int b){
    System.out.println("Integer addition: "+(a+b));
}
public static void add(double a,double b){
    System.out.println("Double addition: "+(a+b));
}
public static void add(int a,int b,int c){
    System.out.println("Three Integers addition: "+(a+b+c));
}

    public static void main(String[] args) {
        add(5,3);
        add(2.5,3.7);
        add(1,2,3);
    }

}
