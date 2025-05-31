package ex_15_StringBuffer_Builder_StringFunction;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10)); //java.lang.StringIndexOutOfBoundException

        // 2. concat()
        System.out.println(name.concat("Patel"));

        // 3. contains()
        System.out.println(name.concat("om"));

        // 4. equals()
        System.out.println(name.equals("Sonal"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6. indexOf() // sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n','N'));

        // 9. substring( , )
        System.out.println(name.substring(1,3));

        // 10. toLowerCase()
        System.out.println(name.toLowerCase());

        // 11. toUpperCase()
        System.out.println(name.toUpperCase());

        // 12. startsWith()
        System.out.println(name.startsWith("S"));

        // 13. endsWith()
        System.out.println(name.endsWith("a"));

        // 14. trim()
        String name3 = " Sonal Harish  ";
        System.out.println(name3.trim());

        // 15. compareTo()
        System.out.println(name.compareTo("Sonal"));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara, O roar again!";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);

        String s11 = "Sumit";
        String s21 = s11.concat("soam");
        System.out.println(s21);


    }
}
