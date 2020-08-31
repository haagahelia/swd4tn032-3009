package viikko2.toistorakenteet;

public class WhileToistorakenne {

    public static void main(String[] args) {

        boolean totuusarvo = 3 < 6;

        if (totuusarvo) {
            System.out.println("Tämä koodi suoritettiin ehdollisesti!");
        }

        // tämä koodi jää ikuiseen silmukkaan
        while (totuusarvo) {
            System.out.println("Tämä koodi suoritetaan toistuvasti!");

            // kun while-lohko on suoritettu, ehto tarkastetaan uudestaan!
        }
    }
}
