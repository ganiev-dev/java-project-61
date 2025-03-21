package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        final int maxValGameNum = 100;

        //Create arr with questions and right answers
        String[][] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER][2];
        for (int i = 0; i < questionsAndRightAnswers.length; i++) {
            int questionNum = Utils.generateRandomNumber(maxValGameNum);

            //Question
            String question = questionNum + "";

            //Right answer
            String rightAnswer = isPrime(questionNum);

            //Set
            questionsAndRightAnswers[i][0] = question;
            questionsAndRightAnswers[i][1] = rightAnswer;
        }

        Engine.start(RULES, questionsAndRightAnswers);
    }

    public static String isPrime(int questionNum) {
        if (!(questionNum < 2)) {
            for (int j = 2; j * j <= questionNum; j++) {
                if (questionNum % j == 0) {
                    return "no";
                }
            }
        } else {
            return "no";
        }
        return "yes";
    }
}
