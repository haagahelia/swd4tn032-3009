package viikko3.taulukot;

public class ForEachVsPerinteinenFor {

    public static void main(String[] args) {
        int[] luvut = { 2, 4, 8, 16, 32, 64 };

        // for (muuttuja : läpikäytävä_kokoelma)
        for (int luku : luvut) {
            System.out.println(luku);
        }

        System.out.println();

        // On sama kuin:

        for (int i = 0; i < luvut.length; i++) {
            int luku = luvut[i];

            System.out.println(luku);
        }
    }
}
