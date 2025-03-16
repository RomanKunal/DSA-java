import java.sql.*;
public class PreparedStUseCase {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String pwd = "Romankun@l12";

    public static void main(String[] args) {
        // Loading the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Connect the database
        try {
            Connection connection = DriverManager.getConnection(url, username, pwd);
            //Statement statement = connection.createStatement();

            // Write insert query with correct format specifier for double
//            String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %o, %.2f)", "AP", 20, 99.0);
//            int rowsAffected = statement.executeUpdate(query);

            // prepared statement usecase
            String query="INSERT INTO students (name,age,marks) VALUES(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"AP");
            preparedStatement.setInt(2,22);
            preparedStatement.setDouble(3,88);
            int rowsAffected=preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data changed");
            } else {
                System.out.println("Data does not change");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
