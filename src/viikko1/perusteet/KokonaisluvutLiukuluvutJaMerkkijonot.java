package viikko1.perusteet;

public class KokonaisluvutLiukuluvutJaMerkkijonot {

    public static void main(String[] args) {
        // kokonaisluvut
        int oletusKokonaisluku = 123;
        long tosiIsoKokonaisLuku = 100_100_100_100L;

        // liukuluvut, eli "double"
        final double PI = 3.141592; // piin arvo ei tule muuttumaan ohjelman aikana
        // final tekee muuttujasta vakion, eli muuttumattoman

        // merkkijonot, eli String
        String tervehdys = "Hello world!";

        // muuttujia voidaan aina käyttää niiden määrittelyn jälkeen:
        System.out.println(oletusKokonaisluku);

        System.out.println(tosiIsoKokonaisLuku);

        System.out.println(PI);

        System.out.println(tervehdys);
    }
}
