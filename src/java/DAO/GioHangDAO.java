package DAO;

import model.GioHang;
import model.KhachHang;

/**
 *
 * @author TRUNG DONG
 */
public class GioHangDAO extends DAO{
    public GioHangDAO(){
        super();
    }
    public GioHang getGioHang(KhachHang kh){
        return new GioHang();
    }
}
