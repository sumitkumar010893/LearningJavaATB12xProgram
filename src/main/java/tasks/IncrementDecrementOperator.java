package tasks;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Initial value of a: " + a);

        // Post-increment
        System.out.println("Post-increment (a++):");
        System.out.println( a++); // Prints current value, then increments - 5
        System.out.println(a); // 6

        // Pre-increment
        System.out.println("Pre-increment (++a):");
        System.out.println(++a); // Increments first, then prints ++a-> 7
        System.out.println(a); // a ->7

        // Post-decrement
        System.out.println("Post-decrement (a--):");
        System.out.println( a--); // Prints current value, then decrements // a->7
        System.out.println(  a); // a->6

        // Pre-decrement
        System.out.println("Pre-decrement (--a):"); //a->6
        System.out.println( --a); // Decrements first, then prints a->5
        System.out.println(a); // a ->5
    }
}
