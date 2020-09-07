package viikko3.listat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaltaHakeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        List<String> lista = new ArrayList<String>();

        lista.add("Hamilton"); // 0
        lista.add("Bottas"); // 1
        lista.add("Räikkönen"); // 2
        lista.add("Vettel"); // 3

        System.out.println(lista);

        int pituus = lista.size();
        System.out.println(pituus);

        String eka = lista.get(0); // "Hamilton"

        System.out.println(eka.toUpperCase());

        System.out.println(lista.get(1).toUpperCase());

        System.out.print("Syötä listan indeksi: ");
        int indeksi = lukija.nextInt();

        if (indeksi >= 0 && indeksi <= lista.size()) {
            System.out.println(lista.get(indeksi).toUpperCase());
        } else {
            System.out.println("Virheellinen indeksi!");
        }
    }
}
