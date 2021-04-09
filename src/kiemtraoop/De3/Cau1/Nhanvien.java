/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtraoop.De3.Cau1;

/**
 *
 * @author vnncv
 */
public class Nhanvien extends Person{
    private String Phongban;
    private int hsl, thamnien, luongcoban, luongthuclinh;

    public Nhanvien(String Phongban, int hsl, int thamnien, int luongcoban, String name, String dob, String address, String gender) {
        super(name, dob, address, gender);
        this.Phongban = Phongban;
        this.hsl = hsl;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
        luongthuclinh = luongcoban * hsl*(1+thamnien/100);
    }
    
    public void Show(){
        super.Show();
        System.out.println("Phong ban: " + Phongban);
        System.out.println("He so luong: " + hsl);
        System.out.println("Tham nien: " + thamnien);
        System.out.println("Luong co ban: " + luongcoban);
        System.out.println("Luong thuc linh: " + luongthuclinh);
        System.out.println("----------------------------------------------");
    }
    
    public String toString(){
        return super.toString() + "|" + Phongban + "|" + hsl + "|" + thamnien + "|" + luongcoban + "|" + luongthuclinh +"\n";
    }
    
}
