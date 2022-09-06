package main.LibraryStorage;

import main.IssuedPublications.AbstractIssuedPublications;
import main.IssuedPublications.Book;

import java.util.HashMap;

public class AbstractLibraryStorage implements AbstractStorage {
    private HashMap<String, Object> elementMap = new HashMap<>();

    @Override
    public void putNewElement(AbstractIssuedPublications element) {
        try {
            elementMap.put(element.getTitle(), element);
        } catch (Exception e) {
            System.out.println("It's not a book!");
        }
    }

    @Override
    public AbstractIssuedPublications getNewElement(String title) {
        AbstractIssuedPublications choiceBook = (AbstractIssuedPublications) elementMap.get(title);
        if (choiceBook != null) {
            elementMap.remove(title);
            return choiceBook;
        } else {
            return null;
        }
    }

    @Override
    public boolean searchElement(String title) {
        return elementMap.containsKey(title);
    }
}
