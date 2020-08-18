package arviointi;

public class OsasuoritustenArviointi {

    public static double laskeArvosana(int omatPisteet, int maksimiPisteet) {
        // hyväksyttyyn arvosanaan vaaditaan 40 % pisteistä
        double minimiPisteet = maksimiPisteet * 0.4;

        if (omatPisteet < minimiPisteet) {
            return 0;
        } else {
            // minimipisteillä saa arvosanan 1, maksimipisteillä arvosanan 5
            double arvosana = 1 + 4 * (omatPisteet - minimiPisteet) / (maksimiPisteet - minimiPisteet);

            // arvosana voi olla korkeintaan 5 bonuspisteet huomioiden
            return Math.min(5, arvosana);
        }
    }
}
