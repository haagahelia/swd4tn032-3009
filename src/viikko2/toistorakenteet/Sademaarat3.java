package viikko2.toistorakenteet;

import java.util.Scanner;

public class Sademaarat3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int yhteensa = 0;

        // Lasketaan viikon maksimisademäärä.
        // Alkuarvoksi riittävän pieni luku.
        int maksimi = -1;

        // Lasketaan viikon minimisademäärä
        int minimi = Integer.MAX_VALUE;

        // kysytään 7 sademäärää (1 viikko)
        for (int paiva = 0; paiva < 7; paiva++) {
            // Pyydetään syöte muodossa "Syötä X päivän sademäärä"
            System.out.print("Syötä " + (paiva + 1) + ". päivän sademäärä: ");
            int sademaara = lukija.nextInt();
            yhteensa += sademaara;

            if (sademaara > maksimi) {
                maksimi = sademaara;
            }

            if (sademaara < minimi) {
                minimi = sademaara;
            }
        }

        System.out.println();
        System.out.println("Sadetta yhteensä " + yhteensa + " millimetriä.");
        System.out.println("Viikon suurin sademäärä oli " + maksimi + " millimetriä.");
        System.out.println("Viikon pienin sademäärä oli " + minimi + " millimetriä.");
    }
}
