package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.getRandomInt;
import static hexlet.code.Engine.launchTheGame;
import static hexlet.code.Utils.generateNumber;

public class Progression {
    public static void progression() {
        String headline = "What number is missing in the progression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int row = 0; row < Engine.ROUNDS; row++) {
            final int minProgressionLength = 5;
            final int maxProgressionLength = 10;
            final int progressionLength = generateNumber(minProgressionLength, maxProgressionLength);
            int first = getRandomInt();
            final int minSummand = 1;
            final int maxSummand = 100;
            int step = generateNumber(minSummand, maxSummand);

            Random r = new Random();
            int hiddenMemberIndex = r.nextInt(progressionLength); // значение PROGRESSION_LENGTH НЕ включительно

            String[] progression = makeProgression(first, step, progressionLength);
            String answer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            questionsAndCorrectAnswers[row][0] = question;
            questionsAndCorrectAnswers[row][1] = answer;
        }

        launchTheGame(headline, questionsAndCorrectAnswers);
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}
