package tasks.Polymorphism;

public class EmployeeRoleInfo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee mgr = new Manager();
        Employee clk = new Clerk();
        Employee tst = new Tester();

        emp.role();
        mgr.role();
        clk.role();
        tst.role();
    }
}

class Employee{
    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{
    @Override
    void role(){
        System.out.println("Manager: Manages teams and projects.");
    }
}

class Clerk extends Employee {
    @Override
    void role() {
        System.out.println("Clerk: Handles administrative tasks.");
    }
}
class Tester extends Employee {
    @Override
    void role() {
        System.out.println("Tester: Ensures product quality through testing.");
    }
}
