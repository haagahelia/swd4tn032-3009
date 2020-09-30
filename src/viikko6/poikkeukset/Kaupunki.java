package viikko6.poikkeukset;

public class Kaupunki {

    private String nimi;
    private int vakiluku;

    public Kaupunki(String nimi, int vakiluku) {
        this.setNimi(nimi);
        this.setVakiluku(vakiluku);
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setVakiluku(int vakiluku) {
        if (vakiluku >= 0) {
            this.vakiluku = vakiluku;
        } else {
            // luodaan ensin poikkeusolio:
            IllegalArgumentException poikkeus = new IllegalArgumentException("Virheellinen väkiluku: " + vakiluku);

            // heitetään poikkeus tätä metodia kutsuneelle metodille:
            throw poikkeus;
        }
    }

    public int getVakiluku() {
        return this.vakiluku;
    }

    public String getNimi() {
        return this.nimi;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.vakiluku + ")";
    }
}
