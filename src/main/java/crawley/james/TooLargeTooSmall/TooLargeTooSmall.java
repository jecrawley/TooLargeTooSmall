package crawley.james.TooLargeTooSmall;

import java.util.Random;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class TooLargeTooSmall {

    public static void main (String[] args) {

        GuessHandler guessHandler = new GuessHandler();
        Random random = new Random();
        int secretNumber = random.nextInt(50) + 1;
        int userGuess;

        System.out.println("I'm thinking of a number between 1 and 50. Can you guess it?");

        while (!(guessHandler.isCorrectGuess)) {
            userGuess = guessHandler.getValidGuessFromUser();
            guessHandler.compareUserGuess(secretNumber, userGuess);
        }

    }
}
