package viikko4.metodit;

public class KeskiarvonLaskeminen {

    public static void main(String[] args) {

        int pizza1 = 10;
        int pizza2 = 12;
        int pizza3 = 7;

        double keskiarvo = laskeKeskiarvo(pizza1, pizza2, pizza3);
        System.out.println("Pizza maksaa keskimäärin " + keskiarvo + " euroa.");
    }

    public static double laskeKeskiarvo(int luku1, int luku2, int luku3) {
        int summa = luku1 + luku2 + luku3;
        return summa / 3.0;
    }
}
