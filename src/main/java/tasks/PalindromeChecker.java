package tasks;

import java.util.Scanner;

public class PalindromeChecker {
//    Create a program that checks whether a given string is a palindrome. A palindrome is a word
//or phrase that reads the same backward as forward (ignoring spaces, punctuation, and
//capitalization). Use an if-else statement to determine if the string is a palindrome.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String input = sc.nextLine();
    if(input == null || input.trim().isEmpty() ){
        System.out.println("Invalid input, Enter a valid String");
        return;
    }
    String cleaned = input.replaceAll("^A-Z a-z 0-9","").toLowerCase();
    String reversed ="";
    for (int i = cleaned.length()-1; i>=0;i--){
        reversed += cleaned.charAt(i);
    }
    if(cleaned.equals(reversed)){
        System.out.println("String is Palindrome");
    }else {
        System.out.println("String is not Palindrome");
    }
    sc.close();
}
}
