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
public class NhanVien extends TaiKhoan {

    private int id;
    private String maNV, hoTen, SDT;

    public NhanVien(String maNV, String hoTen, String SDT, int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(id, taiKhoan, matKhau, email, vaiTro);
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.SDT = SDT;
    }

    public NhanVien(int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(id, taiKhoan, matKhau, email, vaiTro);
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String SDT) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.SDT = SDT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

}
