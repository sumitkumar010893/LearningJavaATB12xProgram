package tasks.Ifelse_june19th;

import java.util.Scanner;

public class IfElse_Task2 {
//    2)Check if a Number is Even or Odd.
public static void main(String[] args) {
    System.out.println("Enter a valid integer value");
    Scanner scanner = new Scanner(System.in);

    if(!scanner.hasNextInt()){
        System.out.println("Invalid input! Enter a valid integer value");
        System.exit(0);
    }
    int number = scanner.nextInt();
    if (number%2 ==0){
        System.out.println(number+" is even number");
    }else{
        System.out.println(number+ " is odd number");
    }
}
}
