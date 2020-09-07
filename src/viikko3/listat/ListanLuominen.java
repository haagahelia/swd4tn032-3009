package viikko3.listat;

import java.util.ArrayList;
import java.util.List;

public class ListanLuominen {

    public static void main(String[] args) {

        // Luodaan uusi lista, jolle tallennetaan nimiä:

        // Kuskit: "Hamilton", "Bottas", "Räikkönen", "Vettel"...

        List<String> kuskit = new ArrayList<String>();

        // lisätään kuskien nimiä listalle yksi kerrallaan:

        kuskit.add("Hamilton");
        kuskit.add("Bottas");
        kuskit.add("Räikkönen");
        kuskit.add("Vettel");

        System.out.println(kuskit);

        // ArrayList:
        // [Hamilton, Bottas, Räikkönen, Vettel]
        // ----0--------1---------2--------3---

        // Vertaa LinkedList: (eri sisäinen toteutus)
        // Hamilton -> Bottas -> Räikkönen -> Vettel
        // ----0----------1----------2----------3--
    }
}
