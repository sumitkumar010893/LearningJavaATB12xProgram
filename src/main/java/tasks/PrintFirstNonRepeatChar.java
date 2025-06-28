package tasks;

import javax.imageio.stream.ImageInputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintFirstNonRepeatChar {

    public  static Character findFirstNonReapeatChar(String input) {
        if (input == null || input.isEmpty()) {
            return null; // Edge case : null or empty String
        }

        // LinkedHashMap preserves insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Convert to char array and count occurrences
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null; // All characters are repeated
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        Character result = findFirstNonReapeatChar(input);
        if (result!= null){
            System.out.println("First non repeating Character is: "+ result);
        }else {
            System.out.println("No non repeating Character found");
        }
        sc.close();
    }
}
