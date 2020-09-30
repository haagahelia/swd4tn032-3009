package viikko6.poikkeukset;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MontaMahdollistaPoikkeusta {

    public static void main(String[] args) {
        String[] paivat = { "ma", "ti", "ke", "to", "pe", "la", "su" };
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä viikonpäivän numero: ");

        try {
            int paivanNumero = lukija.nextInt();

            System.out.println("Viikon " + paivanNumero + ". päivä on " + paivat[paivanNumero - 1]);

        } catch (InputMismatchException syotePoikkeus) {
            String virheviesti = syotePoikkeus.getMessage();

            System.out.println("Virheellinen syöte: " + virheviesti);

        } catch (ArrayIndexOutOfBoundsException indeksiPoikkeus) {

            System.out.println("Virheellinen indeksi: " + indeksiPoikkeus.getMessage());

        } finally {
            // finally-lohko suoritetaan aina, eli
            // - jos try päästiin loppuun ilman virhettä
            // - jos päädyttiin mihin tahansa catch-lohkoon
            // - jos try:n tai catch:n sisältä poistuttiin return-käskyllä
            // - jos tapahtuu mikä vain poikkeus, jono ei ole varauduttu
            lukija.close();

        }
    }
}
