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
public class SanPhamNhap {
    private int id, soLuong;
    private float donGia, tongPhu;
    private SanPham sanPham;

    public SanPhamNhap() {
    }

    public SanPhamNhap(int id, int soLuong, float donGia, float tongPhu, SanPham sanPham) {
        this.id = id;
        this.soLuong = soLuong;
        this.donGia = donGia;
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

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
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
