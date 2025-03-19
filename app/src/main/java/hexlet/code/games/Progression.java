package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Progression {
    public static void start() {
        final int maxGenVal = 100;
        final int lengthOfProgression = 10;

        //Create arr with questions and right answers
        String[] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER * 2];
        for (int i = 0; i < questionsAndRightAnswers.length; i += 2) {
            int startNum = generateRandomNumber(maxGenVal);
            int positionOfHiddenNum = generateRandomNumber(lengthOfProgression);
            String rightAnswer = "test";

            //create and fill
            String[] progression = new String[lengthOfProgression];
            for (int j = 0; j < lengthOfProgression; j++) {
                progression[j] = startNum + "";
                if (j == positionOfHiddenNum) {
                    rightAnswer = progression[j];
                    progression[j] = "..";
                }
                startNum += 2;
            }

            //Question
            String question = String.join(" ", progression);

            questionsAndRightAnswers[i] = question;
            questionsAndRightAnswers[i + 1] = rightAnswer;
        }

        Engine.start("What number is missing in the progression?", questionsAndRightAnswers);
    }

}
