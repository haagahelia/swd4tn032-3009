package viikko3.taulukot;

import java.util.Scanner;

public class CsvKaupungit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä 'kaupunki,väkiluku'. Tyhjä rivi lopettaa: ");

        int vakilukuSumma = 0;
        int minimiVakiluku = Integer.MAX_VALUE;
        String pieninKaupunki = "ei tiedossa";

        int maksimiVakiluku = Integer.MIN_VALUE;
        String suurinKaupunki = "ei tiedossa";

        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.isEmpty()) {
                break; // tyhjä rivi lopettaa
            } else {
                String[] nimiJaVakiluku = rivi.split(",");
                String nimi = nimiJaVakiluku[0];
                int vakiluku = Integer.parseInt(nimiJaVakiluku[1]);

                vakilukuSumma += vakiluku;

                if (vakiluku > maksimiVakiluku) {
                    maksimiVakiluku = vakiluku;
                    suurinKaupunki = nimi;
                }
                if (vakiluku < minimiVakiluku) {
                    minimiVakiluku = vakiluku;
                    pieninKaupunki = nimi;
                }
            }
        }

        System.out.println("Väkiluku yhteensä: " + vakilukuSumma);
        System.out.println("Suurin väkiluku: " + maksimiVakiluku + " (" + suurinKaupunki + ")");
        System.out.println("Pienin väkiluku: " + minimiVakiluku + " (" + pieninKaupunki + ")");
    }
}
