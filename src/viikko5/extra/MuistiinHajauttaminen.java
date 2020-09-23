package viikko5.extra;

import java.util.Arrays;

public class MuistiinHajauttaminen {

    public static void main(String[] args) {
        String sana = "FizzBuzz";

        int hajautuskoodi1 = Math.abs(sana.hashCode());

        int hajautuskoodi2 = Math.abs("Hello".hashCode());

        System.out.println(hajautuskoodi1);
        System.out.println(hajautuskoodi2);

        String[] muisti = new String[1000];

        muisti[hajautuskoodi1 % 1000] = sana;
        muisti[hajautuskoodi2 % 1000] = "Hello";

        System.out.println(Arrays.toString(muisti));
    }
}
