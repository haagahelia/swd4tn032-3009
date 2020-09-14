package viikko4.metodit;

/**
 * https://materiaalit.github.io/ohjelmointi-18/part2/
 * 
 * Creative Commons BY-NC-SA 4.0
 */
public class MetodiJokaPalauttaaKokonaisluvun {

    public static void main(String[] args) {
        // metodin suorituksen jälkeen sen palauttama arvo voidaan ottaa talteen:
        int luku = palautetaanAinaKymppi();

        System.out.println("metodi palautti: " + luku);
        System.out.println("metodi palautti: " + palautetaanAinaKymppi());
    }

    public static int palautetaanAinaKymppi() {
        // return-käsky palauttaa sen jälkeen olevan arvon:
        return 10;
    }
}
