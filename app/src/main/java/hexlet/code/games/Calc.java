package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Calc {
    public static void start() {
        final int maxGenVal = 100;

        //Create arr with questions and right answers
        String[] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER * 2];
        for (int i = 0; i < questionsAndRightAnswers.length; i += 2) {

            int a = generateRandomNumber(maxGenVal);
            int b = generateRandomNumber(maxGenVal);

            //Question
            String[] operators = {"+", "-", "*"};
            int c = (int) Math.ceil(generateRandomNumber(operators.length));
            String question = a + " " + operators[c] + " " + b;

            //Right answer
            String rightAnswer = "";
            switch (operators[c]) {
                case "+":
                    rightAnswer = a + b + "";
                    break;
                case "-":
                    rightAnswer = a - b + "";
                    break;
                case "*":
                    rightAnswer = a * b + "";
                    break;
                default: break;
            }

            questionsAndRightAnswers[i] = question;
            questionsAndRightAnswers[i + 1] = rightAnswer;
        }

        Engine.start("What is the result of the expression?", questionsAndRightAnswers);
    }
}
