/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class MaUuDai {
    private int id, mucUuDai, gioiHanSuDung;
    private String ma,loaiUuDai,moTa;
    private Date hanSuDung;

    public MaUuDai(int id, int mucUuDai, int gioiHanSuDung, String ma, String loaiUuDai, 
            String moTa, Date hanSuDung) {
        this.id = id;
        this.mucUuDai = mucUuDai;
        this.gioiHanSuDung = gioiHanSuDung;
        this.ma = ma;
        this.loaiUuDai = loaiUuDai;
        this.moTa = moTa;
        this.hanSuDung = hanSuDung;
    }

    public MaUuDai() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMucUuDai() {
        return mucUuDai;
    }

    public void setMucUuDai(int mucUuDai) {
        this.mucUuDai = mucUuDai;
    }

    public int getGioiHanSuDung() {
        return gioiHanSuDung;
    }

    public void setGioiHanSuDung(int gioiHanSuDung) {
        this.gioiHanSuDung = gioiHanSuDung;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLoaiUuDai() {
        return loaiUuDai;
    }

    public void setLoaiUuDai(String loaiUuDai) {
        this.loaiUuDai = loaiUuDai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }
    
    
}
