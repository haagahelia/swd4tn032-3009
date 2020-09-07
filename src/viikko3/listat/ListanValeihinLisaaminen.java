package viikko3.listat;

import java.util.ArrayList;
import java.util.List;

public class ListanValeihinLisaaminen {

    public static void main(String[] args) {

        // Lottonumerot! 5, 9, 7 (int-tyyppisiä)
        List<Integer> lottonumerot = new ArrayList<Integer>();

        lottonumerot.add(5);
        lottonumerot.add(9);

        lottonumerot.add(1, 7); // halutaan lisätä seiska indeksiin 1!

        System.out.println(lottonumerot);

        lottonumerot.remove(2);

        System.out.println(lottonumerot);
    }
}
