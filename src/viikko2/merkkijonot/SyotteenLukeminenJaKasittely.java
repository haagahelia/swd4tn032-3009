package viikko2.merkkijonot;

import java.util.Scanner;

public class SyotteenLukeminenJaKasittely {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna tuotteen nimi: ");
        String tuotenimi = lukija.nextLine().trim().toUpperCase();

        System.out.println("Nimi: " + tuotenimi);
    }
}
