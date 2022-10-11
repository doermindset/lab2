package lab2;

public class Book {

    private String BookName;
    private String BookId;
    private String BookCategory;

    public String getId() {
        return BookId;
    }

    public void setId(String id) {
        this.BookId = id;
    }

    public String getName() {
        return BookName;
    }

    public void setName(String name) {
        this.BookName = name;
    }

    public String getCategory() {
        return BookCategory;
    }

    public void setCategory(String category) {
        this.BookCategory = category;
    }

}
