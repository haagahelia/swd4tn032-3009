package viikko7.tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TiedostonKirjoittaminen {

    public static void main(String[] args) {
        Path tallennettavaTiedosto = Paths.get("tekstitiedostot", "kirjoitettava.txt");
        List<String> rivit = new ArrayList<String>();
        rivit.add("Eka rivi");
        rivit.add("");
        rivit.add("Kolmas rivi");

        try {
            Files.write(tallennettavaTiedosto, rivit, StandardCharsets.UTF_8);

        } catch (IOException tallennusPoikkeus) {
            tallennusPoikkeus.printStackTrace();
        }
    }
}
