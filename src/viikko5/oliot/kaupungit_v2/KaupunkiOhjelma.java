package viikko5.oliot.kaupungit_v2;

public class KaupunkiOhjelma {

    public static void main(String[] args) {
        Kaupunki hki = new Kaupunki("Helsinki", 1550, 653_867, 214.25);

        System.out.println(hki.getNimi());
        System.out.println(hki.getVakiluku());

        // asetetaan Helsingille uusi väkiluku:
        hki.setVakiluku(655_395);

        System.out.println(hki.laskeVaestontiheys());

        Kaupunki esp = new Kaupunki("Espoo", 1400, 291_086, 312.32);

        if (hki.onVanhempiKuin(esp)) {
            System.out.println("Helsinki on vanhempi");
        } else {
            System.out.println("Espoo on vanhempi");
        }
    }
}
