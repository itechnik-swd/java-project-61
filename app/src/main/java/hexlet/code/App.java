package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greet;
import static hexlet.code.games.Calc.calculate;
import static hexlet.code.games.Even.parityCheck;
import static hexlet.code.games.GCD.getGCD;
import static hexlet.code.games.Prime.primeCheck;
import static hexlet.code.games.Progression.makeProgression;

public class App {
    /*
    - отображение/вывод игрового меню
    - выбор игры
    - запуск/вызов выбранной игры
    */
    public static void main(String[] args) {
        // вывод игрового меню
        System.out.println("Please enter the game number and press Enter.");
        String menu = "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit";
        System.out.println(menu);

        // выбор игры
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String selectedGameNumber = sc.next();

        // количество рацндов
        final int roundsNumber = 3;
        // вызов выбранной игры
        switch (selectedGameNumber) {
            case "0":
                System.out.println("See you later!");
            case "1":
                greet();
                break;
            case "2":
                parityCheck(roundsNumber);
                break;
            case "3":
                calculate(roundsNumber);
                break;
            case "4":
                getGCD(roundsNumber);
                break;
            case "5":
                makeProgression(roundsNumber);
                break;
            case "6":
                primeCheck(roundsNumber);
                break;
            default:
                System.out.println("Please select a number from 0 to 6");
        }
    }
}
