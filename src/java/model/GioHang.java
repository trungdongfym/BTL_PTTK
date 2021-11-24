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
public class GioHang {
    private int id;
    private float tongTien;
    private ArrayList<UuDaiDaDung> dsUuDaiDaDung;
    private ArrayList<ChiTietGioHang> chiTietGioHang;

    public GioHang() {
    }

    public GioHang(int id, float tongTien, ArrayList<UuDaiDaDung> dsUuDaiDaDung, 
            ArrayList<ChiTietGioHang> chiTietGioHang) {
        this.id = id;
        this.tongTien = tongTien;
        this.dsUuDaiDaDung = dsUuDaiDaDung;
        this.chiTietGioHang = chiTietGioHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public ArrayList<UuDaiDaDung> getDsUuDaiDaDung() {
        return dsUuDaiDaDung;
    }

    public void setDsUuDaiDaDung(ArrayList<UuDaiDaDung> dsUuDaiDaDung) {
        this.dsUuDaiDaDung = dsUuDaiDaDung;
    }

    public ArrayList<ChiTietGioHang> getChiTietGioHang() {
        return chiTietGioHang;
    }

    public void setChiTietGioHang(ArrayList<ChiTietGioHang> chiTietGioHang) {
        this.chiTietGioHang = chiTietGioHang;
    }
    
    
}
