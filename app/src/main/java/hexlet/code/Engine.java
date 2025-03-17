package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class Engine {
    public static void start(String game, String rules) {

        //greetings
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        System.out.print("Hello, " + name + "!" + "\n");

        //rules
        System.out.println(rules);

        //game
        final int roundCounter = 3;
        for (int i = 1; i <= roundCounter; i++) {

            //get question & right answer
            String[] round = chooseGameLogic(game);
            String question = round[0];
            String rightAnswer = round[1];

            //request
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            Scanner scanAnswer = new Scanner(System.in);
            String userAnswer = scanAnswer.nextLine();

            //check
            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer. Correct answer was '%s'.\n", userAnswer, rightAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

    public static int generateRandomNumber(int maxNum) {
        return (int) (Math.random() * maxNum);
    }
    public static int generateRandomNumber(int minNum, int maxNum) {
        return (int) (Math.random() * maxNum + minNum);
    }

    public static String[] chooseGameLogic(String game) {
        return switch (game) {
            case "even" -> Even.createRound();
            case "calc" -> Calc.createRound();
            case "gcd" -> Gcd.createRound();
            case "progression" -> Progression.createRound();
            case "prime" -> Prime.createRound();
            default -> null;
        };
    }
}
