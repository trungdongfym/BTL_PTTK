package DAO;

import java.util.ArrayList;
import model.SanPham;

/**
 *
 * @author TRUNG DONG
 */
public class SanPhamDAO extends DAO{
    public SanPhamDAO(){
        super();
    }
    public ArrayList<SanPham> getDSSanPham(String tenDanhMuc){
        return new java.util.ArrayList<>();
    }
    public SanPham TimKiemSanPham(String tenSP){
        return new model.SanPham();
    }
    public SanPham getSanPham(int id){
        return new model.SanPham();
    }
    public boolean xoaSanPham(int id){
        return true;
    }
    public boolean setSanPham(SanPham x){
        return true;
    }
}
