package viikko1.ehtolauseet;

public class VuodenaikaTervehdys {

    public static void main(String[] args) {
        // p.s. Katso Javan Month- tai LocalDate-luokkaa jos haluat oikean kuukauden
        int kuukausi = 8;

        if (kuukausi >= 5 && kuukausi <= 8) {
            System.out.println("Hyvää kesää!");
            System.out.println("Huh hellettä!");
        }

        if (kuukausi >= 10 || kuukausi <= 3) {
            System.out.println("Hyvää talvea!");
            System.out.println("Hui pakkasta!");
        }
    }
}
