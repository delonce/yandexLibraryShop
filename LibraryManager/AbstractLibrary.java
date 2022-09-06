package main.LibraryManager;

import main.ClientLibrary.AbstractPerson;
import main.IssuedPublications.AbstractIssuedPublications;
import main.IssuedPublications.Book;
import main.IssuedPublications.Journal;
import main.LibraryStorage.AbstractStorage;
import main.LibraryStorage.BookStorage;
import main.LibraryStorage.JournalStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

abstract public class AbstractLibrary {
    private HashMap<AbstractPerson, ArrayList<AbstractIssuedPublications>> registeredPersons = new HashMap<>();

    public void addElementToPerson(AbstractPerson person, AbstractIssuedPublications element) {
        if (registeredPersons.containsKey(person)) {
            ArrayList<AbstractIssuedPublications> publs = registeredPersons.get(person);
            publs.add(element);
            registeredPersons.put(person, publs);
        } else {
            registeredPersons.put(person, new ArrayList<>(Arrays.asList(element)));
        }
    }

    public void removeElementFromPerson(AbstractPerson person, AbstractIssuedPublications element) {
        ArrayList<AbstractIssuedPublications> publs = registeredPersons.get(person);
        publs.remove(element);
        registeredPersons.put(person, publs);
    }

    public final AbstractIssuedPublications giveSomeElement(String title, AbstractStorage storage) {
        if (storage.searchElement(title)) {
            return storage.getNewElement(title);
        } else {
            System.out.println("We aren't have such element!");
            return null;
        }
    };

    public final void putSomeElement(AbstractIssuedPublications element, AbstractStorage storage) {
        storage.putNewElement(element);
    }

    public HashMap<AbstractPerson, ArrayList<AbstractIssuedPublications>> getRegisteredPersons() {
        return registeredPersons;
    }
}
