/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: Where is Chernōbyl");
        System.out.println("\tA) Belarus");
        System.out.println("\tB) Kazakhstan");
        System.out.println("\tC) Russia");
        System.out.println("\tD) The Ukraine");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, Chernōbyl is in The Ukraine");
            
             System.out.println("Question 2: What is the opposite of fire");
        }
        System.out.println("\tA) Water");
        System.out.println("\tB) Ice");
        System.out.println("\tC) Plants");
        System.out.println("\tD) The Fire Department");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Maybe you guessed water or ice. Fire is partly made of water. Fire burns hydrogen, carbon and oxygen normally, which produces CO2 and H2O and energy. The opposite of fire is something that uses energy, H20 and C02 to live. Sounds like a plant to me.");
             
            System.out.println("Question 3: What does pumpernickel mean?");
        }
        System.out.println("\tA) Devil's Fart");
        System.out.println("\tB) Pumpkin Bread");
        System.out.println("\tC) Mine Shaft");
        System.out.println("\tD) Nickel Pump");
        String answer3 = keyboard.nextLine();
        if ((answer3.equals("B")) || answer1.equals("V")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        
       
            System.out.println("Question 4: What is the capital of California?");
        }
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer4 = keyboard.nextLine();
        if ((answer4.equals("B")) || answer1.equals("V")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        
        System.out.println("Your score is " + rightAnswers + " out of 5 questions.");
    }
    
    }
}


    
