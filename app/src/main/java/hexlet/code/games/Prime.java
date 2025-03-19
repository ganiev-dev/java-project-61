package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void start() {
        final int minGenVal = 1;
        final int maxGenVal = 100;

        //Create arr with questions and right answers
        String[] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER * 2];
        for (int i = 0; i < questionsAndRightAnswers.length; i += 2) {
            int questionNum = Utils.generateRandomNumber(minGenVal, maxGenVal);
            String rightAnswer = "yes";

            for (int j = 2; j <= Math.sqrt(questionNum); j++) {
                if (questionNum < 2 || questionNum % j == 0) {
                    rightAnswer = "no";
                    break;
                }
            }

            //Question
            String question = questionNum + "";

            //Right answer
            questionsAndRightAnswers[i] = question;
            questionsAndRightAnswers[i + 1] = rightAnswer;
        }

        Engine.start("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questionsAndRightAnswers);
    }
}
