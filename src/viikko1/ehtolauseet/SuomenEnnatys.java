package viikko1.ehtolauseet;

import java.util.Scanner;

public class SuomenEnnatys {

    public static void main(String[] args) {
        double suomenEnnatys = 12.72;

        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna 100 metrin aitajuoksun tulos: ");

        double tulos = lukija.nextDouble();

        if (tulos < suomenEnnatys) {
            System.out.println("Uusi Suomen ennätys!");
        }

        lukija.close(); // scannerin sulkeminen on vapaaehtoinen operaatio (Java kuitenkin varoittaa
                        // "resource leak")
    }
}
