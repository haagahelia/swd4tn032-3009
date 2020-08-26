package viikko1.perusteet;

import java.util.Scanner;

//Älä kopioi vastausta suoraan Viopeen, vaan toteuta oma ratkaisusi!
public class Juhlat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna juhliin tulevien aikuisten määrä: ");
        int aikuisia = lukija.nextInt();

        int pulloja = (int) Math.ceil(aikuisia / 7.0);

        System.out.println("Pulloja tarvitaan " + pulloja + " kappaletta");

        int jaaYli = pulloja * 7 - aikuisia;
        System.out.println("Viimeisestä pullosta jää " + jaaYli + " lasia");
    }
}
