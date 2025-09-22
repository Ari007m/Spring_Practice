package practice.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/school";
        String user = "ari";
        String pass = "Ari@007M";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("✅ Connected to PostgreSQL");
        } catch (SQLException e) {
            System.out.println("❌ Connection failed");
            e.printStackTrace();
        }
    }
}
