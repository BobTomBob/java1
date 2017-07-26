
import person.pkg2.Person2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Education Unlimited
 */
public class Phonebook {
    Person2[] PBList;
    int size;
    
    public Phonebook() {
        size = 0;
        PBList = new Person2[100];
    }
            public void addPerson(Person2 p){
                PBList[size]=p;
                size++;
            }
            public void printEntries(){
                 for (int i = 0; i<size;i++){
            System.out.println(PBList[i].getLastName() + ", " + PBList[i].getFirstName() + " - Phone Number: s" + PBList[i].getPhoneNumber());
            
            }
                    
            }     
}

