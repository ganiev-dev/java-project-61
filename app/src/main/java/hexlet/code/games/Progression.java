package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Progression {
    static final String RULES = "What number is missing in the progression?";

    public static void start() {
        final int maxValGameNum = 100;
        final int lengthOfProgression = 10;

        //Create arr with questions and right answers
        String[][] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER][2];
        for (int i = 0; i < questionsAndRightAnswers.length; i++) {
            int startNum = generateRandomNumber(maxValGameNum);
            int positionOfHiddenNum = generateRandomNumber(lengthOfProgression);
            var progression = createAndFillProgression(lengthOfProgression, startNum);

            //Right answer
            String rightAnswer = progression[positionOfHiddenNum];

            //Question
            progression[positionOfHiddenNum] = "..";
            String question = String.join(" ", progression);

            //Set
            questionsAndRightAnswers[i][0] = question;
            questionsAndRightAnswers[i][1] = rightAnswer;
        }

        Engine.start(RULES, questionsAndRightAnswers);
    }

    public static String[] createAndFillProgression(int lengthOfProgression, int startNum) {
        String[] progression = new String[lengthOfProgression];
        for (int i = 0; i < lengthOfProgression; i++) {
            progression[i] = startNum + "";
            startNum += 2;
        }
        return progression;
    }

}
