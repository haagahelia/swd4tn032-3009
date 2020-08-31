package viikko1.ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MatkalippujenHinnat {

    public static void main(String[] args) {
        final double KERTALIPUN_HINTA = 2.80;
        final double KUUKAUSILIPUN_HINTA = 53.00;

        Scanner lukija = new Scanner(System.in);
        DecimalFormat desimaalit = new DecimalFormat("0.00");

        System.out.println("Valitse lipputyyppi:");
        System.out.println("0: kuukausilippu");
        System.out.println("1: kertaliput");

        int vastaus = lukija.nextInt();

        if (vastaus == 0) {
            String muotoiltuLuku = desimaalit.format(KUUKAUSILIPUN_HINTA);
            System.out.println("Kuukausilippu maksaa " + muotoiltuLuku + " euroa");
        } else if (vastaus == 1) {
            System.out.print("Kuinka monta kertalippua käytät kuukaudessa? ");
            int kertalippujenMaara = lukija.nextInt();

            double kustannus = kertalippujenMaara * KERTALIPUN_HINTA;
            double erotus = Math.abs(KUUKAUSILIPUN_HINTA - kustannus);
            String muotoiltuLuku = desimaalit.format(erotus);

            if (kustannus > KUUKAUSILIPUN_HINTA) {
                System.out.println("Säästäisit " + muotoiltuLuku + " euroa ostamalla kuukausilipun");
            } else {
                System.out.println("Säästät " + muotoiltuLuku + " euroa verrattuna kuukausilippuun");
            }
        }
    }

}
