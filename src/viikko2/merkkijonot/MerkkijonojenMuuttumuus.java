package viikko2.merkkijonot;

public class MerkkijonojenMuuttumuus {

    public static void main(String[] args) {
        String kaupunki = "Helsinki";

        // merkkijonojen metodit eivät koskaan muuta alkuperäistä merkkijonoa!
        kaupunki.toUpperCase(); // tekee kopion, joka on isoilla kirjaimilla

        System.out.println(kaupunki); // Helsinki

        // alkuperäinen muuttujan arvo voidaan korvata uudella:
        kaupunki = kaupunki.toUpperCase();

        System.out.println(kaupunki); // HELSINKI

        String isoillaKirjaimilla = kaupunki.toUpperCase();
        String pienillaKirjaimilla = kaupunki.toLowerCase();
    }
}
