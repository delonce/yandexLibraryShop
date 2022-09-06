package main.LibraryStorage;

import main.IssuedPublications.AbstractIssuedPublications;

public interface AbstractStorage {
    void putNewElement(AbstractIssuedPublications element);

    AbstractIssuedPublications getNewElement(String title);

    boolean searchElement(String title);
}
