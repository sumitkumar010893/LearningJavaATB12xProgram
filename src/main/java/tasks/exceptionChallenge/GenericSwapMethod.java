package tasks.exceptionChallenge;

import java.util.Arrays;

public class GenericSwapMethod {
//    Write a generic method to swap two elements in an array.
//    I/P - [1,2,3], swap indices 0 and 2 & ["A", "B", "C"], swap indices 0 and 1
//    O/P -[3,2,1] & ["B", "A", "C"]
public static void main(String[] args) {

    Integer[] intArray = {1, 2, 3};
    swap(intArray, 0, 2);
    System.out.println( Arrays.toString(intArray));
    // Output: [3, 2, 1]

    // Test with String array
    String[] strArray = {"A", "B", "C"};
    swap(strArray, 0, 1);
    System.out.println( Arrays.toString(strArray));
    // Output: ["B", "A", "C"]
}

public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 ||
                index1 >= array.length || index2 >= array.length) {
            System.out.println("Invalid indices or null array.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
}

}
