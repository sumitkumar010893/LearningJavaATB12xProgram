package tasks.exceptionChallenge;

public class ExceptionPropagationExample {
//    Show how an exception propagates through method calls
//    I/P - Chain of method calls with division by zero
//    O/P - Exception caught in main method
    static  void method1(){
        method2();
    }
    static void method2(){
        method3();
    }
    static void method3(){
        int result = 10/0;
        System.out.println("Result: "+ result);
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main method");;
        }
    }
}
