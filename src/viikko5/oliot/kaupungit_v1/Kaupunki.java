package viikko5.oliot.kaupungit_v1;

public class Kaupunki {

    String nimi;
    int vakiluku;
    double pintaAla;

    public double laskeVaestontiheys() {
        return this.vakiluku / this.pintaAla;
    }
}
