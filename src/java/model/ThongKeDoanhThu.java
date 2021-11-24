package model;

import java.sql.Date;

/**
 *
 * @author TRUNG DONG
 */
public class ThongKeDoanhThu extends HoaDon{
    private float doanhthu;
    private String giaidoan;

    public ThongKeDoanhThu() {
    }

    public ThongKeDoanhThu(int id,float doanhthu, String giaidoan,  
            String ghiChu, Date ngayThanhToan, DonHang donHang, NhanVien nvBanHang, NhanVien nvGiaoHang) {
        super(id, ghiChu, ngayThanhToan, donHang, nvBanHang, nvGiaoHang);
        this.doanhthu = doanhthu;
        this.giaidoan = giaidoan;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }

    public String getGiaidoan() {
        return giaidoan;
    }

    public void setGiaidoan(String giaidoan) {
        this.giaidoan = giaidoan;
    }
    
}
