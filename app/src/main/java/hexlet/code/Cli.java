package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!" + "\n");
    }
}
