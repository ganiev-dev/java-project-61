package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choise = scanner.nextLine();

        switch (choise) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                Even.start();
                break;
            case "3":
                Calc.start();
                break;
            case "4":
                Gcd.start();
                break;
            case "5":
                Progression.start();
                break;
            case "6":
                Prime.start();
                break;
            case "0":
                break;
            default:
                break;
        }
    }
}
