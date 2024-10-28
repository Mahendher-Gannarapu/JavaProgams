package October_2024._25102024_Arrays;

import java.util.Arrays;

public class ArrayEx8_StringArrSort {
    public static void main(String[] args) {

        String name[] = {"Mahi", "Srihansh", "Suhanth", "Lahari"};
        //Alternative way to create String Arrays
        //String[] name = {"Mahi", "Srihansh", "Suhanth"};
        System.out.println("String Length =" +name.length);

        Arrays.sort(name);
        for (int i=0; i< name.length; i++)
        {
            System.out.println(name[i]);
        }
    }
}
