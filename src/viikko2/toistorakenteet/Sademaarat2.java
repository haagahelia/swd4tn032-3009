package viikko2.toistorakenteet;

import java.util.Scanner;

public class Sademaarat2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int yhteensa = 0;
        int paivia = 0;

        // kysytään sademääriä, kunnes käyttäjä syöttää negatiivisen luvun
        while (true) {
            System.out.print("Syötä seuraava sademäärä millimetreinä: ");
            int sademaara = lukija.nextInt();

            // onko käyttäjä syöttänyt negatiivisen luvun?
            if (sademaara < 0) {
                break; // break poistuu toistosta välittömästi
            } else {
                yhteensa += sademaara;
                paivia += 1;
            }
        }

        System.out.println();
        System.out.println("Sademäärä yhteensä " + yhteensa + " millimetriä.");

        // kokonaisluku saadaan liukuvuksi esimerkiksi kertomalla 1.0:lla:
        System.out.println("Sademäärä keskimäärin " + 1.0 * yhteensa / paivia + " millimetriä.");
    }
}
