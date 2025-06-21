package tasks;

public class StringConcatenation_Ch2 {
   // Write a program to demonstrate string concatenation with numbers.
   public static void main(String[] args) {
       int a = 10;
       int b = 20;
       String text = "Sumit ";


       System.out.println(a + b);
       System.out.println(text + a);
       System.out.println(text + a + b);
       System.out.println(a + b + text);
       System.out.println("Sum = " + (a + b));
   }

}
