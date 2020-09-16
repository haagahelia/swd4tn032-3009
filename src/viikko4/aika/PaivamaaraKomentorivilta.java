package viikko4.aika;

import java.time.LocalDate;
import java.time.Period;

public class PaivamaaraKomentorivilta {

    /*
     * Tämä ohjelma ei kysykään tietoja scannerin avulla, vaan lukee parametreja
     * komentoriviltä args-taulukon avulla!
     */
    public static void main(String[] args) {

        String paivamaara = args[0];

        LocalDate annettu = LocalDate.parse(paivamaara);

        Period aikavali = Period.between(annettu, LocalDate.now());

        System.out.println("Annetusta päivästä on " + aikavali.getYears() + " vuotta, " + aikavali.getMonths()
                + " kuukautta ja " + aikavali.getDays() + " päivää.");
    }
}
