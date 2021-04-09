/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtraoop.De6.Cau1;

/**
 *
 * @author ncv
 */
public class Word {

    private String EN, VN;
    private int ID;

    public Word(int ID, String EN, String VN) {
        this.ID = ID;
        this.EN = EN;
        this.VN = VN;
    }

    public String getEN() {
        return EN;
    }

    public String getVN() {
        return VN;
    }

    public void setVN(String VN) {
        this.VN = VN;
    }

    public String toString() {
        return ID + "$" + EN + "$" + VN + "\n";
    }
}
