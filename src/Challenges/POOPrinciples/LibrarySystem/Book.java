package Challenges.POOPrinciples.LibrarySystem;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int publicationYear;
    private int numberOfPages;
    private String language;
    private double price;
    private String genre;
    private int stockQuantity;
    private String description;



    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title, String author, String isbn, String publisher) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book(String title, String author, String isbn, int publicationYear, String publisher) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }

    public Book(String title, String author, String isbn, int numberOfPages, String publisher, int publicationYear, String language, double price, String genre, int stockQuantity, String description) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.language = language;
        this.price = price;
        this.genre = genre;
        this.stockQuantity = stockQuantity;
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Méthode pour afficher les informations d’un livre
    public void displayInfo() {
        System.out.println("Titre: " + title + ", Auteur: " + author + ", ISBN: " + isbn);
        System.out.println("Éditeur: " + publisher + ", Année: " + publicationYear);
        System.out.println("Pages: " + numberOfPages + ", Langue: " + language + ", Prix: " + price + "€");
        System.out.println("Genre: " + genre + ", Stock: " + stockQuantity);
        System.out.println("Description: " + description);
    }
}
