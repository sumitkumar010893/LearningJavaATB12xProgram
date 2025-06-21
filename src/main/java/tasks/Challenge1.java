package tasks;

public class Challenge1 {
//    Write a Java program to declare variables of all primitive data types and print their default values.
// Primitive data types
byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    public static void main(String[] args) {
        Challenge1 defaultValues = new Challenge1();
        defaultValues.printDefaults();

    }

    public void printDefaults(){
        System.out.println("Default values of primitive data types:");
        System.out.println("byte    : " + byteVar);
        System.out.println("short   : " + shortVar);
        System.out.println("int     : " + intVar);
        System.out.println("long    : " + longVar);
        System.out.println("float   : " + floatVar);
        System.out.println("double  : " + doubleVar);
        System.out.println("char    : '" + charVar + "'");
        System.out.println("boolean : " + booleanVar);

    }



}
