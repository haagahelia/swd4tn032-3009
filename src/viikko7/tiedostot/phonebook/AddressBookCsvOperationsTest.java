package viikko7.tiedostot.phonebook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookCsvOperationsTest {

    public static void main(String[] args) {
        List<Contact> writeContacts = new ArrayList<>();
        writeContacts.add(new Contact("Bruce Wayne", "bruce@example.com", "055667788"));

        boolean ok = AddressBookCsvOperations.saveContacts(writeContacts, "contacts.csv");
        System.out.println(ok);

        List<Contact> readContacts = AddressBookCsvOperations.readContacts("contacts.csv");
        System.out.println(readContacts);
    }
}
