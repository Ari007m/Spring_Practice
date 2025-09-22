package dbconnection;

import java.sql.*;

public class SelectStetment {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/school";
        String user = "ari";
        String pass = "Ari@007M";

        String sql = "SELECT * FROM courses";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("course_id")
                        + ", Name: " + rs.getString("course_name"));
            }
        }

    }
}
