package viikko5.oliot.yhteystiedot;

public class Yhteystieto {

    private String nimi;
    private String sahkoposti;
    private String puhelin;

    public Yhteystieto(String nimi, String sahkoposti, String puhelin) {
        this.nimi = nimi;
        this.sahkoposti = sahkoposti;
        this.puhelin = puhelin;
    }

    public String getNimi() {
        return nimi;
    }

    public String getSahkoposti() {
        return sahkoposti;
    }

    public String getPuhelin() {
        return puhelin;
    }
}
