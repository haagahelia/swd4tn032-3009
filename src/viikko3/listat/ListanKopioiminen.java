package viikko3.listat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListanKopioiminen {

    public static void main(String[] args) {
        List<String> kilpailijat = new ArrayList<>();
        kilpailijat.add("Neziri"); // voittaja
        kilpailijat.add("Harala"); // hopea
        kilpailijat.add("Korte"); // pronssi

        // Halutaan tulostaa kilpailijat aakkosjärjestyksessä:
        System.out.println("Osallistujat:");

        // Tehdään kopio, jotta alkuperäinen järjestys ei muutu:
        List<String> kopio = new ArrayList<>(kilpailijat);

        Collections.sort(kopio);
        for (String nimi : kopio) {
            System.out.println(nimi);
        }

        System.out.println();

        // Halutaan tulostaa kilpailijat lisäysjärjestyksessä:
        System.out.println("Sijoitukset: ");
        for (int sijoitus = 0; sijoitus < kilpailijat.size(); sijoitus++) {
            String nimi = kilpailijat.get(sijoitus);
            System.out.println(sijoitus + " " + nimi);
        }
    }
}
