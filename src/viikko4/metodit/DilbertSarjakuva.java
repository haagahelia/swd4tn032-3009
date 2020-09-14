package viikko4.metodit;

import java.util.Scanner;

public class DilbertSarjakuva {

    // https://dilbert.com/strip/2000-08-19
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä etunimi: ");
        String etu = lukija.nextLine();

        System.out.print("Syötä sukunimi: ");
        String suku = lukija.nextLine();

        String kayttajanimi = UsernameGenerator.generateUsername(etu, suku);
        System.out.println("Käyttäjänimi on " + kayttajanimi);
    }
}
