package oopsConcept_Challenges;

public class ExceptionHandling {
//    Implement exception handling for a program that divides two numbers and catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.
//    I/P - Division by zero, invalid number format, array index out of bounds
//    O/P - ArithmeticException: Cannot divide by zero NumberFormatException: Invalid number format ArrayIndexOutOfBoundsException: Array index out of bounds
//    Explanation:Multiple catch blocks can handle different types of exceptions that might occur in a try block.
public static void main(String[] args) {
    int a = 10;
    try {
        int b = a/0;
        System.out.println(b);
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException: Cannot divide by zero");
    }

    try {
        String name = "sumit";
        int c = Integer.parseInt(name);
    } catch (NumberFormatException e) {
        System.out.println("NumberFormatException: Invalid number format ");;
    }

    try {
        String ip = args[0];
        System.out.println(ip);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
    }

}
}
