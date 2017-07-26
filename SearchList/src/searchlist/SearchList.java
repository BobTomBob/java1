/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class SearchList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(18);
        a1.add(2);
        a1.add(37);
        a1.add(49);
        a1.add(24);
        a1.add(11);
        a1.add(5);
        a1.add(33);
        a1.add(22);
        a1.add(44);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please search for a number. To do so, type a number in between 0-50 and press enter.");
        int userSearch = Integer.parseInt(keyboard.nextLine());
        if (a1.contains(userSearch)){
        
            System.out.println("The number you searched for was found in the ArrayList.");
        }
        if (!a1.contains(userSearch)){
        {
            System.out.println("The number you searched for was not found in the ArrayList.");

        }
        int maxnumber = 0;
        for (int a : a1) {
            if (a > maxnumber) {
                maxnumber = a;
            }
        }
        System.out.println("\n\nThe highest number is: " + maxnumber);
        
        ArrayList<String> a2 = new ArrayList();
        a2.add("A");
        a2.add(" bunch");
        a2.add(" of");
        a2.add(" revolutionary");
        a2.add(" mansumission");
        a2.add(" abolishionists,");
        a2.add(" give");
        a2.add(" me");
        a2.add(" your");
        a2.add(" position");
        a2.add(" show");
        a2.add(" me");
        a2.add(" where");
        a2.add(" the");
        a2.add(" ammunition");
        a2.add(" is!");
      
        ArrayList sorted = new ArrayList();
        int alphaSort = 0;
        for (int b : a2) {
            if (b > alphaSort) {
                alphaSort = b;
            }
    }
}
    
}