/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtraoop.De1.Cau1;

/**
 *
 * @author ncv
 */
public class Student extends Person{
    private String ID, email;
    private int Final_Mark;
    
    public Student(){
        super();
    }
    
    public Student(String ID, String email, int Final_Mark, String name, String dob, String address, String gender) {
        super(name, dob, address, gender);
        this.ID = ID;
        this.email = email;
        this.Final_Mark = Final_Mark;
    }
    
    public void ShowRow(){
        System.out.println("ID: " + ID);
        super.ShowRow();
        System.out.println("Email: " + email);
        System.out.println("Final Mark: " + Final_Mark + "\n----------------------------------------");
    }
    
    public void ShowColumn(){
        System.out.print(ID + "\t");
        super.ShowColumn();
        System.out.println(email + "\t" + Final_Mark);
    }
    
    public String toString(){
        return ID + "|" + super.toString() + "|" + email + "|" + Final_Mark +"\n";
    }
    
}
