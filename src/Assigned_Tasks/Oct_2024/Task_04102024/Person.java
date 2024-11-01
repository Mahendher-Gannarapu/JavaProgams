//Create a Person Class with 10 A, 5 Behavr( All types of Methods)
// and use the DC and PC to set the values, Create 5 Objects

package Assigned_Tasks.Oct_2024.Task_04102024;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Person {

    //Attributes
    String name;
    String address;
    boolean isMarried;
    float phoneno;
    double aadharno;
    String email;
    String designation;
    String company;
    double salary;
    String comapnyAddress;

    //Default Constructor
    Person()
    {
        System.out.println("Default Constructor is created");
    }

    //Parameterized Constructor
    Person(String name,String address,boolean isMarried,float phoneno,double aadharno)
    {
        this.name= name;
        this.address =address;
        this.isMarried = isMarried;
        this.phoneno = phoneno;
        this.aadharno = aadharno;
    }
    Person(String email,String designation,String company,double salary,String comapnyAddress)
    {
        this.email = email;
        this.designation = designation;
        this.company = company;
        this.salary = salary;
        this.comapnyAddress = comapnyAddress;
    }


    //Behaviours
    //No Return Type with No Parameters
    void walk()
    {
        System.out.println("I can walk");
    }

    //Return Type with No Parameters
    String talk()
    {
        System.out.println("I can talk");
        return "mahendher";
    }

    //No Return Type with Parameters
    void read(String book)
    {
        System.out.println("I can read");
        System.out.println("I am reading the book: " + book);
    }

    //Return Type with No Parameters
    double write(String noteBook)
    {
        System.out.println("I have notebook");
        System.out.println("Writing in the notebook: " + noteBook);
        return 1;
    }
}
