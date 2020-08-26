package viikko1.ehtolauseet;

public class VertailuOperaatiot {

    public static void main(String[] args) {
        System.out.println(3 < 6); // true
        System.out.println(3 > 6); // false

        boolean alleKolme = 1 < 3;

        System.out.println(alleKolme); // true

        int omaLuku = 10;

        System.out.println(omaLuku == 10); // true
        System.out.println(omaLuku < 11);
        System.out.println(omaLuku > 8);
        System.out.println(omaLuku != 11);
        System.out.println(omaLuku <= 10);
        System.out.println(omaLuku >= 10);
    }
}
