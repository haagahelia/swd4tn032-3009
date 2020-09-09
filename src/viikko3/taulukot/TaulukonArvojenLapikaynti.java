package viikko3.taulukot;

public class TaulukonArvojenLapikaynti {

    public static void main(String[] args) {
        int[] lampotilat = { 17, 15, 14, 16, 16, 17, 17, 16 };

        int pituus = lampotilat.length;
        System.out.println(pituus); // 8

        System.out.println();

        int summa = 0;

        int minimi = Integer.MAX_VALUE;
        int maksimi = Integer.MIN_VALUE;

        // taulukolla on indeksit 0-7 (pituus - 1)
        for (int lampotila : lampotilat) {

            summa += lampotila;
            minimi = Math.min(minimi, lampotila);
            maksimi = Math.max(maksimi, lampotila);
        }

        System.out.println("Suurin lämpötila: " + maksimi);
        System.out.println("Pienin lämpötila: " + minimi);
        System.out.println("Keskiarvo: " + (1.0 * summa / lampotilat.length));
    }
}
