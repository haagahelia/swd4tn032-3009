package viikko3.taulukot;

import java.util.Arrays;

public class MerkkijononPilkkominen {

    public static void main(String[] args) {
        String ajanhetki = "2020-9-19T7:9:18";

        String[] osat = ajanhetki.split("T");

        System.out.println(osat[0]); // "2020-9-19"
        System.out.println(osat[1]); // "7:9:18"

        String paivamaara = osat[0];
        String[] pvmOsat = paivamaara.split("-");

        String kellonaika = osat[1];
        String[] kelloOsat = kellonaika.split(":");

        System.out.println(Arrays.toString(pvmOsat)); // ["2020", "9", "19"]
        System.out.println(Arrays.toString(kelloOsat)); // ["7", "9", "18"]

        System.out.println();

        int vuosi = Integer.parseInt(pvmOsat[0]);
        int kuukausi = Integer.parseInt(pvmOsat[1]);
        int paiva = Integer.parseInt(pvmOsat[2]);

        int tunnit = Integer.parseInt(kelloOsat[0]);
        int minuutit = Integer.parseInt(kelloOsat[1]);
        int sekunnit = Integer.parseInt(kelloOsat[2]);

        // 19.9.2020 [pv, kk, vuosi] klo 7:9 [h:m]
        System.out.println("" + paiva + "." + kuukausi + "." + vuosi);
        System.out.println("Klo " + tunnit + ":" + minuutit);
    }
}
