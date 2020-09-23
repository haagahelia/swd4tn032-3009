package viikko5.oliot.kaupunki_ja_maa;

public class Maa {
    private String nimi; // Suomi
    private String maanosa; // Eurooppa

    public Maa(String nimi, String maanosa) {
        this.nimi = nimi;
        this.maanosa = maanosa;
    }

    public String getNimi() {
        return this.nimi;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.maanosa + ")";
    }
}
