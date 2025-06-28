package stringchallenge;

public class Chall_2_StringComparison_Equality {
//    Create a program that demonstrates different ways to compare strings in Java, including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
//    I/P - String1: "Hello", String2: "hello", String3: "Hello"
//    O/P - equals(): false, equalsIgnoreCase(): true, compareTo(): -32
public static void main(String[] args) {
    String string1 = "Hello";
    String string2 = "hello";
    String string3 = "Hello";

    System.out.println("equals(): "+ string1.equals(string2));
    System.out.println("equalsIgnoreCase(): "+string1.equalsIgnoreCase(string2));
    System.out.println("compareTo(): "+string1.compareTo(string2));

}
}
