import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Maze Runner", "James Dashner", 122343, 50.5);
        Book book2 = new Book("Norwegian Wood","Haruki Murakami",34566,45.7);
        ArrayList <Book> books= new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        book1.displayInfo();
        book2.displayInfo();
        book1.discount(20);
    }
}