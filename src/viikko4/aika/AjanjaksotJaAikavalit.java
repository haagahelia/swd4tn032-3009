package viikko4.aika;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AjanjaksotJaAikavalit {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();

        LocalDate joulu = tanaan.withMonth(12).withDayOfMonth(24);

        Period ajanjakso = Period.between(tanaan, joulu);

        System.out.println("Jouluun on " + ajanjakso.getYears() + " vuotta, " + ajanjakso.getMonths() + " kuukautta ja "
                + ajanjakso.getDays() + " päivää.");

        long paiviaJouluun = ChronoUnit.DAYS.between(tanaan, joulu);

        System.out.println("Jouluun on " + paiviaJouluun + " päivää 🎅.");
    }
}
