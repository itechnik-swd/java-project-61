package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getRandomInt;
import static hexlet.code.Engine.launchTheGame;

public class Even {
    public static void parityCheck() {
        String headline = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int row = 0; row < Engine.ROUNDS; row++) {
            int questionNumber = getRandomInt();
            questionsAndCorrectAnswers[row][0] = String.valueOf(questionNumber);

            String answer = isEven(questionNumber) ? "yes" : "no";
            questionsAndCorrectAnswers[row][1] = answer;
        }

        launchTheGame(headline, questionsAndCorrectAnswers);
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
