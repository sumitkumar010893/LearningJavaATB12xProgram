package oopsConcept_Challenges;

public class EmployeeBase {
//    Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
//    I/P - Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
//    O/P - Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
//     Explanation:Implement inheritance with specialized behavior in subclasses for different salary calculation logic.

    String name;
    int id;
    double salary;

    EmployeeBase(String name,int id){
        this.name= name;
        this.id = id;
    }
    double calculateSalary(){
        return salary;
    }
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
