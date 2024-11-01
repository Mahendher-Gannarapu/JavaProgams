package October_2024._28102024_Collections_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        //List l = new Last();
        List l = new ArrayList();

        l.add(1);  //0
        l.add(2);   //1
        l.add(3);   //2
        l.add(4);  //3

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains(1));
        System.out.println(l.isEmpty());
        System.out.println(l.indexOf(3)); //Find first occurance of element in the list
        System.out.println(l.lastIndexOf(4));
    }
}
