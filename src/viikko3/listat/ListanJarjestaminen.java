package viikko3.listat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListanJarjestaminen {

    public static void main(String[] args) {
        List<String> kaupungit = new ArrayList<>();
        kaupungit.add("Rauma");
        kaupungit.add("Helsinki");
        kaupungit.add("Espoo");
        kaupungit.add("Vantaa");
        kaupungit.add("Turku");

        System.out.println(kaupungit);

        Collections.sort(kaupungit);

        System.out.println(kaupungit);

        List<Integer> numerot = List.of(500, 5000, 5, 50);
        int pienin = Collections.min(numerot);
        int suurin = Collections.max(numerot);

        System.out.println(pienin); // 5
        System.out.println(suurin); // 5000

    }
}
