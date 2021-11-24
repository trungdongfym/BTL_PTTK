package model;

/**
 *
 * @author TRUNG DONG
 */
public class ThongKeSP extends SanPham{
    private float doanhthu;

    public ThongKeSP() {
    }

    public ThongKeSP(int id, String maSp, String tenSP, String loai, 
            float giaThuong, float giaKM, DanhMuc danhMuc, NhaCungCap nhaCungCap) {
        super(id, maSp, tenSP, loai, giaThuong, giaKM, danhMuc, nhaCungCap);
    }

    public ThongKeSP(int id,float doanhthu,  String maSp, String tenSP, String loai, 
            float giaThuong, float giaKM, DanhMuc danhMuc, NhaCungCap nhaCungCap) {
        super(id, maSp, tenSP, loai, giaThuong, giaKM, danhMuc, nhaCungCap);
        this.doanhthu = doanhthu;
    }

    public ThongKeSP(float doanhthu) {
        this.doanhthu = doanhthu;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }
    
    public float thongKeTheoDoanhThu(){
        return HoaDon.xuatHoaDon().getTongTien();
    }
    
}
