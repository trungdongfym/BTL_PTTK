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
public class KhachHang extends TaiKhoan{
    private int id;
    private String hoTen, SDT, diaChi;

    public KhachHang(int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(id, taiKhoan, matKhau, email, vaiTro);
    }

    public KhachHang(int id, String hoTen, String SDT, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.diaChi = diaChi;
    }
    
    public KhachHang(String hoTen, String SDT, String diaChi, int id, String taiKhoan, 
            String matKhau, String email, String vaiTro) {
        super(id, taiKhoan, matKhau, email, vaiTro);
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.diaChi = diaChi;
    }

    public KhachHang() {
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
