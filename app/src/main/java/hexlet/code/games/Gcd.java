package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Gcd {
    static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void start() {
        final int minValGameNum = 1;
        final int maxValGameNum = 100;

        //Create arr with questions and right answers
        String[][] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER][2];

        for (int i = 0; i < questionsAndRightAnswers.length; i++) {
            int randomNumA = generateRandomNumber(minValGameNum, maxValGameNum);
            int randomNumB = generateRandomNumber(minValGameNum, maxValGameNum);

            //Question
            String question = randomNumA + " " + randomNumB;

            //Right answer
            String rightAnswer = findGcd(randomNumA, randomNumB) + "";

            //Set
            questionsAndRightAnswers[i][0] = question;
            questionsAndRightAnswers[i][1] = rightAnswer;
        }

        Engine.start(RULES, questionsAndRightAnswers);
    }

    public static int findGcd(int randomNumA, int randomNumB) {
        int highNum = Math.max(randomNumA, randomNumB);
        int lowNum = Math.min(randomNumA, randomNumB);
        int gcdNum = 0;

        while (lowNum != 0) {
            gcdNum = lowNum;
            lowNum = highNum % lowNum;
            highNum = gcdNum;
        }
        return gcdNum;
    }
}
