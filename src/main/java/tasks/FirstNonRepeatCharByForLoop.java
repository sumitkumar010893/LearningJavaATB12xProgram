package tasks;

import java.util.Scanner;

public class FirstNonRepeatCharByForLoop {
    public static String firstNonRepeatChar(String str){
        String result= "";
        for (int i = 0 ; i < str.length(); i++){
            int count = 0;
            if(str.charAt(i)!=' ') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    result += str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String str = sc.nextLine();
        System.out.println("First Non repeating Character is :"+ firstNonRepeatChar(str));
        sc.close();
    }
}
