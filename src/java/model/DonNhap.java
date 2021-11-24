/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DonNhap {

    private int id;
    private Date ngayNhap;
    private String tenNguoiNhap, sdtNguoiNhap, ghiChu;
    private float tongtien;
    private static ArrayList<SanPhamNhap> dsSanPhamNhap;
    private NhanVien nhanVien;

    public DonNhap() {
    }

    public DonNhap(int id, Date ngayNhap, String tenNguoiNhap, String sdtNguoiNhap, 
            String ghiChu, float tongtien, ArrayList<SanPhamNhap> dsSanPhamNhap, NhanVien nhanVien) {
        this.id = id;
        this.ngayNhap = ngayNhap;
        this.tenNguoiNhap = tenNguoiNhap;
        this.sdtNguoiNhap = sdtNguoiNhap;
        this.ghiChu = ghiChu;
        this.tongtien = tongtien;
        this.dsSanPhamNhap = dsSanPhamNhap;
        this.nhanVien = nhanVien;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getTenNguoiNhap() {
        return tenNguoiNhap;
    }

    public void setTenNguoiNhap(String tenNguoiNhap) {
        this.tenNguoiNhap = tenNguoiNhap;
    }

    public String getSdtNguoiNhap() {
        return sdtNguoiNhap;
    }

    public void setSdtNguoiNhap(String sdtNguoiNhap) {
        this.sdtNguoiNhap = sdtNguoiNhap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public ArrayList<SanPhamNhap> getDsSanPhamNhap() {
        return dsSanPhamNhap;
    }

    public void setDsSanPhamNhap(ArrayList<SanPhamNhap> dsSanPhamNhap) {
        this.dsSanPhamNhap = dsSanPhamNhap;
    }

    public static int getSLHangNhap() {
        return dsSanPhamNhap.size();
    }
}
