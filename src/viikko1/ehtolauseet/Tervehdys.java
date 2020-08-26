package viikko1.ehtolauseet;

import java.time.LocalTime; // poista tämä rivi Viopessa

public class Tervehdys {

    public static void main(String[] args) {
        // Luodaan olio ja asetetaan se uuteen muuttujaan:
        LocalTime nykyhetki = LocalTime.now();

        // Kutsutaan metodia ja otetaan vastaus talteen:
        int tunnit = nykyhetki.getHour();

        // Tulostaa nykyisen ajanhetken tunnit:
        System.out.println(tunnit);

    }
}
