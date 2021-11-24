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
public class SanPham {

    private int id;
    private String maSp, tenSP, loai;
    private float giaThuong, giaKM;
    private DanhMuc danhMuc;
    private NhaCungCap nhaCungCap;

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public SanPham(int id, String maSp, String tenSP, String loai, 
            float giaThuong, float giaKM, DanhMuc danhMuc, NhaCungCap nhaCungCap) {
        this.id = id;
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.loai = loai;
        this.giaThuong = giaThuong;
        this.giaKM = giaKM;
        this.danhMuc = danhMuc;
        this.nhaCungCap = nhaCungCap;
    }

    public SanPham() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public float getGiaThuong() {
        return giaThuong;
    }

    public void setGiaThuong(float giaThuong) {
        this.giaThuong = giaThuong;
    }

    public float getGiaKM() {
        return giaKM;
    }

    public void setGiaKM(float giaKM) {
        this.giaKM = giaKM;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

}
