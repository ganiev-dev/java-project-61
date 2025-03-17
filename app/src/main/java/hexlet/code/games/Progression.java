package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {
    public static void start() {
        Engine.start("progression", "What number is missing in the progression?");
    }
    public static String[] createRound() {
        int startNum = Engine.generateRandomNumber(100);
        int positionOfHiddenNum = Engine.generateRandomNumber(10);
        String rightAnswer = "test";

        //create and fill
        String[] progression = new String[10];
        for (int i = 0; i < 10; i++) {
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
