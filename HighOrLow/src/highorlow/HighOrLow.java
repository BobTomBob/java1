/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highorlow;

/**
 *
 * @author Education Unlimited
 */
import java.util.Scanner;

public class HighOrLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numberReal = (int) (Math.random() * 100 + 1);
        int guessAmount = 0;
        int numberGuess = 0;
        int hintAmount = 0;
        System.out.println("I'm thinking of a number between 1 and 100!\n");
        while (numberReal != numberGuess) {
            System.out.print("What number am I thinking of? ");
            numberGuess = Integer.parseInt(keyboard.nextLine());
            if (numberGuess < numberReal) {
                System.out.println("Your guess is like the speed limit - Too Low.\n");
                guessAmount++;
            }
            if (numberGuess > numberReal) {
                System.out.println("You're flying vertically in an F-22! - Too High.\n");
                guessAmount++;
            }
            if (numberGuess == numberReal) {
                guessAmount++;
                System.out.println("\nCorrect. " + numberReal + " Was the secret number.");
                System.out.println("It  took you " + guessAmount + " guesses!");
            }
            //:-D
            if (guessAmount == 10 && (numberReal != numberGuess)) {
                hintAmount = numberReal / 10 * 10;
                System.out.println("Here's a hint. The secret number is in between " + hintAmount + " & " + (hintAmount + 10) + ".\n");
            }
        }
    }

}
