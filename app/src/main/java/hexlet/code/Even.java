package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void parityCheck() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int counter = 0;

        while (counter < 3) {
            int questionNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + questionNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if ((questionNumber % 2 == 0 & userAnswer.equals("yes")) |
                (questionNumber % 2 != 0 & userAnswer.equals("no"))) {
                System.out.println("Correct!");
                counter++;
            } else if (questionNumber % 2 == 0) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (counter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}