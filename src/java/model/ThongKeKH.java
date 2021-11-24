package model;

/**
 *
 * @author TRUNG DONG
 */
public class ThongKeKH extends KhachHang{
    private float doanhthu;

    public ThongKeKH() {
    }

    public ThongKeKH(float doanhthu, String hoTen, String SDT, String diaChi, 
            int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(hoTen, SDT, diaChi, id, taiKhoan, matKhau, email, vaiTro);
        this.doanhthu = doanhthu;
    }

    public ThongKeKH(float doanhthu, int id, String hoTen, String SDT, String diaChi) {
        super(id, hoTen, SDT, diaChi);
        this.doanhthu = doanhthu;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }
    
}
