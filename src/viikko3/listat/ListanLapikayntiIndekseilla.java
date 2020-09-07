package viikko3.listat;

import java.util.List;

public class ListanLapikayntiIndekseilla {

    // tulostetaan päivät, jotka alkavat kirjaimella "t"
    public static void main(String[] args) {

        List<String> paivat = List.of("maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai",
                "sunnuntai", "tänään");

        // tulostetaan listan sisältö yksi kerrallaan:
        for (int i = 0; i < paivat.size(); i++) {
            String paivanNimi = paivat.get(i);

            if (paivanNimi.startsWith("t")) {
                System.out.println(paivanNimi);
            }
        }
    }
}
