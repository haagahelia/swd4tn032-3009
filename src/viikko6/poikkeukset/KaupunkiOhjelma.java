package viikko6.poikkeukset;

import java.util.Scanner;

public class KaupunkiOhjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Syötä kaupungin nimi: ");
            String nimi = lukija.nextLine();

            if (nimi.isEmpty()) {
                break;
            }

            try {
                System.out.print("Syötä kaupungin väkiluku: ");
                String rivi = lukija.nextLine();
                int vakiluku = Integer.parseInt(rivi);

                Kaupunki uusi = new Kaupunki(nimi, vakiluku);
                System.out.println(uusi);

            } catch (NumberFormatException numerovirhe) {
                System.err.println("Virhe numerossa: " + numerovirhe.getMessage());

            } catch (IllegalArgumentException poikkeus) {
                System.err.println("Virhe kaupungin luomisessa: " + poikkeus.getMessage());

            }

            System.out.println();
        }
    }
}
