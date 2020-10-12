package viikko8.kertaus;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Henkilotunnus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä henkilötunnus: ");
        String tunnus = lukija.nextLine();

        tulostaHenkilonTiedot(tunnus);
    }

    private static void tulostaHenkilonTiedot(String hetu) {
        System.out.println(hetu);

        // Kokeile lauseketta täällä: https://regex101.com/r/Gi0XYY/2
        String hetuRegex = "[0-9]{6}[A\\-\\+][0-9]{3}[0-9A-Y]";

        // 1: tarkistetaan, että tunnus on oikeassa muodossa
        // 1.1: tehdään säännöllinen lauseke
        if (!hetu.matches(hetuRegex)) {
            System.out.println("Henkilötunnus on väärässä muodossa");
            return;
        }

        // 2: tarkistetaan, että päivämäärä on oikeasti olemassa
        // 2.1: tehdään poikkeuksenkäsittelyä
        // 2.2: tarvitaan substring-metodia
        LocalDate syntymaAika = poimiSyntymaAika(hetu);

        if (syntymaAika == null) {
            System.out.println("Virheellinen päivämäärä.");
            return;
        }

        // 3: tarkistetaan tarkistusmerkki
        // 3.1: merkkijonojen muuntamista numeroiksi ja jakojäännös
        String oikeaTarkistusMerkki = laskeTarkistusMerkki(hetu);
        String syotettyTarkistusMerkki = hetu.substring(10, 11);

        if (!oikeaTarkistusMerkki.equals(syotettyTarkistusMerkki)) {
            System.out.println("Virheellinen tarkistusmerkki, pitäisi olla: " + oikeaTarkistusMerkki);
            return;
        }

        // 4: jos kaikki on OK, tulostetaan henkilön sukupuoli ja ikä
        String sukupuoliMerkki = hetu.substring(9, 10);
        if (Integer.parseInt(sukupuoliMerkki) % 2 == 0) {
            System.out.println("nainen");
        } else {
            System.out.println("mies");
        }

        System.out.println("Ikä: " + ChronoUnit.YEARS.between(syntymaAika, LocalDate.now()));
    }

    private static LocalDate poimiSyntymaAika(String hetu) {
        String paivaStr = hetu.substring(0, 2);
        int paiva = Integer.parseInt(paivaStr);

        String kuukausiStr = hetu.substring(2, 4);
        int kuukausi = Integer.parseInt(kuukausiStr);

        String vuosisataMerkki = hetu.substring(6, 7);

        int vuosi = Integer.parseInt(hetu.substring(4, 6));

        if (vuosisataMerkki.equals("+")) {
            vuosi += 1800;
        } else if (vuosisataMerkki.equals("-")) {
            vuosi += 1900;
        } else {
            vuosi += 2000;
        }

        try {
            return LocalDate.of(vuosi, kuukausi, paiva);

        } catch (DateTimeException paivamaaraPoikkeus) {
            return null;

        }
    }

    // "Tunnuksen 9 ensimmäistä merkkiä tulkitaan 9-numeroiseksi luvuksi, joka
    // jaetaan luvulla 31"
    // https://www.tuomas.salste.net/doc/hetu/tunnus.html
    private static String laskeTarkistusMerkki(String hetu) {
        String ekatNumerot = hetu.substring(0, 6);
        String loppuNumerot = hetu.substring(7, 10);
        String lukuStr = ekatNumerot + loppuNumerot;
        int luku = Integer.parseInt(lukuStr);

        int jakojaannos = luku % 31;
        String tarkistusMerkit = "0123456789ABCDEFHJKLMNPRSTUVWXY";

        return tarkistusMerkit.substring(jakojaannos, jakojaannos + 1);
    }
}
