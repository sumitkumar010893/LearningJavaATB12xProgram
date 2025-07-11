package tasks.Polymorphism;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int intSum = calc.add(10, 20);
        double doubleSum = calc.add(10.5,11.23);
        System.out.println("Integer sum is: "+ intSum);
        System.out.println("Double sum is: "+ doubleSum);
    }
}


