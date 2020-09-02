package viikko2.merkkijonot;

import java.util.Scanner;

public class PalindrominTarkastaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä tekstiä niin tarkistan, onko se palindromi:");
        String syote = lukija.nextLine().toLowerCase(); // esim. "saippuakivikauppias"

        int vikaIndeksi = syote.length() - 1;

        // kaksi askeltajaa:
        int alku = 0;
        int loppu = vikaIndeksi;

        // "yksisuuntainen lippu"
        boolean onPalindromi = true;

        while (alku < loppu) {
            String alkuString = syote.substring(alku, alku + 1);
            String loppuString = syote.substring(loppu, loppu + 1);

            boolean sama = alkuString.equals(loppuString);
            if (!sama) {
                onPalindromi = false;
            }

            alku++;
            loppu--;
        }

        if (onPalindromi) {
            System.out.println(syote + " on palindromi");
        } else {
            System.out.println(syote + " ei ole palindromi");
        }
    }
}
