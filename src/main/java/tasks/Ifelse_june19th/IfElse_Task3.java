package tasks.Ifelse_june19th;

import java.util.Scanner;

public class IfElse_Task3 {
    // 3) Find the Maximum of Two Numbers.
    public static void main(String[] args) {
        System.out.println("Enter first integer value ");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input! Enter a valid integer value");
            return;
        }
        int num1 = scanner.nextInt();
        System.out.println("Enter second Integer value ");
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input! Enter a valid integer value");
            return;
        }
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("Maximum number is "+ num1);
        } else if (num2>num1) {
            System.out.println("Maximum number is "+num2);
        }else {
            System.out.println("Both numbers are equal");
        }
    }
}
