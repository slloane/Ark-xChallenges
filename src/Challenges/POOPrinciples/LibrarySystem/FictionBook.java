package Challenges.POOPrinciples.LibrarySystem;

public class FictionBook extends Book {
    private String sousGenre;

    public FictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    public FictionBook(String title, String author, String isbn, String publisher) {
        super(title, author, isbn, publisher);
    }

    public FictionBook(String title, String author, String isbn, int publicationYear, String publisher) {
        super(title, author, isbn, publicationYear, publisher);
    }

    public FictionBook(String title, String author, String isbn, int numberOfPages, String publisher, int publicationYear, String language, double price, String genre, int stockQuantity, String description) {
        super(title, author, isbn, numberOfPages, publisher, publicationYear, language, price, genre, stockQuantity, description);
    }
}
