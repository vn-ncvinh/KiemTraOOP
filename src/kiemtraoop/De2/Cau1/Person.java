/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtraoop.De2.Cau1;

/**
 *
 * @author vnncv
 */
public class Person {
    private String name, dob, address, gender;
    
    public Person(){
        
    }
    
    public Person(String name, String dob, String address, String gender) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }
    
    public void Show(){
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
    }
    
    public String toString(){
        return name + "|" + dob + "|" + address + "|" + gender;
    }
    
}
