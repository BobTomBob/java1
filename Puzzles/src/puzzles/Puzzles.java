/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Puzzles {

    public static void main(String[] args) {
        String FILENAME = "puzzle.txt";
	try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            int thing = 1;

            while (currentLine != null) {
                if (thing%3==0){
                
		System.out.println(currentLine);
               
            }
                thing++;
                 currentLine = reader.readLine();
            }

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}