package hexlet.code;

import java.util.Scanner;

public class Engine {
    /*
    Игры общаются с пользователем, выводят вопросы, запрашивают и сравнивают ответы, выводят результат игры.
    Эту общую логику стоит поместить в отдельный метод класса Engine в файле src/main/java/hexlet/code/Engine.java).
    Главная задача этого шага (#6) – построить архитектуру запуска игр так,
    чтобы эта логика была в одном месте и управляла играми.
    */
    public static void launchTheGame(String headline, String[] questions, String[] correctAnswers) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(headline);
        int correctAnswersNumber = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.next();

            if (correctAnswers[i].equals(userAnswer)) {
                System.out.println("Correct!");
                correctAnswersNumber++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + correctAnswers[i] + "'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (correctAnswersNumber == questions.length) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
