import java.sql.*;
import java.util.Scanner;
public class BatchProcessing {
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
            Statement statement = connection.createStatement();
//            Statement statement = connection.createStatement();
//
//            // Write insert query with correct format specifier for double
//            String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %o, %.2f)", "AP", 20, 99.0);
//            int rowsAffected = statement.executeUpdate(query);
            Scanner sc=new Scanner(System.in);
            while(true) {
                System.out.println("Enter name : ");
                String name = sc.next();
                System.out.println("Enter age :  ");
                int age = sc.nextInt();
                System.out.println("Enter marks : ");
                double marks = sc.nextDouble();
                System.out.println("Do you want to add more data(y/n): ");
                String choice = sc.next();
                String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %.2f)", name, age, marks);
                statement.addBatch(query);
                if (choice.toUpperCase().equals("N")) {
                    break;
                }
            }
            int [] rowsAffected=statement.executeBatch();
            for (int i = 0; i <rowsAffected.length ; i++) {
                if(rowsAffected[i]==0){
                    System.out.println("Data "+ i + "not executed");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
