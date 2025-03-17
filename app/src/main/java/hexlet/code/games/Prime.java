package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static void start() {
        Engine.start("prime", "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
    public static String[] createRound() {
        int maxGenVal = 100;
        int randomNumber = Engine.generateRandomNumber(maxGenVal);
        String rightAnswer = "yes";
        for (int i = 2; i < randomNumber; i++) {
            if (randomNumber % i == 0) {
                rightAnswer = "no";
            }
        }
        //Question
        String question = randomNumber + "";

        String[] result = {question, rightAnswer};
        return result;
    }
}
