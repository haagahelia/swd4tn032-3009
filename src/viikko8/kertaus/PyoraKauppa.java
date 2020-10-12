package viikko8.kertaus;

public class PyoraKauppa {

    public static void main(String[] args) {
        Polkupyora serious = new Polkupyora("maastopyörä", "Serious Shoreline Street Rigid", 29.0, 459.0);

        Polkupyora vermont = new Polkupyora();
        vermont.setKategoria("lastenpyörä");
        vermont.setNimi("Vermont Girly");
        vermont.setRengasKoko(18.0);
        vermont.setHinta(129.0);

        System.out.println(serious);

        System.out.println();

        System.out.println(serious.toHTML());

        System.out.println();

        // Muodostetaan HTML:ää kaupan myyntisivua varten

        TuoteKuva pinkkiKuva = new TuoteKuva(480, 320, "Pinkki Vermont", "http://pyorakauppa.example.com/kuva1.jpg");

        vermont.setKuva(pinkkiKuva);

        System.out.println(vermont.toHTML());

    }
}
