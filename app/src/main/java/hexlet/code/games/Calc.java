package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void start() {
        Engine.start("calc", "What is the result of the expression?");
    }

    public static String[] createRound() {
        int a = Engine.generateRandomNumber(100);
        int b = Engine.generateRandomNumber(100);
        int c = (int) Math.ceil(Engine.generateRandomNumber(3));
        String[] operators = {"+", "-", "*"};

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
