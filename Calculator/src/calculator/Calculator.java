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
        System.out.println("Type an equation to proceed. You can type quit now if you wish to quit. Type in m to view the instruction manual. ");
        while (true) {
            String input = keyboard.nextLine();
            if (input.equals("quit") || (input.equals("Quit")) || (input.equals("qUiz")) || (input.equals("QUit")) || (input.equals("QUIt")) || (input.equals("QUIT")) || (input.equals("qUIt")) || (input.equals("qUIT")) || (input.equals("QuiT")) || (input.equals("QuIT")) || (input.equals("QuIt")) || input.equals("q")) {
                break;
            }

            //logic: calculate input
            if (input.contains("+") || input.contains("T")) {
                int index = input.indexOf("+");
                if (index == -1) {
                    index = input.indexOf("T");
                }

                String num1 = input.substring(0, index);
                String num2 = input.substring(index + 1, input.length());
                double addition = Double.parseDouble(num1) + Double.parseDouble(num2);
                System.out.println(addition);

            } else if (input.contains("-") || input.contains("_")) {
                int index = input.indexOf("-");
                if (index == -1) {
                    index = input.indexOf("_");
                }

                String num1 = input.substring(0, index);
                String num2 = input.substring(index + 1, input.length());
                double subtraction = Double.parseDouble(num1) - Double.parseDouble(num2);
                System.out.println(subtraction);

            } else if (input.contains("*") || input.contains("x") || input.contains("X")) {
                int index = input.indexOf("*");
                if (index == -1) {
                    index = input.indexOf("x");
                }
                if (index == -1) {
                    index = input.indexOf("X");
                }
                String num1 = input.substring(0, index);
                String num2 = input.substring(index + 1, input.length());
                double multiplication = Double.parseDouble(num1) * Double.parseDouble(num2);
                System.out.println(multiplication);

            } else if (input.contains("/") || input.contains("÷")) {
                int index = input.indexOf("/");
                if (index == -1) {
                    index = input.indexOf("÷");
                }

                String num1 = input.substring(0, index);
                String num2 = input.substring(index + 1, input.length());
                double division = Double.parseDouble(num1) / Double.parseDouble(num2);
                System.out.println(division);

            } else if (input.contains("z") || input.contains("sqrt")) {
                int index = input.indexOf("z");
                if (index == -1) {
                    index = input.indexOf("t");
                }

                String num2 = input.substring(index + 1, input.length());
                double squareroot = Double.parseDouble(num2);
                double sqrt = Math.sqrt(squareroot);
                System.out.println(sqrt);

            } else if (input.contains("^") || input.contains("power")) {
                int index = input.indexOf("^");
                if (index == -1) {
                    index = input.indexOf("r");
                    String num1 = input.substring(0, index - 4);
                    String num2 = input.substring(index + 1, input.length());
                    double powr = Math.pow(Double.parseDouble(num1), Double.parseDouble(num2));
                    System.out.println(powr);
                } else {
                    String num1 = input.substring(0, index);
                    String num2 = input.substring(index + 1, input.length());
                    double powr = Math.pow(Double.parseDouble(num1), Double.parseDouble(num2));
                    System.out.println(powr);
                }
            } else if (input.contains("a") || input.contains("avg")) {
                double sum = 0;
                int numbers = 0;
                input = keyboard.nextLine();
                while (!input.contains("d")) {

                    double d = Double.parseDouble(input);
                    sum += d;
                    numbers++;
                    input = keyboard.nextLine();
                }
                System.out.println(sum / numbers);
            } else if (input.contains("m") || input.contains("M")) {
                System.out.println("Welcome to the instructions for the calculator app.");
                System.out.println("To add numbers together, type them like this: '5+5' or '5T5'");
                System.out.println("To subtract numbers,  type them like this: '5-5' or '5-5'");
                System.out.println("To multiply numbers together, type them like this: '5*5', '5x5' or '5X5'");
                System.out.println("To divide numbers, type them like this: '5/5', '5x5' or '5÷5'");
                System.out.println("To get the squareroot of a number, type  'z' or 'sqrt' before the number. Example:, 'z49'");
                System.out.println("To raise a number to a power, type  '^' or 'power' between the numbers. Example:, '22^2'");
                System.out.println("To get an average, type 'a' or 'avg' then press enter. Type each number one at a time and press enter after you type it. Once you input all of the desired numbers to be averaged type in 'd'");

            } else {
                System.out.println("Sorry, the format is not supported.");
            }

        }

    }
}
