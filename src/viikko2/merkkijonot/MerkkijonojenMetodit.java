package viikko2.merkkijonot;

public class MerkkijonojenMetodit {

    public static void main(String[] args) {
        String kaupunki = "Helsinki";

        System.out.println(kaupunki.toUpperCase()); // ISOILLA
        System.out.println(kaupunki.toLowerCase()); // pienillä

        System.out.println(kaupunki); // alkuperäinen merkkijono on ennallaan

        System.out.println(kaupunki.length());

        String kayttajanSyote = "  Turku ";
        System.out.println(kayttajanSyote.trim());
    }
}
