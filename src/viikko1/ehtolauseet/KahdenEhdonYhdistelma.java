package viikko1.ehtolauseet;

public class KahdenEhdonYhdistelma {

    public static void main(String[] args) {
        // sanotaan vaikka, että talvi on lokakuusta (10) maaliskuuhun (3)
        int kuukausi = 5;

        // Riittää että toinen ehdoista toteutuu:
        boolean onTalvi = kuukausi >= 10 || kuukausi <= 3;

        System.out.println("Talvi: " + onTalvi);

        // Molemmat ehdot tulee toteutua:
        boolean onKesa = kuukausi >= 5 && kuukausi <= 8;

        System.out.println("Kesa: " + onKesa);
    }
}
