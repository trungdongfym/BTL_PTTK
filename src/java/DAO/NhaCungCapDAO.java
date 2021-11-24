package DAO;

import java.util.ArrayList;
import model.NhaCungCap;

/**
 *
 * @author Admin
 */
public class NhaCungCapDAO extends DAO {

    public NhaCungCapDAO() {
        super();
    }

    public NhaCungCap searchNCC(NhaCungCap nhaCungCap) {
        return new NhaCungCap();
    }

    public NhaCungCap getNCC(int ID) {
        return new NhaCungCap();
    }

    public ArrayList<NhaCungCap> getDSNhaCungCap(NhaCungCap nhaCungCap) {
        return new ArrayList<>();
    }

    public boolean setNCC(NhaCungCap nhaCungCap) {
        return true;
    }

    public boolean deleteNCC(NhaCungCap nhaCungCap) {
        return true;
    }

    public boolean addNCC(NhaCungCap nhaCungCap) {
        return true;
    }

}
