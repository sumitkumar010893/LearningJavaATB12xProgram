package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {

        // Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // else age < > 18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Options
        //
//        int age = Integer.parseInt(args[0]);

        // 2. Scanner Class
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); // java.util.InputMismatchExceptiom

        if (age> 18){
            System.out.println("Allowed to vote!");
        }else{
            System.out.println("Not allowed to vote!");
        }
    }
}
