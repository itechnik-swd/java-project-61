package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.introduce;

public class Prime {
    public static void primeCheck() {
        introduce();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int counter = 0;

        while (counter < 3) {
            int questionNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + questionNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();

            if ((isPrime(questionNumber) & userAnswer.equals("yes")) |
                    (!isPrime(questionNumber) & userAnswer.equals("no"))) {
                System.out.println("Correct!");
                counter++;
            } else if (isPrime(questionNumber)) {
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
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
