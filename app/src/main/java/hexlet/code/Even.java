package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.introduce;

public class Even {
    public static void parityCheck() {
        introduce();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int counter = 0;

        while (counter < 3) {
            int questionNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + questionNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();

            if ((questionNumber % 2 == 0 & userAnswer.equals("yes")) |
                (questionNumber % 2 != 0 & userAnswer.equals("no"))) {
                System.out.println("Correct!");
                counter++;
            } else if (questionNumber % 2 == 0) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
        }

        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
