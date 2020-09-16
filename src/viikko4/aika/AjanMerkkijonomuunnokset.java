package viikko4.aika;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjanMerkkijonomuunnokset {

    public static void main(String[] args) {
        String pvm = "2020-09-01";
        LocalDate paiva = LocalDate.parse(pvm);
        System.out.println(paiva);

        String suomalainenPvm = "1.9.2020";

        DateTimeFormatter formaatti = DateTimeFormatter.ofPattern("d.M.yyyy");

        LocalDate paiva2 = LocalDate.parse(suomalainenPvm, formaatti);
        System.out.println(paiva2);

        // tulostetaan nykyinen päivämäärä suomalaisessa formaatissa:
        LocalDate tanaan = LocalDate.now();

        // "16.9.2020"
        String muotoiltu = formaatti.format(tanaan);
        System.out.println(muotoiltu);
    }
}
