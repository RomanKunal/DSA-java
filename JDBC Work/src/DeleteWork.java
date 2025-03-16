import java.sql.*;
public class DeleteWork {
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
            String query = String.format("DELETE FROM students WHERE id=2");
            int rowsAffected = st.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully");
            } else {
                System.out.println("Data not deleted");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
