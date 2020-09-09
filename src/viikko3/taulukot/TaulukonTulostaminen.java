package viikko3.taulukot;

import java.util.Arrays;

public class TaulukonTulostaminen {

    public static void main(String[] args) {
        String[] kuskit = new String[5];

        kuskit[0] = "Hamilton";
        kuskit[1] = "Bottas";
        kuskit[2] = "Räikkönen";

        // taulukoilla ei ole oletuksena järkevää merkkijonoesitystä:
        System.out.println(kuskit); // [Ljava.lang.String;@77556fd

        // muotoillaan taulkko järkeväksi esitykseksi:
        String taulukonMerkkijonoEsitys = Arrays.toString(kuskit);

        // [Hamilton, Bottas, Räikkönen, null, null]
        System.out.println(taulukonMerkkijonoEsitys);

        kuskit[0] = "Vettel";

        // voidaan kirjoittaa myös println-kutsun sisään:
        System.out.println(Arrays.toString(kuskit));
    }
}
