/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.game;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program rolls two dice");
            System.out.println("Rolling di #1");
    int a = (int) (Math.random()*6) + 1;
    System.out.println("The result is " + a);
    System.out.println("Rolling the second di");
     int b  = (int) (Math.random()*6) + 1;
    System.out.println("The result is " + b);
    
              
    }
    
}
