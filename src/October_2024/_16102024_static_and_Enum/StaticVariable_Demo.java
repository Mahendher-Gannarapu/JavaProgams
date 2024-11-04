package October_2024._16102024_static_and_Enum;

public class StaticVariable_Demo {
    public static void main(String[] args) {
        Student s = new Student(35);
        Student s1 = new Student(33);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(Student.school_name);
        Student.school_name = "ABC";
        System.out.println(Student.school_name);
    }
}

    class Student
    {
        int age; //instance variable
        static String school_name = "sri";

        public Student(int age) {
            this.age = age;
        }
    }
//First the Student class load at the same time load the static variable
//The school_name is static variable automatically created with class in class loaders in JVM
// The static variable loaded with the classes
// instance variable loaded with the Objects
// Object s and s1 both are looking for comman school name becoz the static variable available
// for all objects its created at class level.
//
