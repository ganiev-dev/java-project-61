package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void start() {
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!" + "\n");

        //game
        for (int i = 1; i <= 3; i++) {

            //get question & right answer
            int questionNum = generateRandomNumber(100);

            //Question
            String question = questionNum + "";

            //Right answer
            String rightAnswer = (questionNum % 2 == 0) ? "yes" : "no";


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
    public static int generateRandomNumber(int rangeNum) {
        return (int) (Math.random() * rangeNum);
    }
}


