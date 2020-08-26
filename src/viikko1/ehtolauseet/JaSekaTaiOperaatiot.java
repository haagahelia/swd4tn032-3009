package viikko1.ehtolauseet;

public class JaSekaTaiOperaatiot {

    public static void main(String[] args) {
        boolean jokoTai = false || true;
        System.out.println(jokoTai); // true

        boolean sekaEtta = true && false;
        System.out.println(sekaEtta); // false
    }
}
