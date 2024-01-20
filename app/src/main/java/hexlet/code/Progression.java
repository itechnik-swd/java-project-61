package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void makeProgression() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What number is missing in the progression?");

        int counter = 0;

        while (counter < 3) {
            int[] progressionNumbers = new int[10];
            progressionNumbers[0] = (int) (Math.random() * 10);
            int summand = (int) (Math.random() * 10);

            for (int i = 1; i < 10; i++) {
                progressionNumbers[i] = summand + progressionNumbers[i - 1];
            }

            String questionNumbers = "";
            Random r = new Random();
            int randIndx = r.nextInt(10);

            for (int i = 0; i < 10; i++) {
                if (i == randIndx) {
                    questionNumbers += ".. ";
                } else {
                    questionNumbers += progressionNumbers[i] + " ";
                }
            }

            System.out.println("Question: " + questionNumbers);
            System.out.print("Your answer: ");

            Scanner sc = new Scanner(System.in);
            int userAnswer = sc.nextInt();

                if (progressionNumbers[randIndx] == userAnswer) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                            + progressionNumbers[randIndx] + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}