package ex_19_OOPs_Part2.polymorphism.methodoverriding;

public class Lab177 {
    public static void main(String[] args) {
        Son s = new Son();
        s.home();
        s.s1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Son();
        f2.home();
    }
}
