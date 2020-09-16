package viikko4.aika;

import java.time.LocalDateTime;

public class ArvojenHakeminenAikaolioilta {

    public static void main(String[] args) {
        // 'nyt' on LocalDateTime-tyyppinen olio:
        LocalDateTime nyt = LocalDateTime.now();

        // päivämäärään liittyvien osien pyytäminen
        System.out.println(nyt.getYear());
        System.out.println(nyt.getMonthValue());
        System.out.println(nyt.getDayOfMonth());

        // kellonaikaan liittyvien osien pyytäminen
        int tunnit = nyt.getHour();
        System.out.println(tunnit);

        System.out.println(nyt.getMinute());
        System.out.println(nyt.getSecond());
    }
}
