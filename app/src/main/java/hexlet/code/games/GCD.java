package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomInt;
import static hexlet.code.Engine.launchTheGame;

public class GCD {
    public static void getGCD() {
        String headline = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int row = 0; row < Engine.ROUNDS; row++) {
            int number1 = getRandomInt();
            int number2 = getRandomInt();

            String question = number1 + " " + number2;
            questionsAndCorrectAnswers[row][0] = question;
            questionsAndCorrectAnswers[row][1] = String.valueOf(gcd(number1, number2));
        }

        launchTheGame(headline, questionsAndCorrectAnswers);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
