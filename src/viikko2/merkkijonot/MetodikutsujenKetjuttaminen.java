package viikko2.merkkijonot;

public class MetodikutsujenKetjuttaminen {

    public static void main(String[] args) {
        String numerot = "1 2 3";

        numerot = numerot.replace("1", "one").replace("2", "two").replace("3", "three");

        System.out.println(numerot); // one two three
    }
}
