package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {
    public static void start() {
        Engine.start("progression", "What number is missing in the progression?");
    }
    public static String[] createRound() {
        int maxGenVal = 100;
        int lengthOfProgression = 10;
        int startNum = Engine.generateRandomNumber(maxGenVal);
        int positionOfHiddenNum = Engine.generateRandomNumber(lengthOfProgression);
        String rightAnswer = "test";

        //create and fill
        String[] progression = new String[lengthOfProgression];
        for (int i = 0; i < lengthOfProgression; i++) {
            progression[i] = startNum + "";
            if (i == positionOfHiddenNum) {
                rightAnswer = progression[i];
                progression[i] = "..";
            }
            startNum += 2;
        }

        //Question
        String question = String.join(" ", progression);

        String[] result = {question, rightAnswer};
        return result;
    }
}
