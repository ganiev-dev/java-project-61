package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                Cli.greetings();
                break;
            case 2:
                Even.start();
                break;
            case 3:
                Calc.start();
                break;
            case 4:
                Gcd.start();
                break;
            case 0:
                break;
            default:
                break;
        }
    }
}
