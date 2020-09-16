package viikko4.aika;

import java.time.LocalDate;

public class AikaolioidenLuominenTietystaAjanhetkesta {

    public static void main(String[] args) {
        LocalDate nykyhetki = LocalDate.now();

        LocalDate joulu = LocalDate.of(2020, 12, 24);

        System.out.println(nykyhetki);
        System.out.println(joulu);

        int nykyinenJarjestysnumero = nykyhetki.getDayOfYear();
        int joulunJarjestysnumero = joulu.getDayOfYear();

        int paiviaJouluun = joulunJarjestysnumero - nykyinenJarjestysnumero;
        System.out.println(paiviaJouluun);

    }
}
