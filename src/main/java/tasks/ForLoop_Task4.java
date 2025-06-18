package tasks;

public class ForLoop_Task4 {
    public static void main(String[] args) {
        // Print the sum of first 10 natural numbers
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum = sum+i;
        }
        System.out.println("Sum of first 10 natural numbers is " + sum);
    }
}
