package tasks.Ifelse_june19th;

import java.util.Scanner;

public class IfElse_Task4 {
//    Check if a Character is a Vowel or Consonant.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a single alphabet character");

    String charName = scanner.nextLine();

    if(charName.length()!=1){
        System.out.println("Error : Enter only one character only");
        return;
    }
    char ch = charName.charAt(0);

    if (!Character.isLetter(ch)) {
        System.out.println("Error: Input is not an alphabetic character.");
        return;
    }
    ch = Character.toLowerCase(ch);
    if( ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o'|| ch == 'u' ){
        System.out.println("the character is '"+ charName+"' is a VOWEL");
    }else {
        System.out.println("the character is '"+ charName+"' is a CONSONANT");
    }
}
}
