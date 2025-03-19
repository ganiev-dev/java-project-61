package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Even {
    public static void start() {

        final int maxGenVal = 100;

        //Create arr with questions and right answers
        String[] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER * 2];
        for (int i = 0; i < questionsAndRightAnswers.length; i += 2) {
            int questionNum = generateRandomNumber(maxGenVal);

            //Question
            String question = questionNum + "";

            //Right answer
            String rightAnswer = (questionNum % 2 == 0) ? "yes" : "no";
            questionsAndRightAnswers[i] = question;
            questionsAndRightAnswers[i + 1] = rightAnswer;
        }

        Engine.start("Answer 'yes' if the number is even, otherwise answer 'no'.", questionsAndRightAnswers);
    }
}
