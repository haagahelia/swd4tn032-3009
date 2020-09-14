package viikko4.metodit;

/**
 * https://materiaalit.github.io/ohjelmointi-18/part2/
 * 
 * Creative Commons BY-NC-SA 4.0
 */
public class AgenttiTervehdys {

    public static void main(String[] args) {

        String sukunimi = "Bond";
        String etunimi = "James";

        // metodikutsun parametriarvot voidaan lukea muuttujista:
        tervehdi(etunimi, sukunimi);

        // parametriarvot voidaan kirjoittaa myös suoraan metodikutsuun:
        tervehdi("Gracie", "Hart");

    }

    public static void tervehdi(String etu, String suku) {
        String tervehdys = "Nimeni on " + suku + ", " + etu + " " + suku;
        System.out.println(tervehdys);
    }
}
