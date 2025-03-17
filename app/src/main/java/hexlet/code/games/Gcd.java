package hexlet.code.games;
import hexlet.code.Engine;

public class Gcd {
    public static void start() {
        Engine.start("gcd", "Find the greatest common divisor of given numbers.");
    }
    public static String[] createRound() {
        final int maxGenVal = 100;
        int randomNumA = Engine.generateRandomNumber(maxGenVal);
        int randomNumB = Engine.generateRandomNumber(maxGenVal);

        //Question
        String question = randomNumA + " " + randomNumB;

        //Right answer
        int highNum = Math.max(randomNumA, randomNumB);
        int lowNum = Math.min(randomNumA, randomNumB);
        int gcdNum = 0;

        while (lowNum != 0) {
            gcdNum = lowNum;
            lowNum = highNum % lowNum;
            highNum = gcdNum;
        }

        String rightAnswer = gcdNum + "";

        String[] result = {question, rightAnswer};
        return result;
    }
}
