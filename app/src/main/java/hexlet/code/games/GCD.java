package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_SET;
import static hexlet.code.Engine.launchTheGame;
import static hexlet.code.Utils.generateNumber;

public class GCD {
    public static void getGCD() {
        String headline = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int row = 0; row < Engine.ROUNDS; row++) {
            int number1 = generateNumber(0, NUMBER_SET);
            int number2 = generateNumber(0, NUMBER_SET);

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
