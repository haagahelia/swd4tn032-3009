package viikko5.oliot.yhteystiedot;

import java.util.Scanner;

public class OsoitekirjaTesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Osoitekirja osoitekirja = new Osoitekirja();

        Yhteystieto matti = new Yhteystieto("Matti Meikäläinen", "matti@example.com", "+358 55 555 555");
        Yhteystieto maija = new Yhteystieto("Maija Meikäläinen", "maija@example.com", "+358 55 598 765");

        osoitekirja.lisaaYhteystieto(matti);
        osoitekirja.lisaaYhteystieto(maija);

        // Nimi, sähköposti, puhelin
        // -------------------------
        // Matti Meikäläinen, matti@example.com, +358 55 555 555
        // Maija Meikäläinen, maija@example.com, +358 55 598 765

        System.out.println(osoitekirja);

        System.out.print("Anna hakusana: ");
        String etsittava = lukija.nextLine();

        Yhteystieto loydetty = osoitekirja.etsiNimella(etsittava);
        System.out.println(loydetty);
    }
}