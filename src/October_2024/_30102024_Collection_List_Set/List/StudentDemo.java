package October_2024._30102024_Collection_List_Set.List;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Raju", 1);
        Student s2 = new Student("MAhi", 2);
        Student s3 = new Student("Ramu", 3);

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        System.out.println(s1.printDetails());
        System.out.println(s2.printDetails());
        System.out.println(s3.printDetails());
        System.out.println("------------");
        System.out.println(myStudents);

    }
}

class Student
{
    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String printDetails()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public String toString() //toString used to print the details of the object reference
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
