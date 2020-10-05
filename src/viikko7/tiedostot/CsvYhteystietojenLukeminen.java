package viikko7.tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import viikko7.tiedostot.phonebook.AddressBook;
import viikko7.tiedostot.phonebook.Contact;

public class CsvYhteystietojenLukeminen {

    public static void main(String[] args) {
        Path csvTiedosto = Paths.get("tekstitiedostot", "contacts.csv");
        AddressBook osoitekirja = new AddressBook();

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
                osoitekirja.add(uusiKontakti);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(osoitekirja);

        System.out.println();

        // kokeillaan AddressBook-luokan metodia luetulla datalla:
        Contact etsitty = osoitekirja.search("Matti");
        System.out.println(etsitty);
    }
}
