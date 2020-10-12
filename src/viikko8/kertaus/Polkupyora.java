package viikko8.kertaus;

public class Polkupyora {

    private String kategoria; // maasto, maantie jne.
    private String nimi;
    private double rengasKoko;
    private double hinta;

    private TuoteKuva kuva = null;

    // "parametriton konstruktori"
    public Polkupyora() {
    }

    public Polkupyora(String kategoria, String nimi, double rengasKoko, double hinta) {
        this.kategoria = kategoria;
        this.nimi = nimi;
        this.rengasKoko = rengasKoko;
        this.hinta = hinta;
    }

    public void setKategoria(String kat) {
        this.kategoria = kat;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setRengasKoko(double rengasKoko) {
        this.rengasKoko = rengasKoko;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public void setKuva(TuoteKuva kuva) {
        this.kuva = kuva;
    }

    public String toHTML() {
        String kuvaTagi = "";
        if (kuva != null) {
            kuvaTagi = this.kuva.toHTML() + "\n";
        }
        return kuvaTagi + "<h1>" + this.nimi + "</h1>\n" + "<strong>" + this.hinta + " €</strong>";
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.rengasKoko + "\", " + this.hinta + " euroa";
    }
}
