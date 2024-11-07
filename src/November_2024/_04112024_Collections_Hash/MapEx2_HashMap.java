package November_2024._04112024_Collections_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapEx2_HashMap {
    public static void main(String[] args) {

        HashMap<String,String> student1 = new HashMap();
        student1.put("name","Mahendher");
        student1.put("roll","112");
        student1.put("phone","9966886309");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap();
        student2.put("name","Suhanth");
        student2.put("roll","222");
        student2.put("phone","87654311");
        System.out.println(student2);

        List students1 = new ArrayList();
        students1.add(student1);
        students1.add(student2);
        System.out.println(students1);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }
}
