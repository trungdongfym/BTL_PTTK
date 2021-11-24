/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Kho {
    private int ID;
    private ArrayList<ChiTietKho> ctks;
    private String ghichu;
    
    public Kho() {
    }

    public Kho(int ID, ArrayList<ChiTietKho> ctks, String ghichu) {
        this.ID = ID;
        this.ctks = ctks;
        this.ghichu = ghichu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<ChiTietKho> getCtks() {
        return ctks;
    }

    public void setCtks(ArrayList<ChiTietKho> ctks) {
        this.ctks = ctks;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
}
