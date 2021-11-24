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
public class DonHang {
    private int id;
    private String trangThai, ghiChu, tenNguoiNhan, sdtNguoiNhan, diaChiNhan;
    private KhachHang khachHang;
    private KieuThanhToan kieuThanhToan;
    private NhanVien nvBanHang;
    public DonHang() {
    }

    public DonHang(int id, String trangThai, String ghiChu, String tenNguoiNhan, 
            String sdtNguoiNhan, String diaChiNhan, KhachHang khachHang, 
            KieuThanhToan kieuThanhToan, NhanVien nvBanHang) {
        this.id = id;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.tenNguoiNhan = tenNguoiNhan;
        this.sdtNguoiNhan = sdtNguoiNhan;
        this.diaChiNhan = diaChiNhan;
        this.khachHang = khachHang;
        this.kieuThanhToan = kieuThanhToan;
        this.nvBanHang = nvBanHang;
    }

    public NhanVien getNvBanHang() {
        return nvBanHang;
    }

    public void setNvBanHang(NhanVien nvBanHang) {
        this.nvBanHang = nvBanHang;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getSdtNguoiNhan() {
        return sdtNguoiNhan;
    }

    public void setSdtNguoiNhan(String sdtNguoiNhan) {
        this.sdtNguoiNhan = sdtNguoiNhan;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public KieuThanhToan getKieuThanhToan() {
        return kieuThanhToan;
    }

    public void setKieuThanhToan(KieuThanhToan kieuThanhToan) {
        this.kieuThanhToan = kieuThanhToan;
    }    
    
}
