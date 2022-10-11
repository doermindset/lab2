import lab2.Book;
import lab2.BookController;
import lab2.BookView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> arr = new ArrayList<Book>();
        BookView view = new BookView();

        BookController controller = new BookController(arr, view);
        controller.menu();
    }
}