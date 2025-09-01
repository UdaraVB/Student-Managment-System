import java.sql.*;

public class createTable {
    public static void main (String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","root");
             Statement stmt = con.createStatement()){

            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50)," +
                    "age INT," +
                    "email VARCHAR(100)," +
                    "course VARCHAR(50)," +
                    "gpa DECIMAL(3,2))";

            stmt.executeUpdate(sql);
            System.out.println("Table created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
