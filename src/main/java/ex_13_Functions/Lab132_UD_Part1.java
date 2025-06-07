package ex_13_Functions;

import java.util.Scanner;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

        // User defined Functions.

        // 1. Without Parameters and Without Return type
        // 2. Without Parameters but with return type
        // 3. With Parameters and without Return type
        // 4. With Parameters and with return type

        // 1. Without argument / Parameters and without Return Type.
        wp_wr_greet();

        // 2. Without Parameters but with Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        // 3. With Parameters and without Return Type (90% )
        greet_with_details("Sumit", 54, 320);
        greet_with_details("Ankit", 36,350);
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name = scanner.nextLine();
        System.out.println("ENTER AGE");
        int age = scanner.nextInt();
        System.out.println("ENTER SALARY");
        double salary = scanner.nextDouble();

        greet_with_details(name, age, salary);

        // 4. With Parameters and with Return Type
        int sum = sum_of_two_numbers(3,4);
        int sum3 = sum_of_three_numbers(3,50,67);
        float sum4= sum_of_three_numbers_float(2.5f,3.4f, 6.7f);

        System.out.println(sum);
        System.out.println(sum3);
        System.out.println(sum4);

    }

    // 1. Without Parameters and Without Return type. (Declare)/ Define
    static void wp_wr_greet(){
        System.out.println("Hi, How are you ?");
    }

    // 2. Without Parameters but with Return Type
    static String greet_with_hello_wp_with_RT(){
        System.out.println("Hi");
        return "Hi, How are you ?";
    }

    // 3. With Parameters and without Return Type ( 90%)
    static  void greet_with_details(String name , int age, double salary){
        System.out.println("Your name is -> "+name + "\nYour age is -> "+age +"\nYour salary is -> "+salary);
    }

    // 4. With Parameters and with Return Type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }
    static float sum_of_three_numbers_float(float a, float b,float c){
        return a+b+c;
    }
}
