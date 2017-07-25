/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // the int kida looks like a 1(one) but it's an l(L)
        for (int l = 0; l<10;l++){
            System.out.println("I love Java.");
           
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "Please enter a number that I'll count up to." );
       String countuptonumber = keyboard.nextLine();
        int c = Integer.parseInt(countuptonumber);
        for (int l = 0; l<=c;l++){
            System.out.print(l + " ");
           
        }

        System.out.println("\n\nNow, please select a starting number.");
         String startnumber = keyboard.nextLine();
        int d = Integer.parseInt(startnumber);
        
        System.out.println("Now, please select an ending number.");
         String endnumber = keyboard.nextLine();
        int e = Integer.parseInt(endnumber);
        
        System.out.println("Now, please select a number to count by.");
         String numbermultiple = keyboard.nextLine();
        int f = Integer.parseInt(numbermultiple);
      
         for (int l = d; l<=e;l+=f){
            System.out.print(l + " ");
           
    } 
         System.out.println("\n\n\nI will now count in twos. Press enter to continue.");
         String banana = keyboard.nextLine(); 
         
         int[] array2 = new int[10];
        int index = 0;
        while (index < 10) {
            array2[index] = (index * 2);
            System.out.println("\n\n" + array2[index]);

            index++;

        }
         System.out.println("\n\n\nI will now count in twos. Press enter to continue.");
         String apple = keyboard.nextLine(); 
         
           double[] array3 = new double[10];
        int index = 0;
        while (index < 10) {
            array2[index] = (index * 1.25);
            System.out.println("The element at index " + index + " is " + array2[index] + ", ");

            index++;
           
    } 
}
}
