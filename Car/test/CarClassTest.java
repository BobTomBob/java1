/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlimited
 */
public class CarClassTest {
    
        String make1 = "Chevrolet";
        String model1 = "Suburban";
        int year1 = 2003;
        String nickName1 = "IDK what it's nickname is";
        String Color1 = "Black";
        int YearsOwned1 = 10;
        double Miles1 = 148282;

        Car car1 = new Car(make1, model1, year1, nickName1, Color1, YearsOwned1, Miles1);
        
        @Test
       public void makeGetterTest() {
                assertEquals(car1.getMake(), "Chevrolet");
                
        
        
    }
      @Test
       public void modelGetterTest() {
                assertEquals(car1.getModel(), "Suburban");
}
          @Test
       public void yearGetterTest() {
                assertEquals(car1.getYear(), 2003);
}
         @Test
       public void nicknameGetterTest() {
                assertEquals(car1.getNickName(), "IDK what it's nickname is");
}
}