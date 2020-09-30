package viikko6.poikkeukset;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class KaupungitVerkosta {

    public static void main(String[] args) {
        List<Kaupunki> kaupungit = haeKaupungit();

        // edistynyttä sisältöä 🌶️
        Collections.sort(kaupungit, Comparator.comparing(Kaupunki::getNimi));

        for (Kaupunki k : kaupungit) {
            if (k.getVakiluku() > 10_000) {
                System.out.println(k.getNimi());
            }
        }
    }

    private static List<Kaupunki> haeKaupungit() {
        List<Kaupunki> kaupungit = new ArrayList<>();
        Scanner lukija = null;

        try {
            URL csvTiedostoVerkossa = new URL("https://git.io/Jv3N3");
            InputStream tietovirtaVerkosta = csvTiedostoVerkossa.openStream();

            lukija = new Scanner(tietovirtaVerkosta, "utf-8");

            String ekaRivi = lukija.nextLine(); // eka rivi sisältää vain otsikot

            while (lukija.hasNextLine()) {
                String seuraavaRivi = lukija.nextLine();

                String[] osat = seuraavaRivi.split(",");
                String nimi = osat[0];
                int vakiluku = Integer.parseInt(osat[1]);

                kaupungit.add(new Kaupunki(nimi, vakiluku));
            }

        } catch (MalformedURLException virheellinenOsoitePoikkeus) {
            System.err.println(virheellinenOsoitePoikkeus.getMessage());

        } catch (IOException tiedonsiirtoVirhe) {
            System.err.println("Virhe tiedonsiirrossa: " + tiedonsiirtoVirhe.getMessage());

        } finally {
            if (lukija != null) {
                lukija.close();
            }
        }
        return kaupungit;
    }
}
