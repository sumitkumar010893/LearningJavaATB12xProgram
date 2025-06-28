package oopsConcept_Challenges;

public class Person {
//    Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void personDetails(){
        System.out.println("Name: "+name+","+" Age: "+ age);
    }
public static void main(String[] args) {
        Person john = new Person("John", 25);
        Person alice = new Person("Alice",30);
        john.personDetails();
        alice.personDetails();

}
}
