package viikko2.toistorakenteet;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean jaollinenKolmella = (i % 3 == 0);
            boolean jaollinenViidella = (i % 5 == 0);

            if (jaollinenKolmella && jaollinenViidella) {
                System.out.println("FizzBuzz");
            } else if (jaollinenKolmella) {
                System.out.println("Fizz");
            } else if (jaollinenViidella) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
