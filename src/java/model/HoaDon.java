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
public class HoaDon {

    private int id;
    private String ghiChu;
    private int tongTien;
    private Date ngayThanhToan;
    private DonHang donHang;
    private NhanVien nvBanHang;
    private NhanVien nvGiaoHang;

    public HoaDon() {
    }

    public HoaDon(int id, String ghiChu, Date ngayThanhToan, DonHang donHang, int tongTien,
            NhanVien nvBanHang, NhanVien nvGiaoHang) {
        this.id = id;
        this.ghiChu = ghiChu;
        this.ngayThanhToan = ngayThanhToan;
        this.donHang = donHang;
        this.nvBanHang = nvBanHang;
        this.nvGiaoHang = nvGiaoHang;
        this.tongTien=tongTien;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public NhanVien getNvBanHang() {
        return nvBanHang;
    }

    public void setNvBanHang(NhanVien nvBanHang) {
        this.nvBanHang = nvBanHang;
    }

    public NhanVien getNvGiaoHang() {
        return nvGiaoHang;
    }

    public void setNvGiaoHang(NhanVien nvGiaoHang) {
        this.nvGiaoHang = nvGiaoHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }

    public static HoaDon xuatHoaDon(){
        return new HoaDon();
    }
}
