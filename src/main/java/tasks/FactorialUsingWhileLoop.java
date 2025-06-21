package tasks;

import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be calculated");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = 1;
            if (n == 0) {
                fact = 1;
            }

            if (n > Integer.MAX_VALUE) {
                System.out.println("I can't handle the number > Max of Int");
            }
            int i = 1;

            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }

}
