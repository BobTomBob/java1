/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
package booleans;

public class Booleans {

   
    public static void main(String[] args) {
       String s1 = "Good Morning";
       String s2 = "Hi there!";
       String s3 = "Howdy, partner!";
               //< means less than <= less than or equal to and so on with > => 
               
       System.out.println ("True or false? Is Good Morning equal to Hi there!");
       System.out.println (s1.equals(s2));
       System.out.println ("True or false? Is Good Morning equal to Good Morning?");
             System.out.println (s1.equals(s1));       
             System.out.println ("True or false? Is Howdy, partnwer! equal to Hi there!");
                     System.out.println (s1.equals(s3));
        int x,y;
        boolean a,b,c,d,e,f;
        boolean b1 = true;
        boolean b2 = false;
               
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
    }
    
}
