package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.introduce;
import static hexlet.code.Even.parityCheck;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        switch (choose()) {
            case 1:
                introduce();
                break;
            case 2:
                parityCheck();
                break;
        }

    }
    public static int choose() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
