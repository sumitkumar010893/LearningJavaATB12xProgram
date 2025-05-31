package ex_15_StringBuffer_Builder_StringFunction;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Sumit";
        String s1 = new String("Sumit");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Sumit");
        StringBuilder stringBuilder = new StringBuilder("Sumit");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
