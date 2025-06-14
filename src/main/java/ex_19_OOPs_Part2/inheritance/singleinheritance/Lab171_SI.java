package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab171_SI {
    public static void main(String[] args) {
        Son sumit = new Son();
        System.out.println(sumit.gold_f);
        sumit.bhk2();
        sumit.bhk3();

        Cousin c = new Cousin();
       // c.bhk3();
//        System.out.println(c.gold_f);
    }
}
