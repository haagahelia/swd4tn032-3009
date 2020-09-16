package viikko4.aika;

import java.time.Year;

public class Karkausvuosi {

    public static void main(String[] args) {
        boolean karkausvuosi = Year.of(2020).isLeap();
        System.out.println(karkausvuosi);
    }
}
