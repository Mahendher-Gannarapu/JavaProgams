package October_2024._28102024_Collections_List;

import java.util.List;

public class List_Ex {
    public static void main(String[] args) {
        //List l = new List(); not possible to create object becoz its interface

        List l= List.of("Bannana","Apple","Mangos", 123);
        // of is static method is Interface that can contain the definition

        System.out.println(l);
    }
}