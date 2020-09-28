package viikko6.oliot.vertailu;

public class Tuote {

    private String nimi;

    public Tuote(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    @Override
    public boolean equals(Object toinen) {
        if (this.getClass() != toinen.getClass()) {
            return false;
        } else {
            String tamaMerkkijonona = this.toString();
            String toinenMerkkijono = toinen.toString();

            return tamaMerkkijonona.equals(toinenMerkkijono);
        }
    }

    @Override
    public String toString() {
        return "Tuote (" + this.nimi + ")";
    }
}
