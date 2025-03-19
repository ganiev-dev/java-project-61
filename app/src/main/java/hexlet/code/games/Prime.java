package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void start() {
        final int maxGenVal = 100;

        //Create arr with questions and right answers
        String[] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER * 2];
        for (int i = 0; i < questionsAndRightAnswers.length; i += 2) {
            int questionNum = Utils.generateRandomNumber(maxGenVal);
            String rightAnswer = "yes";

            if (!(questionNum < 2)) {
                for (int j = 2; j * j <= questionNum; j++) {
                    if (questionNum % j == 0) {
                        rightAnswer = "no";
                        break;
                    }
                }
            } else {
                rightAnswer = "no";
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
