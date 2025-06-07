package tasks;

import java.util.Scanner;

public class Task5_Triangle_Classifier {
    public static void main(String[] args) {
//        int side1 = 1; // Replace with the lengths of your triangle side
//        int side2 = 2;
//        int side3 = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First length of the Triangle");
        int side1 = scanner.nextInt();
        System.out.println("Enter second length of the Triangle");
        int side2 = scanner.nextInt();
        System.out.println("Enter third length of the Triangle");
        int side3 = scanner.nextInt();

        if(side1 + side2 > side3 && side1 + side3 >side2 && side2 + side3 > side1){

            if(side1 == side2 && side2== side2){
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 ==side3 || side2 == side3) {
                System.out.println("Isoceles Triangle");
            }else {
                System.out.println("Scalene Triangle");
            }
        }else {
            System.out.println("Not a valid Triangle");
        }
    }
}
