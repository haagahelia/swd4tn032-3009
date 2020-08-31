package viikko2.toistorakenteet;

public class WhileToisto10Kertaa {

    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println("i: " + i);

            i = i + 1;
        }

        System.out.println();
        System.out.println("i:n arvo lopussa: " + i); // i:n arvo toistorakenteen jälkeen 10
    }
}
