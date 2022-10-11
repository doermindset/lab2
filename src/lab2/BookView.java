package lab2;

public class BookView {

    public void printBookDetails(String BookName, String BookId, String BookCategory){
        System.out.println("Book Details: ");
        System.out.println("Name: " + BookName);
        System.out.println("Book ID: " + BookId);
        System.out.println("Book Category: " + BookCategory);
    }

    public void printMenu() {
        System.out.println("0. Exit");
        System.out.println("1. Add a Book");
        System.out.println("2. Remove a Book");
        System.out.println("3. Edit a Book");
        System.out.println("Choose a number: ");
    }


}
