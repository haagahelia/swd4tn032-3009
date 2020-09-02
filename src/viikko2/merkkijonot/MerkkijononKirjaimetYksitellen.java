package viikko2.merkkijonot;

public class MerkkijononKirjaimetYksitellen {

    public static void main(String[] args) {
        String syote = "sovelluskehitin";

        // viimeinen indeksi on aina pituus - 1:
        int vikaIndeksi = syote.length() - 1;

        for (int i = 0; i <= vikaIndeksi; i++) {
            // tulostetaan kirjain, joka on indeksissä i:
            String kirjain = syote.substring(i, i + 1);
            System.out.println(kirjain);
        }
    }
}
