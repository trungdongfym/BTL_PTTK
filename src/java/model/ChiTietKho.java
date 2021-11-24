package model;

/**
 *
 * @author TRUNG DONG
 */
public class ChiTietKho {
    private int ID,soluong;
    private SanPham sanpham;
    private String ghichu;

    public ChiTietKho() {
    }

    public ChiTietKho(int ID, int soluong, SanPham sanpham, String ghichu) {
        this.ID = ID;
        this.soluong = soluong;
        this.sanpham = sanpham;
        this.ghichu = ghichu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public SanPham getSanpham() {
        return sanpham;
    }

    public void setSanpham(SanPham sanpham) {
        this.sanpham = sanpham;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }  
}
