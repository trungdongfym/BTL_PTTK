package DAO;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;

/**
 *
 * @author TRUNG DONG
 */
public class DAO {

    public static Connection conn;
    public DAO() {
        if (conn == null) {
            String server="LAPTOP-VER739D1";
            String user="sa";
            String pass="101100";
            String dbName="CNPM";
            SQLServerDataSource ds=new SQLServerDataSource();
            ds.setUser(user);
            ds.setPassword(pass);
            ds.setDatabaseName(dbName);
            ds.setServerName(server);
            try {
                conn=ds.getConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
