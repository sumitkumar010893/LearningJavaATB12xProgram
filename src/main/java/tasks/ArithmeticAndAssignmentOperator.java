package tasks;

public class ArithmeticAndAssignmentOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = 10;
        System.out.println("x = " + x);     // = assignment
        x += 5;
        System.out.println("x += 5 => " + x);
        x -= 3;
        System.out.println("x -= 3 => " + x);
        x *= 2;
        System.out.println("x *= 2 => " + x);
        x /= 4;
        System.out.println("x /= 4 => " + x);
        x %= 3;
        System.out.println("x %= 3 => " + x);
    }

    }

