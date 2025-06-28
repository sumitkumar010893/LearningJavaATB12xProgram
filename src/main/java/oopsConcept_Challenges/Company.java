package oopsConcept_Challenges;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Sumit", 1,10000,500);
        Developer dev = new Developer("Mayank",2,12000, 250);

        System.out.println("--Manager Salary Details--");
        manager.displayDetails();

        System.out.println("--Developer Salary Details--");
        dev.displayDetails();

    }
}
