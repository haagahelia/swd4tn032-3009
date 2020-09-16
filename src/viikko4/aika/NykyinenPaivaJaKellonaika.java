package viikko4.aika;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NykyinenPaivaJaKellonaika {

    public static void main(String[] args) {
        LocalTime kellonaika = LocalTime.now(); // nykyinen kellonaika
        System.out.println(kellonaika);

        LocalDate paivamaara = LocalDate.now(); // nykyinen päivämäärä
        System.out.println(paivamaara);

        LocalDateTime paivaJaKello = LocalDateTime.now(); // nykyinen päivä ja kellonaika
        System.out.println(paivaJaKello);
    }

}
