import java.sql.*;

public class UpdateWork {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String pwd = "Romankun@l12";

    public static void main(String[] args) {
        // Load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Connect to the database
        try {
            Connection connection = DriverManager.getConnection(url, username, pwd);
            Statement st = connection.createStatement();

            // Correct update query with proper format specifiers
            String query = String.format("UPDATE students SET age = %d WHERE id = %d", 29, 2);
            int rowsAffected = st.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Data updated successfully");
            } else {
                System.out.println("Data not updated");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
