package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.generateRandomNumber;

public class Even {
    public static void start() {
        Engine.start("even", "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    public static String[] createRound() {
        int questionNum = generateRandomNumber(100);

        //Question
        String question = questionNum + "";

        //Right answer
        String rightAnswer = (questionNum % 2 == 0) ? "yes" : "no";

        String[] result = {question, rightAnswer};
        return result;
    }
}
