package tasks.exceptionChallenge;

public class AutoBoxingAndUnBoxingExample {
//    Demonstrate autoboxing and unboxing with integer
//    i/p -int value = 10 ;
//    Autoboxed: 10; Unboxed: 10
    public static void main(String[] args) {
        int value = 10;
        Integer b = value; // Autoboxing
        System.out.println("Autoboxed: "+b);
        int a = b; // Unboxing
        System.out.println("Unboxed: "+a);
    }
}
