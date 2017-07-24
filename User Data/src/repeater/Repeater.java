/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

}
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it 3 times: " );
       String input = keyboard.nextLine();
       
       System.out.println("Here we go!");
       int count = 0;
       while (count < 3) {
           System.out.println(input);
           count ++;
       }
    }
    
}