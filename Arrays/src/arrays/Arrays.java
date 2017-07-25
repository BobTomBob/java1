/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Education Unlimited
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[10];

        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;
        array1[4] = 9;
        array1[5] = 11;
        array1[6] = 13;
        array1[7] = 15;
        array1[8] = 17;
        array1[9] = 19;

        System.out.println("The Element at index " + 0 + " is " + array1[0]);
        System.out.println("The Element at index " + 1 + " is " + +array1[1]);
        System.out.println("The Element at index " + 2 + " is " + +array1[2]);
        System.out.println("The Element at index " + 3 + " is " + +array1[3]);
        System.out.println("The Element at index " + 4 + " is " + +array1[4]);
        System.out.println("The Element at index " + 5 + " is " + +array1[5]);
        System.out.println("The Element at index " + 6 + " is " + +array1[6]);
        System.out.println("The Element at index " + 7 + " is " + +array1[7]);
        System.out.println("The Element at index " + 8 + " is " + +array1[8]);
        System.out.println("The Element at index " + 9 + " is " + +array1[9]);

        double[] array2 = new double[10];
        int index = 0;
        while (index < 10) {
            array2[index] = (index * 1.25);
            System.out.println("The element at index " + index + " is " + array2[index] + ", ");

            index++;

        }
        System.out.println("That's all folks! (At least for this part)");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int[] array3 = new int[1000];
        int indexr = 0;
        while (indexr < 1000) {
            array3[indexr] = indexr;
            int randomnumber = (int) (Math.random() * 999 + 1);
            System.out.print(" " + randomnumber);
            indexr++;
            
            }
        }
    }

    }
