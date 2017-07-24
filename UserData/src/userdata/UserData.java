/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userdata;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "Please enter the paskey for this program." );
       String paskeyprogram = keyboard.nextLine();
       System.out.println( "Paskey accepted You entered: " + paskeyprogram +". Please type continue");
        String paskey = keyboard.nextLine();
       System.out.println( "How old are you?" );
       String age = keyboard.nextLine();
        System.out.println( "To verify that you are authorized to use this computer, please enter your birthday." );
        String bday = keyboard.nextLine();
         System.out.println( "For further verification, please enter your first and last name. (Case Sensitive)" );
       String name = keyboard.nextLine();
       System.out.println( "Access granted" + ". You have gained acces to the app with no purpose. This program will ask you some questions, some of which may have been before but just sit back, relax and type.");
        String ageverify = keyboard.nextLine();
        System.out.println("Please enter the year you were born");
        int year = Integer.parseInt(keyboard.nextLine());
        System.out.println( "Are you male or female?");
        String gender = keyboard.nextLine();
        System.out.println( "How many siblings do you have?+ (Please enter a number)");
        int siblings = Integer.parseInt(keyboard.nextLine());
         System.out.println( "Please enter your height in meters");
        double height = Double.parseDouble(keyboard.nextLine());
           System.out.println( "Thanks for using this application. Please rate this app on a scale of 1-10");
        double rating = Double.parseDouble(keyboard.nextLine());
        System.out.println(name + " is " + age + " years old and was born on " + bday + " and has " + siblings + "." + name + " is " + gender + " and is " + height);
            }
    
}