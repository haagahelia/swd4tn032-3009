package viikko6.oliot.vertailu;

public class MerkkijonojenVertailu {

    public static void main(String[] args) {
        String mjono1 = "hauki on kala".toUpperCase();
        String mjono2 = "HAUKI ON KALA";

        System.out.println(mjono1 == mjono2); // false

        System.out.println(mjono1.equals(mjono2)); // true

        if (mjono1.equals(mjono2)) {
            System.out.println("Merkkijonot ovat sisällöltään samat!");
        }
    }
}
