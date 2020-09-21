package viikko5.oliot.kaupungit_v3;

/*
 * Tämä luokka toimii esimerkkinä luokan merkkijonoesityksestä:
 */
public class Kaupunki {

    private String nimi;
    private int perustamisVuosi;

    public Kaupunki(String nimi, int perustamisVuosi) {
        this.nimi = nimi;
        this.perustamisVuosi = perustamisVuosi;
    }

    @Override
    public String toString() {
        // esim: "Espoo (perustettu 1400)"
        return this.nimi + " (" + this.perustamisVuosi + ")";
    }
}
