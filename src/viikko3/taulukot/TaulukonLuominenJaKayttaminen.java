package viikko3.taulukot;

public class TaulukonLuominenJaKayttaminen {

    public static void main(String[] args) {

        int[] numerot = new int[10]; // taulukon koko on pysyvästi 10

        // arvojen asettaminen:
        numerot[0] = 3;
        numerot[5] = -8;

        // arvojen hakeminen muuttujaan:
        int ensimmainen = numerot[0];
        System.out.println(ensimmainen); // 3

        // arvojen käyttäminen suoraan:
        System.out.println(numerot[0]); // 3
        System.out.println(numerot[5]); // -8

        String[] sanat = new String[5]; // pituus on nyt 5!
        // [tyhjä, tyhjä, tyhjä, tyhjä, tyhjä]
        // ---0------1------2------3------4

        // taulukko voidaan täyttää missä tahansa järjestyksessä:
        sanat[1] = "yksi"; // [tyhjä, "yksi", tyhjä, tyhjä, tyhjä]
        sanat[4] = "neljä"; // [tyhjä, "yksi", tyhjä, tyhjä, "neljä"]
        sanat[3] = "kolme"; // [tyhjä, "yksi", tyhjä, "kolme", "neljä"]
        sanat[0] = "nolla"; // ..
        sanat[2] = "kaksi"; // ..

        System.out.println(sanat[3]);
        System.out.println(sanat[4]);
    }
}
