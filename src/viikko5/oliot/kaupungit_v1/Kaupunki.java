package viikko5.oliot.kaupungit_v1;

public class Kaupunki {

    String nimi;
    int vakiluku;
    double pintaAla;

    public int laskeVaestontiheys() {
        // this-muuttuja viittaa aina siihen olioon, jonka metodia suoritetaan
        return (int) (this.vakiluku / this.pintaAla);
    }
}
