import java.sql.*;

public class sample {
    public static void main(String[] args) {
        // JDBC driver and database URL
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";

        // Database credentials
        String USER = "username";
        String PASS = "password";

        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a table
            stmt = conn.createStatement();
            String createTableSql = "CREATE TABLE Students (id INT PRIMARY KEY, name VARCHAR(255), age INT, grade VARCHAR(255))";
            stmt.executeUpdate(createTableSql);
            System.out.println("Table created successfully.");

            // Insert data
            String insertDataSql = "INSERT INTO Students (id, name, age, grade) VALUES (1, 'John Doe', 20, 'A'), (2, 'Jane Smith', 21, 'B'), (3, 'Mike Johnson', 19, 'C')";
            stmt.executeUpdate(insertDataSql);
            System.out.println("Data inserted successfully.");

            // Show data
            String showDataSql = "SELECT * FROM Students";
            ResultSet rs = stmt.executeQuery(showDataSql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
            }
            rs.close();

            // Delete a record
            String deleteRecordSql = "DELETE FROM Students WHERE id = 1";
            stmt.executeUpdate(deleteRecordSql);
            System.out.println("Record deleted successfully.");

            // Update a record
            String updateRecordSql = "UPDATE Students SET grade = 'A+' WHERE id = 2";
            stmt.executeUpdate(updateRecordSql);
            System.out.println("Record updated successfully.");

            // Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
