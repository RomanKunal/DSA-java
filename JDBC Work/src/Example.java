import java.sql.*;

public class Example {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String pwd = "Romankun@l12";

    public static void main(String[] args) {
        // Load MySQL Driver (optional for newer Java versions)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver Not Found: " + e.getMessage());
        }

        // Connect to Database
        try (Connection connection = DriverManager.getConnection(url, username, pwd);
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(query);

            // Process Results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
                System.out.println("----------------------");
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
