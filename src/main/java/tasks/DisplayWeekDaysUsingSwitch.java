package tasks;

import java.util.Scanner;

public class DisplayWeekDaysUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");

        if(sc.hasNextInt()){
            int day = sc.nextInt();
            switch (day){
                case 1 :
                    System.out.println("Mon");
                    break;
                case 2 :
                    System.out.println("Tues");
                    break;
                case 3 :
                    System.out.println("Wed");
                    break;
                case 4 :
                    System.out.println("Thurs");
                    break;
                case 5 :
                    System.out.println("Fri");
                    break;
                case 6 :
                    System.out.println("Sat");
                    break;
                case 7 :
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only, you fool!");

            }
        }else{
            System.out.println("Please enter an integer value");
        }
    }
}
