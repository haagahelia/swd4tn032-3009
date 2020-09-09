package viikko3.taulukot;

public class TaulukonTyhjatArvot {

    public static void main(String[] args) {
        boolean[] totuudet = new boolean[3];
        // [ false , false , false ]

        System.out.println(totuudet[0]); // booleanin "oletusarvo" on false

        int[] numerot = new int[4];
        // [ 0 , 0 , 0 , 0 ]

        System.out.println(numerot[0]); // kokonaisluvun oletusarvo on 0

        String[] sanat = new String[5];
        // [ null , null , null , null , null ]

        System.out.println(sanat[0]); // merkkijonon oletusarvo on `null`
    }
}
