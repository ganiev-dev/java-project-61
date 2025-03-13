package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void start() {
        final int range = 100; // Generate range max value

        //Greetings part
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        System.out.print("Hello, " + name + "!" + "\n");

        //Rules
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        //Game
        for (int count = 1; count <= 3; count++) {
            int num = (int) (Math.random() * range);

            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            Scanner scanAnswer = new Scanner(System.in);
            String userAnswer = scanAnswer.nextLine();

            String rightAnswer = (num % 2 == 0) ? "yes" : "no";
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
