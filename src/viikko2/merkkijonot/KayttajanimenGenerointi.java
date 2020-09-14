package viikko2.merkkijonot;

// myös omat luokat joudutaan usein importtaamaan
import viikko4.metodit.UsernameGenerator;

public class KayttajanimenGenerointi {

    /*
     * Tämä esimerkki näyttää toisessa paketissa olevan oman metodin kutsumisen:
     */
    public static void main(String[] args) {
        String username = UsernameGenerator.generateUsername("Brenda", "Utthead");
        System.out.println(username);
    }
}
