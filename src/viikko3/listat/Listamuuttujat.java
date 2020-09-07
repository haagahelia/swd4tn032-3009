package viikko3.listat;

import java.util.ArrayList;
import java.util.List;

public class Listamuuttujat {

    public static void main(String[] args) {
        // List vai ArrayList?
        List<String> varit = new ArrayList<String>();
        ArrayList<String> kaupungit = new ArrayList<String>();

        // Listan luominen valmiilla arvoilla?
        // ["omena", "banaani", "päärynä"]

        // pitkä tapa:
        List<String> hedelmat = new ArrayList<String>();
        hedelmat.add("omena");
        hedelmat.add("banaani");
        hedelmat.add("päärynä");

        System.out.println(hedelmat);

        // lyhyempi tapa:
        List<String> hedelmat2 = List.of("banaani", "päärynä", "omena");

        System.out.println(hedelmat2);

        // varit on List, joten siihen voidaan asettaa mikä vain listatyyppi:
        varit = List.of("sininen", "punainen", "vihreä");

        // Tyypin määrittäminen luontikäskyssä (jälkimmäinen <String> voidaan jättää
        // pois: <>)
        ArrayList<String> maat = new ArrayList<String>();

        // Jos tyyppi on pääteltävissä muuttujasta, ei sitä tarvitse toistaa
        // luontikäskyssä:
        List<String> sanalista = new ArrayList<>();
    }
}
