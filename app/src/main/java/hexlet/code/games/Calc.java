package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

import static hexlet.code.Engine.getRandomInt;
import static hexlet.code.Engine.launchTheGame;

public class Calc {
    public static void calculate() {
        String headline = "What is the result of the expression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int row = 0; row < Engine.ROUNDS; row++) {
            int operand1 = getRandomInt();
            int operand2 = getRandomInt();
            String operators = "+-*";

            Random r = new Random();
            char operator = operators.charAt(r.nextInt(operators.length()));

            String expression = operand1 + " " + operator + " " + operand2;
            questionsAndCorrectAnswers[row][0] = expression;
            questionsAndCorrectAnswers[row][1] = String.valueOf(makeExpression(operand1, operand2, operator));
        }

        launchTheGame(headline, questionsAndCorrectAnswers);
    }

    static int makeExpression(int operand1, int operand2, char operator) {
        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}
