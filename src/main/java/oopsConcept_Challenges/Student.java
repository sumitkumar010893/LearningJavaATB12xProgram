package oopsConcept_Challenges;

public class Student {
//    Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.
//    input - Create student with name="Bob", rollNo=101, section="A"
//    o/p -Student: Bob, Roll No: 101, Section: A
    private String name;
    private int rollNo;
    private String section;

    public Student(String name, int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void printDetails(){
        System.out.println("Student: "+name+", Roll No: "+rollNo+", Section: "+section);
    }
}

class StudentDetails{
    public static void main(String[] args) {
        Student student = new Student("Bob",101,"A");
        student.printDetails();
    }

}
