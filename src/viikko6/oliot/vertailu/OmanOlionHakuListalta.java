package viikko6.oliot.vertailu;

import java.util.ArrayList;

public class OmanOlionHakuListalta {

    public static void main(String[] args) {
        boolean onSama = new Tuote("Piimä") == new Tuote("Piimä");

        System.out.println(onSama); // false

        boolean onSamanlainen = new Tuote("Piimä").equals(new Tuote("Piimä"));

        System.out.println(onSamanlainen); // true

        ArrayList<Tuote> ostoslista = new ArrayList<>();
        ostoslista.add(new Tuote("Piimä"));
        ostoslista.add(new Tuote("Banaani"));
        ostoslista.add(new Tuote("Leipä"));
        ostoslista.add(new Tuote("Saippua"));

        boolean onkoLeipa = ostoslista.contains(new Tuote("Leipä"));
        System.out.println(onkoLeipa); // true

        System.out.println(ostoslista.indexOf(new Tuote("Banaani"))); // 1
    }
}
