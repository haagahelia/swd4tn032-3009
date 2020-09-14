package viikko4.metodit;

public class OhjelmointiWiki {

    public static void main(String[] args) {
        System.out.println("Alku");

        // metodikutsu siirtää ohjelman suorituksen hetkeksi toisaalle:
        tulostaCopyright(); // luokan ulkopuolelta: OhjelmointiWiki.tulostaCopyright();

        // metodikutsun jälkeen palataan taas main-metodiin, jota jatketaan:
        System.out.println("Loppu");
    }

    public static void tulostaCopyright() {
        System.out.println("Tämä oppimateriaali on lisensoitu Creative Commons BY-NC-SA -lisenssillä.");
    }
}
