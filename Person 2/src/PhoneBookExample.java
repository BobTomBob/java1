
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
public class PhoneBookExample {
    
    public static void main(String[] args){
    Person2 p1 = new Person2("Smith", "John", "518-745-8221"); 
    Person2 p2 = new Person2("Jamison", "Judith", "785-584-8903"); 
    Person2 p3 = new Person2("Steele", "Joseph", "956896"); 
    Person2 p4 = new Person2("Worthington", "Alicia", "775-251-3180"); 
    Person2 p5 = new Person2("Moore", "Vivian", "803-618-4581"); 
    Person2 p6 = new Person2("Faria", "Brenda", "404-656-2283"); 
    Person2 p7 = new Person2("Hernandez", "John", "740-386-1598"); 
    Person2 p8 = new Person2("Rittenhouse", "Cheryl", "541-942-3978"); 
    Person2 p9 = new Person2("Wright", "Stella", "910-294-5916"); 
    Person2 p10 = new Person2("Blankenship", "Shirley", "540-878-0348"); 
 
    Phonebook PB = new Phonebook();
    
    PB.addPerson(p1);
    PB.addPerson(p2);
    PB.addPerson(p3);
    PB.addPerson(p4);
    PB.addPerson(p5);
    PB.addPerson(p6);
    PB.addPerson(p7);
    PB.addPerson(p8);
    PB.addPerson(p9);
    PB.addPerson(p10);
    
    PB.printEntries();
    
}
}