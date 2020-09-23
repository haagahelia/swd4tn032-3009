package viikko5.oliot.kaupunki_ja_maa;

public class Kaupunki {

    private String nimi;
    private int vakiluku;
    private double pintaAla;

    private Maa maa = null; // null, eli tyhjä viittaus, on kaikkien oliomuuttujien oletusarvo

    public Kaupunki(String nimi, int vakiluku, double pintaAla) {
        this.nimi = nimi;
        this.vakiluku = vakiluku;
        this.pintaAla = pintaAla;
    }

    public void setMaa(Maa m) {
        this.maa = m;
    }

    @Override
    public String toString() {
        if (this.maa == null) {
            // täällä tiedetään, että maa-muuttujan kautta ei saada tehdä kutsuja!
            return this.nimi + " (väkiluku: " + this.vakiluku + ")";
        } else {
            // täällä maa-muuttujaa voidaan käyttää normaalisti!
            return this.nimi + " (väkiluku: " + this.vakiluku + ", maa: " + this.maa.getNimi() + ")";
        }
    }
}
