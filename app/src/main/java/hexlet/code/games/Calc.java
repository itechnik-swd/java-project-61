package hexlet.code.games;

import java.util.Random;
import static hexlet.code.Engine.launchTheGame;

public class Calc {
    public static void calculate(int roundsNumber) {
        String headline = "What is the result of the expression?";
        String[] questions = new String[roundsNumber];
        String[] correctAnswers = new String[roundsNumber];

        for (int i = 0; i < roundsNumber; i++) {
            final int numbersSet = 100;
            int operand1 = (int) (Math.random() * numbersSet);
            int operand2 = (int) (Math.random() * numbersSet);
            String operators = "+-*";

            Random r = new Random();
            char c = operators.charAt(r.nextInt(operators.length()));
            int result = switch (c) {
                case '+' -> operand1 + operand2;
                case '-' -> operand1 - operand2;
                default -> operand1 * operand2;
            };

            String expression = operand1 + " " + c + " " + operand2;
            questions[i] = expression;
            correctAnswers[i] = String.valueOf(result);
        }

        launchTheGame(headline, questions, correctAnswers);
    }

}
