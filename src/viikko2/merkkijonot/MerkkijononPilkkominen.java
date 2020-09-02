package viikko2.merkkijonot;

public class MerkkijononPilkkominen {

    public static void main(String[] args) {

        String urlOsoite = "https://www.haaga-helia.fi";

        // Selvitetään eri tavoilla, alkaako osoite https-protokollalla?

        int indeksi = urlOsoite.indexOf("https://");
        if (indeksi == 0) {
            System.out.println("Osoite on salattu");
        } else {
            System.out.println("Osoitetta ei ole salattu");
        }
        // tapa 2: startsWith-metodi:
        boolean onSalattu = urlOsoite.startsWith("https://");

        String sahkoposti = "etunimi.sukunimi@haaga-helia.fi";

        int atMerkinIndeksi = sahkoposti.indexOf("@");

        System.out.println(atMerkinIndeksi);

        String alkuosa = sahkoposti.substring(0, atMerkinIndeksi);
        System.out.println(alkuosa);

        String loppuosa = sahkoposti.substring(atMerkinIndeksi + 1);
        System.out.println(loppuosa);

        int pisteenIndeksi = alkuosa.indexOf(".");
        System.out.println(pisteenIndeksi);
    }
}
