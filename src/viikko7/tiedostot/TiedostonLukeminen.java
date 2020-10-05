package viikko7.tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets; // merkistöluokka, jossa yleisimmät merkistöt
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TiedostonLukeminen {

    public static void main(String[] args) {
        Path polkuTiedostoon = Paths.get("tekstitiedostot", "tekstitiedosto.txt");

        try {
            List<String> rivit = Files.readAllLines(polkuTiedostoon, StandardCharsets.UTF_8);
            System.out.println(rivit); // [Rivi 1, Rivi kaksi, Rivi kolme, Tänne voidaan kirjoittaa lisää rivejä!]

        } catch (IOException tiedostoPoikkeus) {
            System.out.println("Virhe: " + tiedostoPoikkeus.getMessage());
            tiedostoPoikkeus.printStackTrace();
        }
    }
}
