package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Calc {
    static final String RULES = "What is the result of the expression?";

    public static void start() {
        final int maxValGameNum = 100;

        //Create arr with questions and right answers
        String[][] questionsAndRightAnswers = new String[Engine.ROUND_COUNTER][2];
        for (int i = 0; i < questionsAndRightAnswers.length; i++) {
            int a = generateRandomNumber(maxValGameNum);
            int b = generateRandomNumber(maxValGameNum);
            String operand = chooseOperand();

            //Question
            String question = a + " " + operand + " " + b;

            //Right answer
            String rightAnswer = resultOfOperation(a, b, operand) + "";

            //Set
            questionsAndRightAnswers[i][0] = question;
            questionsAndRightAnswers[i][1] = rightAnswer;
        }

        Engine.start(RULES, questionsAndRightAnswers);
    }

    public static String chooseOperand() {
        String[] operators = {"+", "-", "*"};
        int c = (int) Math.ceil(generateRandomNumber(operators.length));
        return operators[c];
    }

    public static int resultOfOperation(int a, int b, String operand) {
        return switch (operand) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };
    }
}
