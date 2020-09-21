package viikko5.oliot.kaupungit_v3;

public class KaupunkiOhjelma {

    public static void main(String[] args) {
        Kaupunki hki = new Kaupunki("Helsinki", 1550);

        Kaupunki esp = new Kaupunki("Espoo", 1400);

        // olion merkkijonoesitys saadaan toString-metodin avulla:
        System.out.println(hki.toString()); // "Helsinki (perustettu 1550)"

        // println kutsuu sisäisesti olion 'toString'-metodia!
        System.out.println(esp); // "Espoo (perustettu 1400)"
    }
}
