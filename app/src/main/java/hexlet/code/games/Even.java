package hexlet.code.games;

import static hexlet.code.Engine.launchTheGame;

public class Even {
    public static void parityCheck(int roundsNumber) {
        String headline = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[roundsNumber];
        String[] correctAnswers = new String[roundsNumber];

        for (int i = 0; i < roundsNumber; i++) {
            final int numbersSet = 100;
            int questionNumber = (int) (Math.random() * numbersSet);
            questions[i] = String.valueOf(questionNumber);

            if (questionNumber % 2 == 0) {
                correctAnswers[i] = "yes";
            } else {
                correctAnswers[i] = "no";
            }
        }

        launchTheGame(headline, questions, correctAnswers);
    }
}
