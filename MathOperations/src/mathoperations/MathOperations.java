/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u;
          double a,b,c,j;
          String first, second,third, together;
 //b=1, c=2, p=3, q=4, c=5, j=10, a=20
          p = 8;
          q = 25;
          t=9;
          a=20;
          b=1;
          c=2;
          p-=5;
          q+=-19;
          j++;
          c=5;
          
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
          System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "peanut butter ";
         second = "and ";
         third = "jelly.";
         together = first + second + third;
         System.out.println( together );
     }
}

    
    

