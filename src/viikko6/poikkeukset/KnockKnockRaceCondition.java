package viikko6.poikkeukset;

public class KnockKnockRaceCondition {

    // https://medium.com/@mackenziepech/knock-knock-race-condition-whos-there-a11d15c4544d
    public static void main(String[] args) {
        System.out.println("Knock knock");

        System.err.println("Who's there?");

        System.out.println("Race condition");

        // Sysout: "Knock knock" ..... "Race condition"
        // Syserr: "Who's there?"

        // race condition?!?

    }
}
