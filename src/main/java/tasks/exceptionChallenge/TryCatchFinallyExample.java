package tasks.exceptionChallenge;

import java.util.Scanner;

public class TryCatchFinallyExample {
//    Write a program that demonstrates try-catch-finally block with division operation.
//    I/O - (10, 2) , (10,0)
//    o/p -Result: 5 Finally block executed, Error: Cannot divide by zero Finally block executed
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter numerator: ");
    int num = scanner.nextInt();

    System.out.print("Enter denominator: ");
    int denom = scanner.nextInt();

    try {
        int result = num/ denom;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Error: Cannot divide by zero");
    } finally {
        System.out.println("Finally block executed");
    }

    scanner.close();
}

}

