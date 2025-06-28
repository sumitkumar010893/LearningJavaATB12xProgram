package tasks.exceptionChallenge;

import java.util.Arrays;

public class FindMaxValue {
//    Find the maximum value in an array of Integer objects.
//    I/P- [10, 20, 5, 30, 15]
//    O/P - Max: 30
public static void main(String[] args) {
    Integer[] arr = {10, 20, 5, 30, 15};
    for(int i = 0; i <arr.length; i++){
        for(int j = i+1; j<arr.length; j++){
            if (arr[i]>arr[j]) {
                int max = arr[i];
                arr[i]= arr[j];
                arr[j] = max;
            }
        }
    }
//    Arrays.sort(arr);

    System.out.println("Max: "+arr[4]);
}

}
