package tasks;

public class ForLoop_Task2 {
    public static void main(String[] args) {
        //  Print even numbers from 1 to 20
        System.out.println("Even numbers from 1 to 20 are");
        for (int i =1; i<=20; i++ ){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
