package ch16_network.open.api;


import ch14_jdbc_jsp.jdbc.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

public class MedicineService {

    private MedicineService() {

    }

    private static MedicineService instance = new MedicineService();

    public static MedicineService getInstance(){
        return instance;
    }

    private static ConnectionPool cp = ConnectionPool.getInstance();
    private static MedicineDAO dao = MedicineDAO.getInstance();

    public static void insertMedicine(MedicineDTO medicine) {
        Connection conn = cp.getConnection();

        try {
            dao.insertMedicine(conn, medicine);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            cp.releaseConnection(conn);
        }

    }

}
