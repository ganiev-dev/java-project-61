package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void start() {
        Engine.start("calc", "What is the result of the expression?");
    }

    public static String[] createRound() {
        int maxGenVal = 100;
        int a = Engine.generateRandomNumber(maxGenVal);
        int b = Engine.generateRandomNumber(maxGenVal);

        String[] operators = {"+", "-", "*"};
        int c = (int) Math.ceil(Engine.generateRandomNumber(operators.length));

        //Question
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

        return new String[]{question, rightAnswer};
    }
}
