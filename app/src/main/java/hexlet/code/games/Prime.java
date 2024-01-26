package hexlet.code.games;

import static hexlet.code.Engine.launchTheGame;

public class Prime {
    public static void primeCheck(int roundsNumber) {
        String headline = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[roundsNumber];
        String[] correctAnswers = new String[roundsNumber];

        for (int i = 0; i < roundsNumber; i++) {
            int questionNumber = (int) (Math.random() * 100);
            questions[i] = String.valueOf(questionNumber);

            if (isPrime(questionNumber)) {
                correctAnswers[i] = "yes";
            } else {
                correctAnswers[i] = "no";
            }
        }

        launchTheGame(headline, questions, correctAnswers);
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
