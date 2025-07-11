package tasks.Polymorphism;

public class Utility {

    public int max(int a, int b){
        return (a>b)? a : b;
    }

    public int max(int a, int b, int c){
        return (a>b)? ((a>c)? a : c) :((b>c)? b: c);
    }

    public double max(double a,double b){
        return (a>b)? a: b;
    }

    public static void main(String[] args) {
        Utility util = new Utility();
        int maxTwoInt = util.max(45,32);
        int maxThreeInt = util.max(5,6,3);
        double maxTwoDouble = util.max(3.4,3.45);
        System.out.println("Maximum of two integer is: "+ maxTwoInt);
        System.out.println("Maximum of three integer is: "+ maxThreeInt);
        System.out.println("Maximum of two double is: "+ maxTwoDouble);
    }
}
