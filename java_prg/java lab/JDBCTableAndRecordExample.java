import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTableAndRecordExample {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/your_database"; // Change the URL accordingly
        String user = "your_username";
        String password = "your_password";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS example_table (id INT PRIMARY KEY, name VARCHAR(255))";
            statement.executeUpdate(createTableSQL);

            // Insert a record into the table
            int id = 1;
            String name = "John Doe";

            String insertRecordSQL = "INSERT INTO example_table (id, name) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertRecordSQL)) {
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.executeUpdate();
            }

            System.out.println("Record inserted successfully!");

            // Close resources
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
