package oopsConcept_Challenges;

public class Employee {
//    Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
//    i/p - Employee with id=1, name="John Doe", salary=50000
//    o/p - Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("John Doe");
        employee.setSalary(50000);

        System.out.println("Employee ID: "+ employee.getId());
        System.out.println("Employee Name: "+ employee.getName());
        System.out.println("Employee Salary: "+ employee.getSalary());
    }
}
