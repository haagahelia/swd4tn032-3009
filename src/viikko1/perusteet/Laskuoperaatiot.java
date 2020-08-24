package viikko1.perusteet;

public class Laskuoperaatiot {

    public static void main(String[] args) {
        System.out.println(1 + 2); // 3
        System.out.println(4 - 1); // 3
        System.out.println(2 * 4); // 8

        // "kokonaislukujen jakolasku"
        System.out.println(9 / 2); // 4!
        // Kokonaislukujen jakolasku tuottaa aina kokonaisluvun

        // "liukulukujen jakolasku"
        System.out.println(9.0 / 2.0); // 4.5

        // entä sitten, jos meillä on kaksi kokonaislukua muuttujissa?
        int juostuMatka = 2_900;
        int kierroksenPituus = 400;

        // kuinka monta kierrosta juoksija juoksi?
        // kokonaisluku voidaan muuttaa liukuluvuksi kertomalla se 1.0:lla:
        System.out.println((1.0 * juostuMatka) / kierroksenPituus);

        // jakojäännös voidaan selvittää %-operaatiolla
        System.out.println(9 % 2); // 1
    }

}
