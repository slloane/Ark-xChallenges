package Challenges.POOPrinciples.LibrarySystem;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public static void main(String[] args) {
        Library library = new Library();

        FictionBook fbook = new FictionBook("HarryPotter", "JK.Rowling", "9780441013593", "Fantasy");
        NonFictionBook nfbook = new NonFictionBook("The myth of normal", "Gabor Maté", "9780143127550", "Psychology");

        library.addBook(fbook);
        library.addBook(nfbook);

        // Polymorphisme : displayInfo() appelé selon le type réel de l’objet
        library.displayAllBooks();
    }

    // Affiche les informations de tous les livres de manière polymorphe
    public void displayAllBooks() {
        for (Book book : books) {
            book.displayInfo();
            System.out.println("-----------------------------");
        }
    }
}

