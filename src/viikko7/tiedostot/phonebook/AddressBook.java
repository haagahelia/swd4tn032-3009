package viikko7.tiedostot.phonebook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean add(Contact newContact) {
        this.contacts.add(newContact);
        return true;
    }

    public Contact search(String keyword) {
        for (Contact current : this.contacts) {
            String name = current.getName();
            if (name != null && name.toLowerCase().contains(keyword.toLowerCase())) {
                return current; // palautetaan löytynyt arvo heti
            }
        }
        return null; // palautetaan null, jos ei löytynyt
    }

    protected List<Contact> getContacts() {
        return this.contacts;
    }

    @Override
    public String toString() {
        return this.contacts.toString();
    }
}
