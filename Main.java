package main;

import main.ClientLibrary.LibraryClient;
import main.IssuedPublications.AbstractIssuedPublications;
import main.IssuedPublications.Book;
import main.LibraryManager.AbstractLibrary;
import main.LibraryManager.SimpleLibrary;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractIssuedPublications> books = new ArrayList<>(Arrays.asList(
                new Book("Tom and Jerry", "Race of mouse and cat"),
                new Book("Just do it", "Book of motivation")
        ));

        SimpleLibrary library = new SimpleLibrary();
        library.loadBooks(books);

        LibraryClient jack = new LibraryClient("Jack", 2929);

        Book book = jack.getBookFromLibrary(library, "Just do it");
        System.out.println(library.getRegisteredPersons());

        jack.returnBook(library, book);
        System.out.println(library.getRegisteredPersons());
    }
}