package Assigned_Tasks.Oct_2024.Task_14102024.TwoWay;
/*
Book class which has an abstract method getDetails(),name, author, price.
PrintMyBook class that inherits from the Book class.
abstract
Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
// Output
"Harry Potter, J.k. Rowling, 100"
 */
abstract class Book {

    String name= "Harry Potter";
    String author = "J.k. Rowling";
    float price = 100.00f;

    abstract void getDetails();
}
