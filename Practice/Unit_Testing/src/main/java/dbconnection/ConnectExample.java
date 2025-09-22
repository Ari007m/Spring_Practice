package dbconnection;

import java.sql.*;

public class ConnectExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/school";
        String user = "ari";
        String pass = "Ari@007M";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) { /* Connection interface is implemented
        in DriverManager class for connection
        */
            System.out.println("✅ Connected to PostgreSQL");
        } catch (SQLException e) {
            System.out.println("❌ Connection failed");
            e.printStackTrace();
        }
    }
}
