package ch16_network.open_api;


import ch14_jdbc_jsp.jdbc.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicineService {

    private MedicineService() {
    }

    private static MedicineService instance = new MedicineService();

    public static MedicineService getInstance(){
        return instance;
    }

    private static ConnectionPool cp = ConnectionPool.getInstance();
    private static MedicineDAO dao = MedicineDAO.getInstance();

    public static void insertMedicine(OpenAPI.MedicineDTO medicine) {
        Connection conn = cp.getConnection();
        
        
        try {
            dao.insertMedicine(conn, medicine);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            cp.releaseConnection(conn);
        }

    }

    public ArrayList<OpenAPI.MedicineDTO> searchMedicine(String keyword) {
        Connection conn = cp.getConnection();
        ArrayList<OpenAPI.MedicineDTO> result = new ArrayList<>();

        try {
            dao.searchMedicine(conn, keyword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            cp.releaseConnection(conn);
        }
        return result;
    }

}
