package DAO;

import java.util.ArrayList;
import model.DonHang;
import model.NhanVien;

/**
 *
 * @author TRUNG DONG
 */
public class DonHangDAO extends DAO{
    public DonHangDAO(){
        super();
    }
    public boolean ThemDonHang(DonHang dh){
        return true;
    }
    public DonHang getDonHang(int idDH){
        return new DonHang();
    }
    public DonHang TimKiemDonHang(int maDH){
        return null;
    }
    public ArrayList<DonHang> getDSDonHang(){
        return null;
    }
    public boolean XacNhanDonHang(DonHang dh){
        return true;
    }
    public boolean setDonHang(DonHang dh){
        return true; 
    }
    public ArrayList<DonHang> getDSDonHang(NhanVien nvgh){
        return null;
    }
    public ArrayList<DonHang> getDSDonHangDaGiao(NhanVien nvgh){
        return null;
    }
}
