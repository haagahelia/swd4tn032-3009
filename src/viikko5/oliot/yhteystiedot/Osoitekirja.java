package viikko5.oliot.yhteystiedot;

import java.util.ArrayList;
import java.util.List;

public class Osoitekirja {

    private List<Yhteystieto> yhteystiedot = new ArrayList<>();

    public void lisaaYhteystieto(Yhteystieto uusiYhteystieto) {
        this.yhteystiedot.add(uusiYhteystieto);
    }

    public Yhteystieto etsiNimella(String hakusana) {
        if (hakusana.isEmpty()) {
            return null;
        }
        for (Yhteystieto y : this.yhteystiedot) {
            // verrataan hakusanaa yhteystiedon nimeen!
            String nimi = y.getNimi();
            if (containsIgnoreCase(nimi, hakusana)) {
                return y;
            }
        }
        return null;
    }

    private boolean containsIgnoreCase(String text, String substring) {
        return text.toLowerCase().contains(substring.toLowerCase());
    }

    @Override
    public String toString() {
        String kaikki = "Nimi, sähköposti, puhelin\n";
        kaikki += "-------------------------";

        for (int i = 0; i < this.yhteystiedot.size(); i++) {
            Yhteystieto y = this.yhteystiedot.get(i);
            String rivi = y.getNimi() + ", " + y.getSahkoposti() + ", " + y.getPuhelin();

            kaikki = kaikki + "\n" + rivi;
        }

        return kaikki;
    }
}
