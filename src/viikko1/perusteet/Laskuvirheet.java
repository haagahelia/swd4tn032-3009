package viikko1.perusteet;

public class Laskuvirheet {

    public static void main(String[] args) {
        // Liukulukujen tarkkuudessa saattaa olla pieniä virheitä
        System.out.println(0.1 + 0.2); // 0.30000000000000004

        // Luku pyörähtää ympäri, eli tapahtuu ylivuoto
        System.out.println(2_147_483_647 + 1); // -2147483648

        // Luvun suuruutta osoittavat bitit vuotavat etumerkkiä osoittavan bitin
        // kohdalle.

        // long-tyyppiset luvut voivat olla paljon suurempia
        System.out.println(7_644_362_948L);
    }
}
