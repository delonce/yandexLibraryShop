package main.LibraryManager;

import main.IssuedPublications.AbstractIssuedPublications;
import main.IssuedPublications.Book;
import main.IssuedPublications.Journal;
import main.LibraryStorage.BookStorage;
import main.LibraryStorage.JournalStorage;

import java.util.ArrayList;

public class SimpleLibrary extends AbstractLibrary {
    private BookStorage bookStorage = new BookStorage();
    private JournalStorage journalStorage = new JournalStorage();

    public Book giveBook(String title) {
        return (Book) giveSomeElement(title, bookStorage);
    }

    public Journal giveJournal(String title) {
        return (Journal) giveSomeElement(title, journalStorage);
    }

    public void putBookBack(Book book) {
        putSomeElement(book, bookStorage);
    }

    public void putJournalBack(Journal journal) {
        putSomeElement(journal, journalStorage);
    }

    public void loadBooks(ArrayList<AbstractIssuedPublications> books) {
        for (AbstractIssuedPublications book : books) {
            bookStorage.putNewElement(book);
        }
    }

    public void loadJournals(ArrayList<Journal> journals) {
        for (Journal journal : journals) {
            journalStorage.putNewElement(journal);
        }
    }
}
