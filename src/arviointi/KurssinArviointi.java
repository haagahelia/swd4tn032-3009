package arviointi;

import static arviointi.OsasuoritustenArviointi.*;

public class KurssinArviointi {
    private static int viopeMaksimi;
    private static int kokeenMaksimi;

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
