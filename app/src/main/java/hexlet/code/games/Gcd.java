package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Gcd {
    public static void start() {
        final int minGenVal = 1;
        final int maxGenVal = 100;

        //Create arr with questions and right answers
        String[] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER * 2];
        for (int i = 0; i < questionsAndRightAnswers.length; i += 2) {
            int randomNumA = generateRandomNumber(minGenVal, maxGenVal);
            int randomNumB = generateRandomNumber(minGenVal, maxGenVal);

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

            questionsAndRightAnswers[i] = question;
            questionsAndRightAnswers[i + 1] = rightAnswer;
        }

        Engine.start("Find the greatest common divisor of given numbers.", questionsAndRightAnswers);
    }
}
