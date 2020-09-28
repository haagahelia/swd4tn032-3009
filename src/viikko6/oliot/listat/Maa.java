package viikko6.oliot.listat;

import java.util.ArrayList;
import java.util.List;

import viikko5.oliot.kaupungit_v2.Kaupunki;

public class Maa {

    private String nimi;
    private List<Kaupunki> kaupungit;

    public Maa(String nimi) {
        this.nimi = nimi;
        this.kaupungit = new ArrayList<>();
    }

    public void lisaaKaupunki(Kaupunki kaupunki) {
        this.kaupungit.add(kaupunki);
    }

    public int laskeVakiluku() {
        int summa = 0;

        for (int i = 0; i < this.kaupungit.size(); i++) {
            Kaupunki k = this.kaupungit.get(i);
            summa = summa + k.getVakiluku();
        }

        return summa;
    }

    public double laskePintaAla() {
        double summa = 0;

        for (Kaupunki k : this.kaupungit) {
            summa += k.getPintaAla();
        }

        return summa;
    }

    public double laskeVaestontiheys() {
        return this.laskeVakiluku() / this.laskePintaAla();
    }
}
