/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.pkg2;

/**
 *
 * @author Education Unlimited
 */
public class Person2 {

        int age ;
        double height ;
        String firstName ;
        String lastName  ;
        boolean isAStudent ;
        String phoneNumber ;
        String email ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isIsAStudent() {
        return isAStudent;
    }

    public void setIsAStudent(boolean isAStudent) {
        this.isAStudent = isAStudent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
        
    
    public Person2(String fn, String ln, String pn) {
          String firstName=fn;
        String lastName=ln  ;
        String phoneNumber=pn ;
    }
    
}
