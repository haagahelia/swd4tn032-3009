package viikko6.oliot.listat;

import viikko5.oliot.kaupungit_v2.Kaupunki;

public class MaaKaupunkiOhjelma {

    public static void main(String[] args) {

        Maa ruotsi = new Maa("Ruotsi");
        Kaupunki tukholma = new Kaupunki("Tukholma", 1270, 923_516, 214.59);

        ruotsi.lisaaKaupunki(tukholma);

        System.out.println("Ruotsin väkiluku: " + ruotsi.laskeVakiluku());
        System.out.println("Ruotsin pinta-ala: " + ruotsi.laskePintaAla());
        System.out.println("Ruotsin väestöntiheys: " + ruotsi.laskeVaestontiheys());
        Maa suomi = new Maa("Suomi");

        Kaupunki hki = new Kaupunki("Helsinki", 1550, 653_867, 214.25);
        Kaupunki esp = new Kaupunki("Espoo", 1400, 291_086, 312.32);

        suomi.lisaaKaupunki(hki);
        suomi.lisaaKaupunki(esp);

        System.out.println("Suomen väkiluku: " + suomi.laskeVakiluku());
        System.out.println("Suomen pinta-ala: " + suomi.laskePintaAla());
        System.out.println("Suomen väestöntiheys: " + suomi.laskeVaestontiheys());
    }
}
