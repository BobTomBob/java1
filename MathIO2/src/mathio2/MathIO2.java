/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathio2;
import java.io.*;
public class MathIO2 {

   
    public static void main(String[] args) {
        
        
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
           double n1 = 4;
           double n2 = 2;
           double n3 = 6;
           double n4 = 10;
           double n5 = 24;
        

            //here is where you should write your numbers to the file
            writer.write(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5);
            System.out.println("Done: \n");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
double sum = 0;
            while (currentLine != null) {
                double n1 = Double.parseDouble(currentLine);
		System.out.println(currentLine);
                currentLine = reader.readLine();
                sum+=n1;
            }
            System.out.println("\n\nThe sum is:\n" + sum);

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}