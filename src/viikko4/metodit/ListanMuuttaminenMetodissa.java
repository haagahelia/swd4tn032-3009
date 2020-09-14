package viikko4.metodit;

import java.util.ArrayList;
import java.util.List;

public class ListanMuuttaminenMetodissa {

    public static void main(String[] args) {
        List<String> planeetat = new ArrayList<>();
        planeetat.add("Mars");
        planeetat.add("Jupiter");
        planeetat.add("Neptunus");
        planeetat.add("Tellus");
        planeetat.add("Pluto");

        System.out.println(planeetat.size());

        System.out.println();

        tulostaPlaneetat(planeetat);

        System.out.println();

        System.out.println(planeetat.size());
    }

    private static void tulostaPlaneetat(List<String> pallot) {
        pallot.remove("Pluto"); // plutoa ei täällä lasketa planeetaksi

        for (String nimi : pallot) {
            System.out.println(nimi);
        }
    }
}
