package viikko5.oliot.kaupungit_v1;

/**
 * Olioiden luominen ja oliomuuttujat
 */
public class KaupunkiOhjelma {

    public static void main(String[] args) {

        Kaupunki hki = new Kaupunki();

        hki.nimi = "Helsinki";
        hki.vakiluku = 653_867;
        hki.pintaAla = 214.25;

        System.out.println(hki.nimi);
        System.out.println(hki.vakiluku);
        System.out.println(hki.laskeVaestontiheys());

        /*
         * { nimi: "Helsinki", vakiluku: 653867, pintaAla: 214.25 }
         */

        System.out.println();

        Kaupunki esp = new Kaupunki();

        esp.nimi = "Espoo";
        esp.vakiluku = 289_413;
        esp.pintaAla = 312.32;

        System.out.println(esp.nimi);
        System.out.println(esp.vakiluku);
        System.out.println(esp.laskeVaestontiheys());

        /*
         * { nimi: "Espoo", vakiluku: 289413, pintaAla: 312.32 }
         */

    }
}
