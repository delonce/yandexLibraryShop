package main.ClientLibrary;

import main.IssuedPublications.AbstractIssuedPublications;
import main.IssuedPublications.Book;
import main.IssuedPublications.Journal;
import main.LibraryManager.SimpleLibrary;

public class AbstractPerson {
    private String name;
    private int passNum;

    public AbstractPerson(String name, int passNum) {
        this.name = name;
        this.passNum = passNum;
    }

    public String getName() {
        return name;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }
}
