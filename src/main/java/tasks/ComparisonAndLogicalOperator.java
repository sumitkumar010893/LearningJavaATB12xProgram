package tasks;

public class ComparisonAndLogicalOperator {
//    Write a program that demonstrates comparison and logical operators.
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b : " + (a == b));   // false
        System.out.println("a != b : " + (a != b));   // true
        System.out.println("a < b  : " + (a < b));    // true
        System.out.println("a > b  : " + (a > b));    // false
        System.out.println("a <= b : " + (a <= b));   // true
        System.out.println("a >= b : " + (a >= b));   // false

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators:");
        System.out.println("x && y : " + (x && y));   // false
        System.out.println("x || y : " + (x || y));   // true
        System.out.println("!x     : " + (!x));       // false
        System.out.println("!y     : " + (!y));       // true
    }
}
