package tasks;

public class PrintTable {
    public static void main(String[] args) {
        int n = 5;
        for (int i =1 ; i<= 10; i++){
            System.out.printf("%dx%d=%d",n,i,n*i);
            System.out.println();
        }
    }
}
