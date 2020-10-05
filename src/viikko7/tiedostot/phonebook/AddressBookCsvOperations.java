package viikko7.tiedostot.phonebook;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressBookCsvOperations {

    public static List<Contact> readContacts(String filename) {
        Path csvTiedosto = Paths.get("tekstitiedostot", "contacts.csv");
        List<Contact> kontaktit = new ArrayList<>();

        try {
            List<String> rivit = Files.readAllLines(csvTiedosto, StandardCharsets.UTF_8);

            String otsikkorivi = rivit.get(0);
            String[] otsikot = otsikkorivi.split(",");
            List<String> otsikkoLista = Arrays.asList(otsikot);

            int etunimiIndeksi = otsikkoLista.indexOf("First Name");
            int sukunimiIndeksi = otsikkoLista.indexOf("Last Name");
            int emailIndeksi = otsikkoLista.indexOf("E-mail Address");
            int puhelinIndeksi = otsikkoLista.indexOf("Other Phone");

            for (int i = 1; i < rivit.size(); i++) {
                String rivi = rivit.get(i);
                String[] osat = rivi.split(",");

                // FIXME: Ihan älytöntä käsitellä indeksejä kovakoodatuilla kokonaisluvuilla!
                String etunimi = osat[etunimiIndeksi];
                String sukunimi = osat[sukunimiIndeksi];
                String kokonimi = etunimi + " " + sukunimi;
                String email = osat[emailIndeksi];
                String puhelin = osat[puhelinIndeksi];

                Contact uusiKontakti = new Contact(kokonimi, email, puhelin);
                kontaktit.add(uusiKontakti);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kontaktit;
    }

    public static boolean saveContacts(List<Contact> contacts, String filename) {
        List<String> output = new ArrayList<>();

        String[] headers = { "First Name", "Last Name", "E-mail Address", "Other Phone" };
        String headerString = String.join(",", headers);

        output.add(headerString);

        for (Contact c : contacts) {
            String[] names = c.getName().split(" ");
            String firstName = names[0];
            String lastName = names[1]; // TODO: keksi parempi tapa varautua erilaisiin nimiin

            String[] row = { firstName, lastName, c.getEmail(), c.getPhone() };
            String rowString = String.join(",", row);

            output.add(rowString);
        }

        try {
            Path filePath = Paths.get("tekstitiedostot", filename);
            Files.write(filePath, output, StandardCharsets.UTF_8);

            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
