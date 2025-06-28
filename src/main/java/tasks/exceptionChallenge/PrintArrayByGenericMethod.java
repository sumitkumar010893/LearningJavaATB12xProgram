package tasks.exceptionChallenge;

public class PrintArrayByGenericMethod {
//    Write a generic method to print any type of array.
//    I/P - String array ["A", "B", "C"] , Integer array [1, 2, 3]
//    O/P - A B C , 1 2 3
public static void main(String[] args) {
    String[] strArray ={"A", "B", "C"};
    Integer[] intArray = {1, 2,3};
    printArray(strArray);
    printArray(intArray);
}
public static <T> void  printArray(T[] array){
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
}
}
