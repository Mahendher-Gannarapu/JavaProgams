//**How do you reverse an ArrayList in Java?**

package Assigned_Tasks.Nov_2024.Task_04112024;

import java.util.*;

public class ReverseArrayList {
      public static void main(String[] args) {

            List<String> mylist = new ArrayList();
            mylist.add("Pramod");
            mylist.add("Amit");
            mylist.add("Dutta");

          System.out.println(mylist.size());
          System.out.println(mylist.indexOf("Dutta"));
          //before Reverse list elements
          System.out.println(mylist);

          //Reverse the ArrayList
          Collections.reverse(mylist);

          //After Reverse list elements
          System.out.println("Reversed ArrayList: " + mylist);

//            System.out.println(" - To Print Arraylist - 1 ");
//
//            for (String str : mylist) {
//                System.out.println(str);
//            }
//
            System.out.println(" - To Print Arraylist - 2 ");

            for (int i = 0; i < mylist.size(); i++) {
                System.out.println(mylist.get(i));
            }
//
//
//            System.out.println(" - To Print Arraylist - 3 ");
//
//            // Iterator
//            Iterator<String> iterator = mylist.iterator();
//            while (iterator.hasNext()){
//                System.out.println(iterator.next());
//            }

          System.out.println(" - To Print Reverse Arraylist  ");
            for (int i = mylist.size()-1; i >= 0; i--) {
                System.out.println(mylist.get(i));
            }

        }
    }

/* OUTPUT
3
2
 - To Print Arraylist - 2
Pramod
Amit
Dutta
 - To Print Reverse Arraylist
Dutta
Amit
Pramod

 */