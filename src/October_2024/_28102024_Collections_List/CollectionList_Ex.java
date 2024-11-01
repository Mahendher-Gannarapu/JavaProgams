package October_2024._28102024_Collections_List;

import java.util.ArrayList;

public class CollectionList_Ex {
    public static void main(String[] args) {

        ArrayList studentlist = new ArrayList();
        studentlist.add("Promod");
        studentlist.add("Mahi");
        studentlist.add("Mahi"); //Duplicate also allowed
        studentlist.add(true); //different datatype is allowed
        studentlist.add(567);
        studentlist.add(null);
        System.out.println((studentlist));



    }
}
