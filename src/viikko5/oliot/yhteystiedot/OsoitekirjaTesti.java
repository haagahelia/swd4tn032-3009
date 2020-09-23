package viikko5.oliot.yhteystiedot;

public class OsoitekirjaTesti {

    public static void main(String[] args) {
        Osoitekirja osoitekirja = new Osoitekirja();

        Yhteystieto matti = new Yhteystieto("Matti Meikäläinen", "matti@example.com", "+358 55 555 555");

        osoitekirja.lisaaYhteystieto(matti);

        // Matti Meikäläinen (matti@example.com, +358 55 555 555)
        System.out.println(osoitekirja.toString());
    }
}
