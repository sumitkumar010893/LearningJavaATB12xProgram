package tasks;

public class WhileLoop_Task4 {
    public static void main(String[] args) {
        // Calculate sum of first 10 natural numbers

        int i =1;
        int sum = 0;
        while (i<= 10){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first 10 natural number is "+ sum);
    }
}
