package October_2024._28102024_Collections_List;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        // Collection - Interface - 10
        // List - Interface - 15 ( 25)
        //  ArrayList, LinkedList, Stack and Vector - Class


        // Shopping - bread,milk, curd, panneer, buttermilk. , butter
        // List -Collection of items - with same or different data type.
        // Collections of students -

        ArrayList studentList = new ArrayList();
        studentList.add("Mahendher");
        studentList.add("Srihansh");
        studentList.add("Suhansth");
        studentList.add("Lahari");
        studentList.add("Lahari");  //Duplicate allowed
        studentList.add(123);  //Different datatype also allowed
        studentList.add(null);

        System.out.println((studentList));

    }
}
