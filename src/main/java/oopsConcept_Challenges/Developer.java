package oopsConcept_Challenges;

public class Developer extends EmployeeBase{
    double baseSalary;
    double projectAllowance;

    Developer(String name, int id, double baseSalary, double projectAllowance) {
        super(name,id);
        this.baseSalary = baseSalary;
        this.projectAllowance = projectAllowance;
    }

    @Override
    double calculateSalary() {
        return baseSalary + projectAllowance;
    }

}
