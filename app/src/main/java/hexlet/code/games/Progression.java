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
            int progressionNumbersLength = rnd(5, 10);
            int[] progressionNumbers = new int[progressionNumbersLength];
            progressionNumbers[0] = (int) (Math.random() * 10);
            int summand = (int) (Math.random() * 10);

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
