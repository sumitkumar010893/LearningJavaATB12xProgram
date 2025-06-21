package tasks;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculatorBySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter an operation (add, subtract, multiply, divide) ");
        String operator = scanner.next();
        operator = operator.toLowerCase();

        double result;

        switch (operator) {
            case "add":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case "subtract":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case "multiply":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case "divide":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operation! Please use (add, subtract, multiply, divide) ");
        }
    }
}
