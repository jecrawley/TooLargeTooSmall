package crawley.james.TooLargeTooSmall;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class GuessHandler {

    private int number;
    private int attempts = 0;
    private Scanner scan = new Scanner(System.in);
    private ArrayList guessArrList = new ArrayList();

    boolean isCorrectGuess = false;

    public GuessHandler () {

    }

    private int getValidNumberFromUser() {

        try {
            number = Integer.parseInt(scan.next());
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Please input an integer.");
            getValidNumberFromUser();
        }

        return number;
    }

    public int getValidGuessFromUser () {
        int userGuess = getValidNumberFromUser();

        while (!(userGuess < 51 && userGuess > 0)) {
            System.out.println("Please guess a number between 1 and 50.");
            userGuess = getValidNumberFromUser();
        }

        return userGuess;

    }

    public void compareUserGuess (int secretValue, int userGuess) {

        if (secretValue > userGuess) {
            System.out.println("Your guess was too low.");
            increaseAttemptCount(userGuess);
        } else if (secretValue < userGuess) {
            System.out.println("Your guess was too high.");
            increaseAttemptCount(userGuess);
        } else if (secretValue == userGuess) {
            endGame();
        }
    }

    private void endGame () {
        System.out.println("Your guess was correct!");
        attempts++;
        System.out.println("It took you " + attempts + " tries.");
        isCorrectGuess = true;
        scan.close();
    }

    private void increaseAttemptCount (int userGuess) {

        if (guessArrList.contains(userGuess)) {

        } else {
            guessArrList.add(userGuess);
            attempts++;
        }

    }


}
