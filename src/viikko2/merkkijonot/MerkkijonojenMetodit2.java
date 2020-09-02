package viikko2.merkkijonot;

public class MerkkijonojenMetodit2 {

    public static void main(String[] args) {
        String kaupunki = "Espoo";

        // merkkijonojen indeksit alkavat aina nollasta!
        System.out.println(kaupunki.charAt(0)); // E

        // viimeinen kirjain
        System.out.println(kaupunki.charAt(4)); // o

        int pituus = kaupunki.length();
        System.out.println(pituus); // 5

        // viimeisen merkin indeksi on aina pituus - 1
        System.out.println(kaupunki.charAt(pituus - 1)); // o

        String kayttajanSyote = "";

        // osa metodeista palauttaa boolea-arvoja:
        if (kayttajanSyote.isEmpty()) {
            System.out.println("isEmpty kertoo, onko merkkijono tyhjä!");
        }

        String tervehdys = "Hyvää huomenta";

        // Voimme vaihtaa osan merkkijonosta toiseksi:
        String uusiTervehdys = tervehdys.replace("Hyvää", "Erinomaista");

        System.out.println(tervehdys); // Hyvää huomenta
        System.out.println(uusiTervehdys); // Erinomaista huomenta
    }
}
