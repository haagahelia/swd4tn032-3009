package viikko4.aika;

import java.time.LocalDate;
import java.time.LocalTime;

public class AjanLaskeminenOlioilla {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();

        // kaikki plus- ja minus-metodit palauttavat uusia olioita!
        LocalDate viikonPaasta = tanaan.plusDays(7);

        System.out.println(viikonPaasta);

        LocalTime kymmenenMinuutinPaasta = LocalTime.now().plusMinutes(10);

        System.out.println(kymmenenMinuutinPaasta);
    }
}
