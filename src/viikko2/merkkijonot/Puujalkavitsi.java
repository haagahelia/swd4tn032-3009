package viikko2.merkkijonot;

import java.util.Scanner;

public class Puujalkavitsi {

    public static void main(String[] args) {
        final String oikeaVastaus = "muurahaiseksi";

        Scanner lukija = new Scanner(System.in);
        System.out.println("Miksi kutsutaan sellaista, joka ei käytä euroja, vaan muita rahoja?");

        String vastaus = lukija.nextLine();

        if (vastaus.equalsIgnoreCase(oikeaVastaus)) {
            System.out.println("Oikein!");
        } else {
            System.out.println("Väärin!");
        }
    }
}
