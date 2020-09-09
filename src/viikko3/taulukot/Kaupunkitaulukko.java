package viikko3.taulukot;

import java.util.Arrays;

public class Kaupunkitaulukko {

    public static void main(String[] args) {

        String[] kaupungit = { "Rauma", "Helsinki", "Espoo", "Vantaa", "Turku" };

        System.out.println("Alkuperäinen:");
        System.out.println(Arrays.toString(kaupungit));

        System.out.println();

        String[] kaupungitSort = Arrays.copyOf(kaupungit, kaupungit.length);

        Arrays.sort(kaupungitSort);

        System.out.println("Sorttauksen jälkeen:");
        System.out.println(Arrays.toString(kaupungit));
        System.out.println(Arrays.toString(kaupungitSort));

    }
}
