/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class KieuThanhToan {
    private int id ;
    private String moTa, ghiChu, hd;

    public KieuThanhToan() {
    }

    public KieuThanhToan(int id, String moTa, String ghiChu, String hd) {
        this.id = id;
        this.moTa = moTa;
        this.ghiChu = ghiChu;
        this.hd = hd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }
    
    
    
}
