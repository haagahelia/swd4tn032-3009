package viikko2.toistorakenteet;

import java.util.Scanner;

public class Kotitalousvahennys {

    // Älä kopioi suoraan, mutta voit ottaa mallia!
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        final int omavastuu = 100;
        final double vahennysProsentti = 0.5;
        final double alaraja = 0;
        final double ylaraja = 2400;

        double summa = 0;

        while (true) {
            System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
            double tyokorvaus = lukija.nextDouble();

            if (tyokorvaus == 0) {
                break;
            } else {
                summa += tyokorvaus;
            }
        }

        double kotitalousvahennys = summa * vahennysProsentti - omavastuu;

        kotitalousvahennys = Math.min(kotitalousvahennys, ylaraja);
        kotitalousvahennys = Math.max(kotitalousvahennys, alaraja);

        // TODO: muista pyöristää tulos kahden desimaalin tarkkuudella

        System.out.println("Kotitalousvähennyksen määrä on " + kotitalousvahennys + " euroa");
    }
}
