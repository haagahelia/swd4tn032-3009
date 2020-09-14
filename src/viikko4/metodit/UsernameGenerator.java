package viikko4.metodit;

public class UsernameGenerator {

    // "Sanna", "Marin" -> "@smarin"
    public static String generateUsername(String firstName, String lastName) {
        String initial = firstName.substring(0, 1); // "S"
        return "@" + (initial + lastName).toLowerCase(); // "@" + "S" + "Marin" => "@smarin"
    }
}
