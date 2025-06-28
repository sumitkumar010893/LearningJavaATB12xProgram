package tasks.exceptionChallenge;

public class CatchMultipleExceptions {
//    Write a program that catches both 'ArithmeticException' and 'ArrayIndexOutOfBoundException'
//    I/P - Division by zero in array operation
//    O/P -Exception caught: Arithmetic Exception or ArrayIndexOutOfBoundException
public static void main(String[] args) {

    try {
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = a/0;
        System.out.println(b);
    } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
        System.out.println(e.getMessage());
    }

}
}
