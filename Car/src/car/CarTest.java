/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

public class CarTest {
   
    public static void main(String[] args) {
        String make1 = "Chevrolet";
        String model1 = "Suburban";
        int year1= 2003;
        String nickName1 = "IDK what it's nickname is";
        String Color1 = "Black";
        int YearsOwned1 = 10;
        double Miles1 = 148282;
        
        
                
        
       Car car1= new Car(make1, model1, year1, nickName1, Color1, YearsOwned1, Miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear() + ". It's nickname is" + car1.getNickName() + " and it has " + car1.getMiles());
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
          String make2 = "Chevrolet";
        String model2 = "Corvette ZR1";
        int year2= 2017;
        String nickName2 = "IDK what it's nickname is";
        String Color2 = "Black";
        int YearsOwned2 = 10;
        double Miles2 = 148282;
        
        
                
        
       Car car2= new Car(make2, model2, year2, nickName2, Color2, YearsOwned2, Miles2);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear() + ". It's nickname is" + car1.getNickName() + " and it has " + car1.getMiles());
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
       
    }
    
}