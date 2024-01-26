package hexlet.code.games;

import static hexlet.code.Engine.launchTheGame;

public class GCD {
    public static void getGCD(int roundsNumber) {
        String headline = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[roundsNumber];
        String[] correctAnswers = new String[roundsNumber];

        for (int i = 0; i < roundsNumber; i++) {
            final int numbersSet = 100;
            int number1 = (int) (Math.random() * numbersSet);
            int number2 = (int) (Math.random() * numbersSet);

            String question = number1 + " " + number2;
            questions[i] = question;
            correctAnswers[i] = String.valueOf(gcd(number1, number2));
        }

        launchTheGame(headline, questions, correctAnswers);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
