/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it." );
       String input = keyboard.nextLine();
        System.out.print( "How many times would you like me to repeat it?" );
       int amount = Integer.parseInt(keyboard.nextLine());
       System.out.println("Here we go!");
       int count = 1;
       while (count <= amount) {
           System.out.println(input);
           count ++;
           
       }
    }
    
}