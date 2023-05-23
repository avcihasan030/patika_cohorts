package NumberGuessingGame;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int number = (int) (Math.random() * 100);
            int[] wrongGuesses = new int[5];
            int selected;
            int rights = 0;
            boolean isWin = false;

            for (int i = 0; i < 5; i++) {
                System.out.println("I have a number between 0-100. Guess it!");
                System.out.print("-> ");
                selected = scan.nextInt();

                if (isValid(selected)) {
                    if (selected == number) {
                        System.out.println("Congratulations, you guessed it correctly! - " + number);
                        isWin = true;
                        break;
                    } else {
                        System.out.println("Incorrect!");
                        if (selected < number) {
                            System.out.println("Your guess is less than the correct one.");
                        } else {
                            System.out.println("Your guess is greater than the correct one");
                        }
                        wrongGuesses[rights++] = selected;
                        System.out.println("Remaining rights: " + (5 - rights));
                    }
                } else {
                    System.out.println("Please input your guess within the given limits! (0-100)");
                    continue;
                }
            }

            if (!isWin) {
                System.out.println("You lost!" + " Your guesses are : " + Arrays.toString(wrongGuesses));
                System.out.println("The correct number was : " + number);
            }
        }

    }

    private static boolean isValid(int selected) {
        return (selected >= 0 && selected <= 100);
    }
}