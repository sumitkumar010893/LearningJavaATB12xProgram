package tasks;

import java.util.Scanner;

public class NumberClassification {
//    Write a program to check if a number is positive, negative, or zero.
    public static void main(String[] args) {
        System.out.println("Enter a valid integer value");
        Scanner scanner = new Scanner(System.in);

        if(!scanner.hasNextInt()){
            System.out.println("Invalid input! Enter a valid integer value");
            System.exit(0);
        }
        int number = scanner.nextInt();
        if(number>0){
            System.out.println(number + " is a positive number");
        } else if (number<0) {
            System.out.println(number + " is a negative number");
        }else {
            System.out.println(" number is zero : " + number);
        }
    }
}
