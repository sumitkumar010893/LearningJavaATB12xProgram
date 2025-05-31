package ex_15_StringBuffer_Builder_StringFunction;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Sumit");
        sb.append("Soam");
        System.out.println(sb);

        String s1 = "SUmit";
        s1 = s1 + "Soam";
        System.out.println(s1);

    }
}
