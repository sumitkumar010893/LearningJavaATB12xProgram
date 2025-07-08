package tasks;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt the user for input
        System.out.println("Enter your name");
        String name = sc.nextLine();
        // prompt the user for number
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Hello "+name +"! You are "+age+" years old.");
        sc.close();
    }
}
