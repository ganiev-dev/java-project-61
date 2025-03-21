package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNTER = 3;

    public static void start(String rules, String[][] questionsAndRightAnswers) {

        //greetings
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        System.out.print("Hello, " + name + "!" + "\n");

        //rules
        System.out.println(rules);

        //game
        for (int i = 0; i < ROUND_COUNTER; i++) {

            //get question & right answer
            String question = questionsAndRightAnswers[i][0];
            String rightAnswer = questionsAndRightAnswers[i][1];

            //request by user
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
}
