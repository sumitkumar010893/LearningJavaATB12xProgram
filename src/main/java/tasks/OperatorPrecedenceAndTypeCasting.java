package tasks;

public class OperatorPrecedenceAndTypeCasting {

    public static void main(String[] args) {

        // Operator Precedence
        int result = (9* 3 / 9 + 1) * 3;
        System.out.println(result);

        // Type Casting


        // Implicit Casting (Widening)
        byte b = 20;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        System.out.println(a);// Implicit - Casting - Widening

        // Explicit Casting (Narrowing)
        double pi = 3.14159;
        int intPi = (int) pi;       // double -> int
        System.out.println(intPi);

    }
}
