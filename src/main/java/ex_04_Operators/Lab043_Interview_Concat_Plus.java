package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Sumit";
        String last_name = "Kumar";
         int a = 10;
         int b = 10;

        System.out.println(first_name+last_name + a + b); //SumitKumar1010
        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name+ last_name + (a + b));

        //  BODMAS - bracket of Div , mul , add, sub
    }
}
