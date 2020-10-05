package viikko7.tiedostot.phonebook;

import java.util.List;
import java.util.Scanner;

public class AddressBookApp {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // Ohjelman käynnistyessä ladataan yhteystiedot levyltä
        List<Contact> contactsFromFile = AddressBookCsvOperations.readContacts("contacts.csv");
        for (Contact c : contactsFromFile) {
            addressBook.add(c);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("This is an address book application. Available commands:\n" + " list\n" + " help\n"
                + " add <name>, <email>, <phone>\n" + " search <name>\n" + " exit\n");

        boolean running = true;
        while (running) {
            System.out.print("> ");
            String command = input.next();
            String theRest = input.nextLine().trim();

            if (command.equals("list")) {
                System.out.println(addressBook);
            } else if (command.equals("add")) {
                // luetaan nimi, email ja numero omiin muuttujiin
                String[] parts = theRest.split(",");
                String name = parts[0].trim();
                String email = parts[1].trim();
                String phone = parts[2].trim();

                // luodaan uusi kontakti
                Contact newContact = new Contact(name, email, phone);

                // lisätään listalle
                addressBook.add(newContact);
            } else if (command.equals("exit")) {
                running = false;
            } else {
                System.out.println("Unknown command :(");
            }

            System.out.println();
        }

        List<Contact> contactsToSave = addressBook.getContacts();
        AddressBookCsvOperations.saveContacts(contactsToSave, "contacts.csv");
    }
}
