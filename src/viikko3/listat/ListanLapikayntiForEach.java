package viikko3.listat;

import java.util.List;

public class ListanLapikayntiForEach {

    public static void main(String[] args) {

        List<String> paivat = List.of("maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai",
                "sunnuntai", "tänään");

        // for each -toistorakenne:
        for (String paivanNimi : paivat) {

            if (paivanNimi.startsWith("t")) {
                System.out.println(paivanNimi);
            }
        }
    }
}
