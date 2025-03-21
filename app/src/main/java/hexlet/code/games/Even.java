package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Even {
    static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        final int maxValGameNum = 100;

        //Create arr with questions and right answers
        String[][] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER][2];
        for (int i = 0; i < questionsAndRightAnswers.length; i++) {
            int questionNum = generateRandomNumber(maxValGameNum);

            //Question
            String question = questionNum + "";

            //Right answer
            String rightAnswer = isEven(questionNum);

            //Set
            questionsAndRightAnswers[i][0] = question;
            questionsAndRightAnswers[i][1] = rightAnswer;
        }

        Engine.start(RULES, questionsAndRightAnswers);
    }

    public static String isEven(int questionNum) {
        return (questionNum % 2 == 0) ? "yes" : "no";
    }
}
