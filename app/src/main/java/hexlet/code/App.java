package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.introduce;
import static hexlet.code.Even.parityCheck;
import static hexlet.code.Progression.makeProgression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");

        String[] menu = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD",
                "5 - Progression", "0 - Exit"};

        for (String element : menu) {
            System.out.println(element);
        }

        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();

        switch (selectedNumber) {
            case 1:
                introduce();
                break;
            case 2:
                parityCheck();
                break;
            case 5:
                makeProgression();
                break;
        }
    }
}
