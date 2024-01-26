package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.launchTheGame;
import static hexlet.code.RandomInt.rnd;

public class Progression {
    public static void makeProgression(int roundsNumber) {
        String headline = "What number is missing in the progression?";
        String[] questions = new String[roundsNumber];
        String[] correctAnswers = new String[roundsNumber];

        for (int i = 0; i < roundsNumber; i++) { // заполнение массива String[] questions
            final int minProgressionLength = 5;
            final int maxProgressionLength = 10;
            int progressionNumbersLength = rnd(minProgressionLength, maxProgressionLength);
            int[] progressionNumbers = new int[progressionNumbersLength];
            final int numbersSet = 10;
            progressionNumbers[0] = (int) (Math.random() * numbersSet);
            int summand = (int) (Math.random() * numbersSet);

            for (int j = 1; j < progressionNumbersLength; j++) { // заполнение внутреннего массива progressionNumbers
                progressionNumbers[j] = summand + progressionNumbers[j - 1];
            }

            String questionNumbers = "";
            Random r = new Random();
            int randIndex = r.nextInt(progressionNumbersLength); // значение progressionNumbersLength НЕ включительно

            for (int k = 0; k < progressionNumbersLength; k++) { // формирование элемента типа String для questions
                if (k == randIndex) {
                    questionNumbers += ".. ";
                } else {
                    questionNumbers += progressionNumbers[k] + " ";
                }
            }

            questions[i] = questionNumbers;
            correctAnswers[i] = String.valueOf(progressionNumbers[randIndex]);

        }

        launchTheGame(headline, questions, correctAnswers);
    }
}
