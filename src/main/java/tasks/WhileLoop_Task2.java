package tasks;

public class WhileLoop_Task2 {
    public static void main(String[] args) {
        //Print even numbers from 1 to 20
        int i = 1;
        while (i<=20){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
