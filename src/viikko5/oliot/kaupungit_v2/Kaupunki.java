package viikko5.oliot.kaupungit_v2;

public class Kaupunki {

    private String nimi;
    private int perustamisVuosi;
    private int vakiluku;
    private double pintaAla;

    /*
     * Konstruktoria käytetään pääsääntöisesti annettujen parametriarvojen
     * asettamiseksi olion muuttujiin.
     */
    public Kaupunki(String nimi, int perustamisVuosi, int vakiluku, double pintaAla) {
        this.nimi = nimi;
        this.perustamisVuosi = perustamisVuosi;
        this.vakiluku = vakiluku;
        this.pintaAla = pintaAla;
    }

    public boolean onVanhempiKuin(Kaupunki toinen) {
        boolean onVanhempi = this.perustamisVuosi < toinen.perustamisVuosi;
        return onVanhempi;
    }

    public double laskeVaestontiheys() {
        return this.vakiluku / this.pintaAla;
    }

    // getterit ja setterit
    public String getNimi() {
        return this.nimi;
    }

    public int getVakiluku() {
        return this.vakiluku;
    }

    public double getPintaAla() {
        return this.pintaAla;
    }

    public void setVakiluku(int uusiVakiluku) {
        // set-metodeissa voidaan tehdä myös tarkastuksia annetulle datalle:
        if (uusiVakiluku >= 0) {
            this.vakiluku = uusiVakiluku;
        }
    }
}
