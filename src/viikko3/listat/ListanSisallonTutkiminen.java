package viikko3.listat;

import java.util.ArrayList;
import java.util.List;

public class ListanSisallonTutkiminen {

    public static void main(String[] args) {
        List<String> nimet = new ArrayList<>();

        nimet.add("Maija"); // 0
        nimet.add("Matti"); // 1

        System.out.println(nimet);

        boolean sisaltaaTepon = nimet.contains("Teppo");

        if (sisaltaaTepon) {
            System.out.println("Teppo on listalla!");
        }

        if (nimet.contains("Maija")) {
            System.out.println("Maija on listalla!");
        }

        int maijanIndeksi = nimet.indexOf("Maija");
        System.out.println("Maijan indeksi: " + maijanIndeksi);

        // indexOf palauttaa aina -1, jos arvoa ei löydy!
        System.out.println("Tepon indeksi: " + nimet.indexOf("Teppo"));

    }
}
