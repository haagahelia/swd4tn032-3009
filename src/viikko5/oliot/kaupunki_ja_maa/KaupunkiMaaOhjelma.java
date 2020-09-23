package viikko5.oliot.kaupunki_ja_maa;

public class KaupunkiMaaOhjelma {

    public static void main(String[] args) {
        Kaupunki hki = new Kaupunki("Helsinki", 653_867, 214.25);
        Maa suomi = new Maa("Suomi", "Eurooppa");

        // Suomi (Eurooppa)
        System.out.println(suomi);

        // Helsinki (väkiluku: 653867)
        System.out.println(hki);

        hki.setMaa(suomi); // maa asetetaan, joten se ei ole enää null

        // Helsinki (väkiluku: 653867, maa: Suomi)
        System.out.println(hki);
    }
}
