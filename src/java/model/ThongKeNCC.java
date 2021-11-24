package model;

/**
 *
 * @author TRUNG DONG
 */
public class ThongKeNCC extends NhaCungCap{
   private int soluong;
   private int doanhthu;

    public ThongKeNCC(int id, String maNCC, String tenNCC, String diaChi, String SDT) {
        super(id, maNCC, tenNCC, diaChi, SDT);
    }

    public ThongKeNCC() {
    }

    public ThongKeNCC(int soluong, int doanhthu) {
        this.soluong = soluong;
        this.doanhthu = doanhthu;
    }

    public ThongKeNCC(int soluong, int doanhthu, int id, String maNCC, 
            String tenNCC, String diaChi, String SDT) {
        super(id, maNCC, tenNCC, diaChi, SDT);
        this.soluong = soluong;
        this.doanhthu = doanhthu;
    }
    
    public float thongKeTheoDoanhThu(){
        return HoaDon.xuatHoaDon().getTongTien();
    }
    
    public int thongKeTheoLuongHangNhap(){
        return DonNhap.getSLHangNhap();        
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(int doanhthu) {
        this.doanhthu = doanhthu;
    }
   
   
}
