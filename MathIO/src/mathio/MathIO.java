/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathio;
import java.io.*;
public class MathIO {

   
    public static void main(String[] args) {
        
        
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "This document has no purpose or meaning. That's why you should keep reading.\n";
            String line2 = "Bananas are slightly radioactive because they contain an unstable form of pottasium: K31.\n";
            String line3 = "You'd have to eat around 10 million bananas to die from radiation poisoning.\n";
            String line4 = "Some extreme banana theorists claim that eating more than a dozen bananas per day\nwill result in you needing kidney dialysis because of all the potsiium your kidneys are processing.\n";
            String line5 = "I can't tell you whether this is bogus or true because this claim has just been \nshot out onto the internet without any scientific research/experiments on test animals.\n";
            String line6 = "Now that you've read through this pointless document do you have any thoughts?\n";
            String line7 = "How big is the universe you may be asking yourself (probably not). Well there's no definite answer because it gets larger every nano second.\n";
        

            //here is where you should write your numbers to the file
            writer.write(line1 + line2 + line3 + line4 + line5 + line6 + line7);
            System.out.println("Done writing file. New file text below:\n\n\n");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();

            while (currentLine != null) {
		System.out.println(currentLine);
                currentLine = reader.readLine();
            }

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}