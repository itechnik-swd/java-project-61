package hexlet.code;

import java.util.Scanner;

public class Engine {
    /*
    Игры общаются с пользователем, выводят вопросы, запрашивают и сравнивают ответы, выводят результат игры.
    Эту общую логику стоит поместить в отдельный метод класса Engine в файле src/main/java/hexlet/code/Engine.java).
    Главная задача этого шага (#6) – построить архитектуру запуска игр так,
    чтобы эта логика была в одном месте и управляла играми.
    */
    public static final int ROUNDS = 3;
    public static final int NUMBER_SET = 100;

    public static void launchTheGame(String headline, String[][] questionsAndCorrectAnswers) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(headline);

        for (String[] pair : questionsAndCorrectAnswers) {
            System.out.println("Question: " + pair[0]);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.next();

            if (pair[1].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + pair[1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
