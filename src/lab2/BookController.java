package lab2;
import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
    
    ArrayList<Book> books= new ArrayList<Book>();
    private BookView view;

    public BookController(ArrayList<Book> books, BookView view) {
        this.books= books;
        this.view = view;
    }


    public void updateView() {
        for (Book book : books) {
            view.printBookDetails(book.getName(), book.getId(), book.getCategory());
        }
    }
    
    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        try {
            books.remove(book);
        }
        catch (Exception e){
            System.out.println("The book doesn't exist!");
        }
    }

    public void editBook(Book oldBook, Book newBook) {
        for (Book book : books) {
            if (book.getName() == oldBook.getName() && book.getCategory() == oldBook.getCategory() && book.getId() == oldBook.getId()){
                oldBook.setName(newBook.getName());
                oldBook.setId(newBook.getId());
                oldBook.setCategory(newBook.getCategory());
            }
        }
    }


    public Book createBook(String bookName, String bookCategory, String bookId){
        Book book = new Book();
        book.setName(bookName);
        book.setId(bookId);
        book.setCategory(bookCategory);

        return book;
    }

    public void menu(){
        while(true){
            view.printMenu();
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            Book book = new Book();
            String name;
            String id;
            String category;

            if(num == 0)
                break;
            else if (num == 1) {
                book = getBook(in);
                addBook(book);
                updateView();
            } else if (num == 2) {
                book = getBook(in);
                deleteBook(book);
                updateView();
            }
            else {
                System.out.println("Old book name: ");
                name = in.next();
                System.out.println("Book category: ");
                category = in.next();
                System.out.println("Book id: ");
                id = in.next();
                Book oldBook = createBook(name, category, id);
                System.out.println("New book name: ");
                name = in.next();
                System.out.println("Book category: ");
                category = in.next();
                System.out.println("Book id: ");
                id = in.next();
                Book newBook = createBook(name, category, id);
                editBook(oldBook, newBook);
                updateView();
            }
        }
    }

    public Book getBook(Scanner in) {
        String name;
        String category;
        String id;
        System.out.println("Book name: ");
        name = in.next();
        System.out.println("Book category: ");
        category = in.next();
        System.out.println("Book id: ");
        id = in.next();
        Book book = createBook(name, category, id);
        return book;
    }
}
