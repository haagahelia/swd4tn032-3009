package viikko6.oliot.vertailu;

public class TuotteidenVertailu {

    public static void main(String[] args) {
        Tuote tuote1 = new Tuote("Maito");
        Tuote tuote2 = new Tuote("Maito");

        System.out.println(tuote1 == tuote2); // false

        System.out.println(tuote1.equals(tuote2)); // true
    }
}
