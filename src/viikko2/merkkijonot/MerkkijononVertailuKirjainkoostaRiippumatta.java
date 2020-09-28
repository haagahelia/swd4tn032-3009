package viikko2.merkkijonot;

import java.util.Scanner;

public class MerkkijononVertailuKirjainkoostaRiippumatta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toista, kunnes käyttäjä syöttää "LOPPU"
        System.out.print("Anna nimi: ");
        String syote = lukija.nextLine();

        if (syote.equalsIgnoreCase("Lumi")) {
            // kasvata Lumi-laskuria sekä kokonaismäärää
            System.out.println("Syötit oikean sanan!");
        } else {
            // kasvata vain kokonaismäärää
            System.out.println("Syötit väärän sanan");
        }
    }
}
