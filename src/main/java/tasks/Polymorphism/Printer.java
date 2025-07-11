package tasks.Polymorphism;

public class Printer {
    public void printData(String data){
        System.out.println("Printing String: "+ data);
    }
    public void printData(int data){
        System.out.println("Printing Integer: "+ data);
    }

    public void printData(float data){
        System.out.println("Printing Float: "+ data);
    }

    public static void main(String[] args) {
        Printer print = new Printer();
        print.printData("Hello Sumit");
        print.printData(10);
        print.printData(10.25f);
    }
}
