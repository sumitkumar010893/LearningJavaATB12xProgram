package tasks.Polymorphism;

public class MathOperation {

    public int multiply(int a, int b){
        return a*b;
    }

    public int multiply(int a, int b , int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        int productOfTwo = math.multiply(3,4);
        int productOfThree = math.multiply(3,6,7);
        System.out.println("Product of two integer is: "+productOfTwo);
        System.out.println("Product of three integer is: "+productOfThree);
    }
}
