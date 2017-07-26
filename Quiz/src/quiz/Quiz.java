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
        
        System.out.println("Make sure CAPSLOCK is on.\n\n");
        
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
        }
            
             System.out.println("\n\nQuestion 2: What is the opposite of fire");
        
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
             
            
        }
        System.out.println("\n\nQuestion 3: What does pumpernickel mean?");
        System.out.println("\tA) Devil's Fart");
        System.out.println("\tB) Pumpkin Bread");
        System.out.println("\tC) Mine Shaft");
        System.out.println("\tD) Nickel Pump");
        String answer3 = keyboard.nextLine();
        if ((answer3.equals("A")) || answer1.equals("V")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Pumpernickel is a German rye bread that causes massive amounts of intestinal gases which are byproducts of bacteria in yur gut breaking it down. It's called the devil's fart because that's what it smells like when you let those gases out of your anal passage! Gross, right?");
        
        }
            System.out.println("\n\nQuestion 4: What is the speed of light?");
       
        System.out.println("\tA) 299,792,458 m/s");
        System.out.println("\tB) 43594.56*e^2=lightspeed");
        System.out.println("\tC) 10,000 km/h");
        System.out.println("\tD) 8,348,590,329 MPH * 324.6856^π");
        String answer4 = keyboard.nextLine();
        if ((answer4.equals("A")) || answer1.equals("V")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }else {
            System.out.println("The speed of light is 299,792,458 m/s");
            
           System.out.println("\n\nQuestion 5: What is the most viewed video on YouTube™?");
        }
        System.out.println("\tA) Uptown Funk");
        System.out.println("\tB) See You Again");
        System.out.println("\tC) Gangnam Style");
        System.out.println("\tD) I am the right answer!");
        String answer5 = keyboard.nextLine();
        if ((answer5.equals("B")) || answer1.equals("V")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }else {
            System.out.println("Wrong it's \"See You Again");
        
        
    }
    System.out.println("Your score is " + rightAnswers + " out of 5 questions.");
    }
}

//


























    
