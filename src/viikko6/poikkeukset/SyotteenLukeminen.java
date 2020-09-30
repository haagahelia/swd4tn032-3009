package viikko6.poikkeukset;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SyotteenLukeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä liukuluku: ");
        double luku = 0;

        try {
            // jos rivi heittää poikkeuksen, hypätään saman tien catch-lohkoon
            luku = lukija.nextDouble();

            System.out.println("Syötit luvun " + luku);

        } catch (InputMismatchException e) {
            System.err.println("Antamasi syöte oli virheellinen");

        } catch (NoSuchElementException e) {
            System.err.println("Tietovirta on luettu loppuun");

        }

        lukija.close();
    }
}
