package ex_19_OOPs_Part2.polymorphism.methodoverriding;

public class Son extends Father{
    void s1(){
        System.out.println("Som - s1");
    }
    @Override
    void home(){
        System.out.println("son - 3BHK");
    }
}
