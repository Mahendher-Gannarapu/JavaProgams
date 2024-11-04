package Assigned_Tasks.Oct_2024.Task_14102024.OneWay;

public class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, int price) {
        super(name, author, price); //calling the parent attributes
    }

    @Override
    void getDetails() {
        System.out.println("Book Name =" +name+ "Author Name =" +author+ "Price =" +price);
    }
}
