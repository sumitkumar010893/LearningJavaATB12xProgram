package ex_02_Java_Basics_Part2;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        final int b = 99;
//      b=11; java: cannot assign a value to final variable b
        System.out.println(b);
//        b = b+1;
        System.out.println(b);
        System.out.println(b);

        final float pi = 3.14f;
        final float pi1 =3.14f;
        final float pi2 = 3.14f;
        final float pi3 = 3.14f;

        final int a1 = 10;
//        pi = 90;
    }
}
