package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getRandomInt;
import static hexlet.code.Engine.launchTheGame;

public class Prime {
    public static void primeCheck() {
        String headline = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int row = 0; row < Engine.ROUNDS; row++) {
            int questionNumber = getRandomInt();
            questionsAndCorrectAnswers[row][0] = String.valueOf(questionNumber);

            String answer = isPrime(questionNumber) ? "yes" : "no";
            questionsAndCorrectAnswers[row][1] = answer;
        }

        launchTheGame(headline, questionsAndCorrectAnswers);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
