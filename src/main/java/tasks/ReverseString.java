package tasks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Reverse");
        String str = sc.nextLine();
        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        System.out.println("Enter second String to Reverse:");
        String str1 = sc.nextLine();
        StringBuilder sb = new StringBuilder(str1);
        sb = sb.reverse();
        System.out.println(sb);

    }
}
