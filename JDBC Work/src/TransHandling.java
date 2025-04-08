import java.sql.*;

public class TransHandling {
    private static final String url = "jdbc:mysql://localhost:3306/trans";
    private static final String username = "root";
    private static final String pwd = "Romankun@l12";

    public static void main(String[] args) {
        double transferAmount = 500;
        int fromAccount = 101;
        int toAccount = 102;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (Connection connection = DriverManager.getConnection(url, username, pwd)) {
            connection.setAutoCommit(false); // Start transaction

            // Step 1: Check balance of the sender's account
            String checkBalanceQuery = "SELECT balance FROM accounts WHERE account_number = ?";
            PreparedStatement checkStmt = connection.prepareStatement(checkBalanceQuery);
            checkStmt.setInt(1, fromAccount);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");

                // Step 2: Validate if debit is possible
                if (currentBalance >= transferAmount) {
                    // Step 3: Perform debit operation
                    String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
                    PreparedStatement debitStmt = connection.prepareStatement(debitQuery);
                    debitStmt.setDouble(1, transferAmount);
                    debitStmt.setInt(2, fromAccount);
                    int debitAffected = debitStmt.executeUpdate();

                    // Step 4: Perform credit operation
                    String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
                    PreparedStatement creditStmt = connection.prepareStatement(creditQuery);
                    creditStmt.setDouble(1, transferAmount);
                    creditStmt.setInt(2, toAccount);
                    int creditAffected = creditStmt.executeUpdate();

                    // Step 5: Commit transaction if both operations succeed
                    if (debitAffected > 0 && creditAffected > 0) {
                        connection.commit();
                        System.out.println("Transaction Successful: Amount " + transferAmount + " transferred from " + fromAccount + " to " + toAccount);
                    } else {
                        connection.rollback();
                        System.out.println("Transaction Failed: Rolling back");
                    }
                } else {
                    System.out.println("Insufficient Balance: Transaction cannot be processed.");
                }
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
