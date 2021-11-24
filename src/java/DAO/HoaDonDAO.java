package DAO;

import java.util.ArrayList;
import model.HoaDon;

/**
 *
 * @author TRUNG DONG
 */
public class HoaDonDAO extends DAO{
    public HoaDonDAO(){
        super();
    }
    public boolean ThemHoaDon(HoaDon hd){
        return true;
    }
    public HoaDon TimKiemHoaDon(int maHD){
        return null;
    }
    public ArrayList<HoaDon> getDSHoaDon(){
        return null;
    }
    public HoaDon getHoaDon(int maHD){
        return null;
    }
    public boolean setHoaDon(HoaDon hd){
        return true;
    }
}
