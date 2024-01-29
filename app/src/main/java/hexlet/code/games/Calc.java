package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_SET;
import static hexlet.code.Engine.launchTheGame;
import static hexlet.code.Utils.generateNumber;

public class Calc {
    public static void calculate() {
        String headline = "What is the result of the expression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int row = 0; row < Engine.ROUNDS; row++) {
            int operand1 = generateNumber(0, NUMBER_SET);
            int operand2 = generateNumber(0, NUMBER_SET);
            String operators = "+-*";
            char operator = operators.charAt(generateNumber(0, operators.length() - 1)); // длина (3) НЕ включительно
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
