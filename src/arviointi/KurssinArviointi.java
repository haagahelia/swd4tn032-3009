package arviointi;

import static arviointi.OsasuoritustenArviointi.*;

public class KurssinArviointi {
    // tehtävien ja kokeen maksimipisteet lukitaan kurssin aikana:
    private static int viopeMaksimi = 58; // bonukset huomioiden maksimi on 73
    private static int kokeenMaksimi = 25;

    public static int laskeLoppuarvosana(int tehtavienPisteet, int kokeenPisteet) {
        double viopeArvosana = laskeArvosana(tehtavienPisteet, viopeMaksimi);
        double kokeenArvosana = laskeArvosana(kokeenPisteet, kokeenMaksimi);

        if (viopeArvosana > 0 && kokeenArvosana > 0) {
            double keskiarvo = (viopeArvosana + kokeenArvosana) / 2;
            return (int) Math.round(keskiarvo);
        } else {
            return 0;
        }
    }
}
