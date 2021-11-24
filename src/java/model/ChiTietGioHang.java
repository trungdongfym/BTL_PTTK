/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class ChiTietGioHang {
    private int id, soLuong;
    private Date ngayThem;
    private float tongPhu;
    private SanPham sanPham;

    public ChiTietGioHang() {
    }

    public ChiTietGioHang(int id, int soLuong, Date ngayThem, float tongPhu, SanPham sanPham) {
        this.id = id;
        this.soLuong = soLuong;
        this.ngayThem = ngayThem;
        this.tongPhu = tongPhu;
        this.sanPham = sanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayThem() {
        return ngayThem;
    }

    public void setNgayThem(Date ngayThem) {
        this.ngayThem = ngayThem;
    }

    public float getTongPhu() {
        return tongPhu;
    }

    public void setTongPhu(float tongPhu) {
        this.tongPhu = tongPhu;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    } 
}
