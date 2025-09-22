package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/school";
        String user = "ari";
        String pass = "Ari@007M";

        String sql = "UPDATE courses SET course_name = ? WHERE course_id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(sql)) { // preparedStatement is interface which inherits Statement class to insert a data

            stmt.setString(1, "Geography");
            stmt.setInt(2, 103);

            int rows = stmt.executeUpdate();
            System.out.println("Updated: " + rows + " row(s)");
        }

    }
}
