package tasks;

import java.util.Scanner;

public class LargestOfThreeNum {
//    Create a program to find the largest among three numbers using if-else statements.
public static void main(String[] args) {
    System.out.println("Enter first integer value ");
    Scanner scanner = new Scanner(System.in);
    if(!scanner.hasNextInt()){
        System.out.println("Invalid input! Enter a valid integer value");
        return;
    }
    int a = scanner.nextInt();
    System.out.println("Enter second Integer value ");
    if(!scanner.hasNextInt()){
        System.out.println("Invalid input! Enter a valid integer value");
        return;
    }
    int b = scanner.nextInt();
    System.out.println("Enter third Integer value ");
    if(!scanner.hasNextInt()){
        System.out.println("Invalid input! Enter a valid integer value");
        return;
    }
    int c = scanner.nextInt();
    if (a == b && b == c) {
        System.out.println("All three numbers are equal: " + a);
    } else if (a >= b && a >= c) {
        if ((a == b && a > c) || (a == c && a > b)) {
            System.out.println("Two numbers are equal and largest: " + a);
        } else {
            System.out.println("The largest number is: " + a);
        }
    } else if (b >= a && b >= c) {
        if ((b == a && b > c) || (b == c && b > a)) {
            System.out.println("Two numbers are equal and largest: " + b);
        } else {
            System.out.println("The largest number is: " + b);
        }
    } else {
        if (c == a && c > b || c == b && c > a) {
            System.out.println("Two numbers are equal and largest: " + c);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }

}
}
