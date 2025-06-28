package stringchallenge;

public class Chall_1_StringManipulation {
//    Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.
//    I/P- Hello World
//    O/P - Length: 11, First char: H, Substring: World
public static void main(String[] args) {
    String s = "Hello";
    String s1 = s.concat(" World");
    System.out.println(s1);
    System.out.println("Length: "+s1.length());
    System.out.println("First Char: "+ s1.charAt(0));
    System.out.println("Substring: "+ s1.substring(6));

}
}
