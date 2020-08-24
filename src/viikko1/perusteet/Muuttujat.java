package viikko1.perusteet;

public class Muuttujat {

    public static void main(String[] args) {
        int leveys = 2; // int => integer => kokonaisluku
        int korkeus = 3;

        // arvoja voidaan käyttää yhtälailla muuttujien kautta kuin suoraan
        System.out.println(leveys); // 2
        System.out.println(korkeus); // 3

        // laskuoperaatiot muuttujilla tehdään kuten int-arvoilla
        System.out.println(leveys * korkeus); // 6

        int ala = leveys * korkeus;

        System.out.println(ala); // 6

        // muuttujiin voidaan asettaa myös uusia arvoja:
        leveys = 4;
        korkeus = 6;

        System.out.println(ala); // tulostaa edelleen 6
    }
}
