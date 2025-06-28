package ex_19_OOPs_Part2.superKeyword;

public class Lab181 {
    public static void main(String[] args) {
        Son son = new Son();
        son.newHome();
    }
}

class Father{
    Father(){
        System.out.println("DC Father");
    }

    int gold = 10;

    void home(){
        System.out.println("Home Father");
    }
}

class Son extends Father{
    Son(){
        super();
    }
    void bike(){
        System.out.println("Sports bike");
    }

    void newHome(){
        super.home();
        System.out.println(super.gold);
        this.bike();
    }
}