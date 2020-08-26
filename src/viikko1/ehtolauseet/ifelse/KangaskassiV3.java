package viikko1.ehtolauseet.ifelse;

import java.util.Scanner;

// https://www.is.fi/taloussanomat/art-2000006283077.html
public class KangaskassiV3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ostostesi kokonaissumma: ");
        int ostokset = lukija.nextInt();

        // ensimmäinen toteutunut ehto suoritetaan, muut jäävät suorittamatta
        if (ostokset >= 25_000) {
            System.out.println("Saat violettikuvioisen kassin");
        } else if (ostokset >= 10_000) {
            System.out.println("Saat sinikuvioisen kassin");
        } else if (ostokset >= 6_000) {
            System.out.println("Saat vihreäkuvioisen kassin");
        } else if (ostokset >= 3_000) {
            System.out.println("Saat mustakuvioisen kassin");
        } else {
            System.out.println("Et saa kangaskassia :(");
        }
    }
}
