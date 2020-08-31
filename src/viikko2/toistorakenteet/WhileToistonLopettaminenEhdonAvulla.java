package viikko2.toistorakenteet;

public class WhileToistonLopettaminenEhdonAvulla {

    public static void main(String[] args) {
        int luku = 3;

        while (luku < 6) {
            System.out.println("Luku on alle 6");

            // muutetaan toistoehtoa:
            luku = luku + 1; // 4, 5, 6
        }

        // toiston jälkeen koodin suoritus jatkuu normaalisti

        System.out.println("Loppu");
    }
}
