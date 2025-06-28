package oopsConcept_Challenges;

public class Outer {
//    Create a class "Outer" with an inner class "Inner". Access the inner class from the outer class and demonstrate their interaction.
//    I/P - Outer class with variable x=10, Inner class accessing x
//    O/P - Outer class variable x: 10 Inner class accessing outer variable: 10
//    Explanation:Inner classes have access to all members of the outer class, including private members. They are useful for helper classes.

    int x = 10;

    class Inner {
        void accessOuterVariable() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }


    public void variable(){
        System.out.println("Outer class variable of x: "+x);
        Inner inner = new Inner();
        inner.accessOuterVariable();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.variable();
    }

}

