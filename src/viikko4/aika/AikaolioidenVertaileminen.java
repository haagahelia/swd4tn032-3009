package viikko4.aika;

import java.time.LocalDate;

public class AikaolioidenVertaileminen {

    // Talvi alkaa lokakuun 1. päivä! Onko nyt talvi?
    public static void main(String[] args) {

        LocalDate tanaan = LocalDate.now();

        LocalDate talvenAlku = LocalDate.parse("2020-10-01");

        if (tanaan.equals(talvenAlku) || tanaan.isAfter(talvenAlku)) {
            System.out.println("Nyt on talvi");
        } else {
            // tässä ei ole tarkistettu, olisiko vaikka tammi- tai helmikuu
            System.out.println("Nyt ei ehkä ole talvi :)");
        }
    }
}
