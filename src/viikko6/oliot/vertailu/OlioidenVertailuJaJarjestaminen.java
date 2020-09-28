package viikko6.oliot.vertailu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OlioidenVertailuJaJarjestaminen {

    public static void main(String[] args) {
        List<String> nimet = new ArrayList<>();
        nimet.add("Shawshank Redemption");
        nimet.add("Godfather");
        nimet.add("Dark Knight");
        nimet.add("12 Angry Men");
        nimet.add("Schindler's List");
        nimet.add("Godfather: Part II");

        Collections.sort(nimet);
        System.out.println(nimet);

        List<Integer> numerot = new ArrayList<>();
        numerot.addAll(List.of(10, 100, 1, 1000, 10000, -5000));
        Collections.sort(numerot);

        System.out.println(numerot);

        ArrayList<Tuote> ostoslista = new ArrayList<>();
        ostoslista.add(new Tuote("Piimä"));
        ostoslista.add(new Tuote("Banaani"));
        ostoslista.add(new Tuote("Leipä"));
        ostoslista.add(new Tuote("Saippua"));

        System.out.println();

        System.out.println("Shawshank Redemption".compareTo("Dark Knight"));
        System.out.println("Godfather: Part II".compareTo("Schindler's List"));

        Collections.sort(ostoslista, Comparator.comparing(Tuote::getNimi));
        System.out.println(ostoslista);
    }
}
