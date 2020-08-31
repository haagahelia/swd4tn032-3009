package viikko2.toistorakenteet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sademaarat1 {

    // kysytään käyttäjältä viikon sademäärät ja kerrotaan niiden summa ja keskiarvo
    public static void main(String[] args) {

        DecimalFormat desimaalit = new DecimalFormat("0.0");
        Scanner lukija = new Scanner(System.in);

        int yhteensa = 0;

        int i = 0;
        while (i < 7) {
            System.out.print("Syötä päivän sademäärä millimetreinä: ");
            int sademaara = lukija.nextInt();

            yhteensa += sademaara;

            i = i + 1;
            // i += 1; // kasvattaa yhdellä
            // i++; // kasvattaa yhdellä
        }

        System.out.println(); // tyhjä rivinvaihto

        System.out.println("Sademäärä yhteensä " + yhteensa + " millimetriä.");

        double keskiarvo = yhteensa / 7.0;
        System.out.println("Päivittäinen sademäärä keskimäärin " + desimaalit.format(keskiarvo) + " millimetriä.");
    }

}
