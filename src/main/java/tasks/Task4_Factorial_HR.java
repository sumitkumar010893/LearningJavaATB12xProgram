package tasks;

import java.util.Scanner;

public class Task4_Factorial_HR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be calculated");
        int n = sc.nextInt();
        int fact = 1;
        if(n == 0){
            fact = 1;
        }

        if(n> Integer.MAX_VALUE) { // if(n > 2147483647){
            System.out.println("I can't handle the number > Max of Int");
        }

        for (int i = 1; i<= n ; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

}
