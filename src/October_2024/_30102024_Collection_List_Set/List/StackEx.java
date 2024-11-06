package October_2024._30102024_Collection_List_Set.List;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        // Vector, Stack - Legacy -
        // 95% of time we are not going
        // to use it in automation

//        // ArrayList - 95% we are going to use.
//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s); // LIFO
//
        Stack books = new Stack();
        books.push("Python"); //adding elements with push
        books.push("Java");
        books.push("C#");
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.pop()); //Delete from the list
        System.out.println(books.peek()); //Display the last element
        System.out.println(books); //Display all elements
        System.out.println(books.pop());
        System.out.println(books.empty());
        System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.empty());
        System.out.println(books.add("Java"));
        System.out.println(books);
        System.out.println(books.add("c#"));
        System.out.println(books);
        books.add(0,"python");
        System.out.println(books);


     }
}
