/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the calculator app. ©Joseph Silvi 2017");
        System.out.println("Type an equation to proceed. You can type quit now if you wish to quit ");
        while (true) {
            String input = keyboard.nextLine();
            if (input.equals("quit") || (input.equals("Quit")) || (input.equals("qUiz")) || (input.equals("QUit")) || (input.equals("QUIt")) || (input.equals("QUIT")) || (input.equals("qUIt")) || (input.equals("qUIT")) || (input.equals("QuiT")) || (input.equals("QuIT")) || (input.equals("QuIt"))) {
                break;
            }

            //logic: calculate input
            if (input.contains("+") || input.contains("t")) {
                int index = input.indexOf("+");
                if (index==-1) {
                     index = input.indexOf("t");
                }
                
                String num1 = input.substring(0, index);
                String num2 = input.substring(index+1, input.length());
                double addition = Double.parseDouble(num1 )+ Double.parseDouble( num2);
                System.out.println(addition);
                
                
            } else if (input.contains("-") || input.contains("_")) {

            } else if (input.contains("*") || input.contains("x") || input.contains("X")) {

            } else if (input.contains("/") || input.contains("÷") ) {
            }
        }
    }
}
