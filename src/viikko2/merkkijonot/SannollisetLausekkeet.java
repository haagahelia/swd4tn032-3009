package viikko2.merkkijonot;

public class SannollisetLausekkeet {

    public static void main(String[] args) {
        // sisältääkö pelkkiä numeroita?
        System.out.println("12345".matches("[0-9]+"));

        // ei matchaa, koska mukana piste
        System.out.println("123.45".matches("[0-9]+"));

        // onko tasan 7 numeroa?
        System.out.println("1234567".matches("[0-9]{7}"));

        // Onko korkeintaan kolme merkkiä, viiva, ja korkeintaan kolme numeroa?
        System.out.println("ABC-123".matches("[A-Z]{1,3}-[0-9]{1,3}"));
    }
}
