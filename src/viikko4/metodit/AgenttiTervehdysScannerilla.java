package viikko4.metodit;

import java.util.Scanner;

/**
 * https://materiaalit.github.io/ohjelmointi-18/part2/
 * 
 * Creative Commons BY-NC-SA 4.0
 */
public class AgenttiTervehdysScannerilla {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä agentin etunimi: ");
        String etunimi = lukija.nextLine();

        System.out.print("Syötä agentin sukunimi: ");
        String sukunimi = lukija.nextLine();

        // metodikutsun parametriarvot voidaan lukea muuttujista:
        tervehdi(etunimi, sukunimi);

    }

    public static void tervehdi(String etu, String suku) {
        String tervehdys = "Nimeni on " + suku + ", " + etu + " " + suku;
        System.out.println(tervehdys);
    }
}
