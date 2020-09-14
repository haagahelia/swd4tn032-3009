package viikko4.metodit;

import java.util.List;
import java.util.Random;

public class RandomNameGenerator {

    public static String generateAnimalName() {
        List<String> adjectives = List.of("big", "small", "huge", "short", "tall", "fluffy");
        List<String> colors = List.of("red", "green", "blue", "yellow", "dotted", "striped");
        List<String> species = List.of("dog", "cat", "mouse", "bunny", "elephant");

        String randomAdjective = getRandomWord(adjectives);
        String randomColor = getRandomWord(colors);
        String randomSpecies = getRandomWord(species);

        return randomAdjective + " " + randomColor + " " + randomSpecies;
    }

    private static String getRandomWord(List<String> words) {
        Random satunnainen = new Random();

        int indeksi = satunnainen.nextInt(words.size());
        return words.get(indeksi);
    }
}
