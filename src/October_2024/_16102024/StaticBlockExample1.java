package October_2024._16102024;

public class StaticBlockExample1 {
    public static void main(String[] args) {
        Student1 s = new Student1(35);
        Student1 s1 = new Student1(33);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(Student.school_name);
        Student.school_name = "ABC";
        System.out.println(Student.school_name);
    }
}

class Student1
{
    int age; //instance variable
    static String school_name = "sri";

    {
        System.out.println("IIB");
        //Instance initialization Block
        //you can write the code what you what to do when object is created
        System.out.println("Here you can write a code what you want to do when Object is created");
        System.out.println("Read a MySQL db()");
    }

    static{
        System.out.println("SIB");
        System.out.println("Loaded once, when the class is loaded");
    }

    public Student1(int age) {
        this.age = age;
    }
}