package tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Kids -> A -> Excellent, F -> Fail
//        Create a program that will basically be based on
//        the alphabet or based on the grade
//        You will give the message to the kid if you got
//        excellent, very good, good, needs improvement
//        fail, or invalid grade
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade from A to F");
        String grade = scanner.nextLine();
        grade = grade.toUpperCase();
         switch (grade){
             case "A":
                 System.out.println("Excellent grade");
                 break;
             case "B":
                 System.out.println("Very Good grade");
                 break;
             case "C":
                 System.out.println("Good grade");
                 break;
             case "D":
                 System.out.println("Needs Improvement");
                 break;
             case "E":
                 System.out.println("Poor Grades");
                 break;
             case "F":
                 System.out.println("Fail");
                 break;
             default:
                 System.out.println("Invalid Grade, Enter valid grade");
         }

    }
}
