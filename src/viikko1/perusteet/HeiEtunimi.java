package viikko1.perusteet; // tämä rivi poistetaan Viopessa

import java.util.Scanner;

// Älä kopioi vastausta suoraan Viopeen, vaan toteuta oma ratkaisusi!
public class HeiEtunimi {

    public static void main(String[] args) {
        // 1. Luodaan uusi Scanner-olio
        Scanner lukija = new Scanner(System.in);

        // 2. Pyydetään käyttäjää kirjoittamaan nimensä
        System.out.print("Syötä etunimi: ");

        // 3. Luetaan käyttäjän kirjoittama teksti
        String nimi = lukija.nextLine();

        // 4. Tulostetaan tervehdys
        System.out.println("Hei " + nimi + "!");
    }
}
