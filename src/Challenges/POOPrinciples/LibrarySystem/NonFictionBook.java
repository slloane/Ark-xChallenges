package Challenges.POOPrinciples.LibrarySystem;

public class NonFictionBook  extends Book{
    private String concept;

    public NonFictionBook(String concept,String title, String author, String isbn) {
        super(title, author, isbn);
        this.concept = concept;
    }

    public NonFictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }


    public NonFictionBook(String title, String author, String isbn, int publicationYear, String publisher) {
        super(title, author, isbn, publicationYear, publisher);
    }

    public NonFictionBook(String title, String author, String isbn, int numberOfPages, String publisher, int publicationYear, String language, double price, String genre, int stockQuantity, String description) {
        super(title, author, isbn, numberOfPages, publisher, publicationYear, language, price, genre, stockQuantity, description);
    }
}
