package viikko1.ehtolauseet;

public class EriTapojaVertailla {

    public static void main(String[] args) {
        int kuukausi = 1;
        boolean onKesa = kuukausi >= 5 && kuukausi <= 8;

        if (onKesa == true) {
            System.out.println("Hyvää kesää! (1)");
        }

        // sama tulos saadaan myös ilman `== true`-vertailua:
        if (onKesa) {
            System.out.println("Hyvää kesää! (2)");
        }

        // seuraavat kolme vertailua ovat loogisesti täysin samat:

        // onKesa on epätosi
        if (onKesa == false) {
            System.out.println("Ei ole kesä (1)");
        }

        // onKesa on epätosi
        if (onKesa != true) {
            System.out.println("Ei ole kesä (2)");
        }

        // onKesa on epätosi
        if (!onKesa) {
            System.out.println("Ei ole kesä (3)");
        }
    }
}
