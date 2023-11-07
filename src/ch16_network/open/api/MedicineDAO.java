package ch16_network.open.api;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicineDAO {
    private MedicineDAO() {

    }

    private static MedicineDAO instance = new MedicineDAO();

    public static MedicineDAO getInstance() {
        return  instance;
    }

    public int insertMedicine(Connection conn, MedicineDTO medicines) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("INSERT INTO          ");
        query.append("    medicines (      ");
        query.append("        entpName     ");
        query.append("      , itemName     ");
        query.append("      , efcyQesitm   ");
        query.append("    ) VALUES (       ");
        query.append("        ?            ");
        query.append("      , ?            ");
        query.append("      , ?            ");
        query.append("    )                ");

        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;
        ps.setString(idx++, medicines.getEntpName());
        ps.setString(idx++, medicines.getItemName());
        ps.setString(idx++, medicines.getEfcyQesitm());

        int result = ps.executeUpdate();
        ps.close();

        return result;
    }

    public MedicineDTO getMedicine(Connection conn, String test) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("SELECT                      ");
        query.append("  itemName                  ");
        query.append("FROM                        ");
        query.append("  medicines                 ");
        query.append("WHERE 1=1                   ");
        query.append("  AND efcyQesitm LIKE ?     ");

        PreparedStatement ps = conn.prepareStatement(query.toString());

        ps.setString(1, "%" + "%");

        ResultSet rs = ps.executeQuery();

        MedicineDTO medicine = new MedicineDTO();

        if (rs.next()) {
            medicine.setItemName(rs.getString("itemName"));
        }

        rs.close();
        ps.close();

        return medicine;
    }
}
