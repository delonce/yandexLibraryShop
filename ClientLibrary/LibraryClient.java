package main.ClientLibrary;

import main.IssuedPublications.Book;
import main.IssuedPublications.Journal;
import main.LibraryManager.AbstractLibrary;
import main.LibraryManager.SimpleLibrary;

public class LibraryClient extends AbstractPerson {
    public LibraryClient(String name, int passNum) {
        super(name, passNum);
    }

    public Book getBookFromLibrary(SimpleLibrary library, String bookTitle) {
        Book book = library.giveBook(bookTitle);
        if (book != null) {
            library.addElementToPerson(this, book);
            book.sayDescribe();
        }
        return book;
    }

    public void returnBook(SimpleLibrary library, Book book) {
        library.putBookBack(book);
        library.removeElementFromPerson(this, book);
    }

    public Journal getJournalFromLibrary(SimpleLibrary library, String journalTitle) {
        Journal journal = library.giveJournal(journalTitle);
        if (journal != null) {
            library.addElementToPerson(this, journal);
            journal.sayDescribe();
        }
        return journal;
    }

    public void returnJournal(SimpleLibrary library, Journal journal) {
        library.putJournalBack(journal);
        library.removeElementFromPerson(this, journal);
    }
}
