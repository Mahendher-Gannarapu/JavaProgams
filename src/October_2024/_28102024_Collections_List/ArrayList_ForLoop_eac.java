package October_2024._28102024_Collections_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ForLoop_eac {
    public static void main(String[] args) {
        // List list  = new List();
        List list = new ArrayList();
        list.add("bread"); // 0
        list.add("milk");  // 1
        list.add("butter"); // 2
        list.add("paneer");  //3
        list.add("jam");  //4
        list.add("cheeze");  //5

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //"for each" work with only objects and collection framework
        // available in only collection framework
        for(Object o: list)
        {
            System.out.println(o);
        }
    }
}
