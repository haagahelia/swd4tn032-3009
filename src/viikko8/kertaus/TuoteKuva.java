package viikko8.kertaus;

public class TuoteKuva {

    private int leveys;
    private int korkeus;
    private String kuvateksti;
    private String url;

    public TuoteKuva(int leveys, int korkeus, String teksti, String url) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.kuvateksti = teksti;
        this.url = url;
    }

    public String toHTML() {
        return "<img src='" + this.url + "' alt='" + this.kuvateksti + "' width='" + this.leveys + "' height='"
                + this.korkeus + "' />";
    }
}
