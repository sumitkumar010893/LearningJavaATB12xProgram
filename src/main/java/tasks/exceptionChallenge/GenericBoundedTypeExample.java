package tasks.exceptionChallenge;

public class GenericBoundedTypeExample {
//    Write a generic method that accepts only numbers and return their sum
//    I/P - Integer array [1, 2, 3] , Double array [1.5, 2.5, 3.5]
//    O/P - Sum: 6.0   , Sum: 7.5
public static void main(String[] args) {
    Integer[] intArray = {1,2,3};
    Double[] array = {1.5, 2.5, 3.5};
    System.out.println("Sum: "+sumArray(intArray));
    System.out.println("Sum: "+sumArray(array));
}

public static < T extends Number> double sumArray(T[] array){
    double sum = 0.0;
    for(int i =0 ; i < array.length; i++){
        sum += array[i].doubleValue();
    }
    return sum;
}
}
