/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphing.formulas;


public class GraphingFormulas {

    
    public static void main(String[] args) {
	
		//this part will test the functions
		System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has slope " + slope(2,8,4,-4) );
                
		System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has distance " + distance(2,8,4,-4) );
                
                System.out.println(" (0,-3) to (-1,-7) has formula " + formula(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has formula " + formula(2,8,4,-4) );
 
	}
 
    
        public static double slope( int x1, int y1, int x2, int y2 )
	{ 
            int yresult = (y2 - y1);
            int xresult = (x2-x1);
            double sloperesult= yresult / xresult;
         
            // put your code here and change the return value below
            return sloperesult;
	}
        
	public static double distance( double dx1, double dy1, double dx2, double dy2 )
	{ 
            double xresult1 = (dx2-dx1);
            double yresult1 = (dy2-dy1);
            double xresult2 = Math.pow(xresult1,2);
            double yresult2 = Math.pow(yresult1,2);
            double xandyResult1 = (xresult2 + yresult2);
            double xandyResult2 = Math.sqrt(xandyResult1);
            // put your code here and change the return value below
            return xandyResult2;
            
           
	}
            
         
}