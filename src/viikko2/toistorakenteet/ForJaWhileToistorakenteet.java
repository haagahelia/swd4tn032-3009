package viikko2.toistorakenteet;

public class ForJaWhileToistorakenteet {

    public static void main(String[] args) {

        // alustus
        int i = 0;

        System.out.println("While-toistorakenne: ");
        while (i < 12) { // ehto

            System.out.println(i);

            i++; // kasvatus
        }

        System.out.println();
        System.out.println("For-toistorakenne:");

        // for (alustus; ehto; kasvatus)
        for (int j = 0; j < 12; j++) {

            System.out.println(j);
        }

    }
}
