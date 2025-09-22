package dbconnection;

import java.sql.*;

public class InsertStatement {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/school";
        String user = "ari";
        String pass = "Ari@007M";

        String sql = "INSERT INTO courses (course_id,course_name) VALUES(? , ?) ";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = conn.prepareStatement(sql)){ // preparedStatement is interface which inherits Statement class to insert a data

            stmt.setInt(1,103);
            stmt.setString(2,"History");

            int rows = stmt.executeUpdate();
            System.out.println("Inserted: " + rows + " row(s)");
        }

        System.out.println("✅ Connected to PostgreSQL");
    }
}

