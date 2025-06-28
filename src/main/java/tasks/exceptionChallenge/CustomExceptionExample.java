package tasks.exceptionChallenge;

public class CustomExceptionExample {
    //Write a custom exception called `InvalidAgeException` and throw it if age is less than 18.
//    I/O - 20 , 15
//    O/P -Valid age: 20 , InvalidAgeException: Age must be 18 or older
    public static void main(String[] args) {
        validAge(20);
        validAge(15);
    }

    public static void validAge(int age){
        if (age < 18){
            try{
                throw new InvalidAgeException("Age must be 18 or older");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Valid age: "+ age);
        }
    }
}


class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
