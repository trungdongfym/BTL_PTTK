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
public class UuDaiDaDung {
    private int id;
    private Date ngaySuDung;
    private float tienGiam;
    private MaUuDai maUuDai ;

    public UuDaiDaDung() {
    }

    public UuDaiDaDung(int id, Date ngaySuDung, float tienGiam, MaUuDai maUuDai) {
        this.id = id;
        this.ngaySuDung = ngaySuDung;
        this.tienGiam = tienGiam;
        this.maUuDai = maUuDai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgaySuDung() {
        return ngaySuDung;
    }

    public void setNgaySuDung(Date ngaySuDung) {
        this.ngaySuDung = ngaySuDung;
    }

    public float getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(float tienGiam) {
        this.tienGiam = tienGiam;
    }

    public MaUuDai getMaUuDai() {
        return maUuDai;
    }

    public void setMaUuDai(MaUuDai maUuDai) {
        this.maUuDai = maUuDai;
    }
    
    
}
