package pkg;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get DB configuration from context
        String driver = getServletContext().getInitParameter("jdbcDriver");
        String url = getServletContext().getInitParameter("jdbcUrl");
        String username = getServletContext().getInitParameter("jdbcUsername");
        String password = getServletContext().getInitParameter("jdbcPassword");
        
        try {
            // 1. Load driver and establish connection
            Class.forName(driver);
            
            // 2. Create and execute query
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {
                
                // 3. Generate HTML response
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Employee Records</title>");
                out.println("<style>");
                out.println("body { font-family: Arial, sans-serif; margin: 20px; }");
                out.println("h1 { color: #2c3e50; }");
                out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
                out.println("th, td { border: 1px solid #ddd; padding: 12px; text-align: left; }");
                out.println("th { background-color: #4CAF50; color: white; }");
                out.println("tr:nth-child(even) { background-color: #f2f2f2; }");
                out.println("a { display: inline-block; padding: 6px 12px; margin-right: 5px; " +
                           "text-decoration: none; border-radius: 4px; }");
                out.println(".edit { background-color: #2196F3; color: white; }");
                out.println(".delete { background-color: #f44336; color: white; }");
                out.println(".add-btn { background-color: #4CAF50; color: white; padding: 10px 15px; " +
                           "text-decoration: none; border-radius: 4px; margin-bottom: 20px; display: inline-block; }");
                out.println("</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Employee Management System</h1>");
                out.println("<a href='insert.jsp' class='add-btn'>Add New Employee</a>");
                
                // 4. Check if there are results
                if (!rs.isBeforeFirst()) {
                    out.println("<p>No employee records found.</p>");
                } else {
                    out.println("<table>");
                    out.println("<tr><th>ID</th><th>Name</th><th>Age</th><th>Email</th><th>Phone</th><th>Department</th><th>Actions</th></tr>");
                    
                    // 5. Process results
                    while (rs.next()) {
                        out.println("<tr>");
                        out.println("<td>" + rs.getInt("employee_id") + "</td>");
                        out.println("<td>" + rs.getString("employee_name") + "</td>");
                        out.println("<td>" + rs.getInt("age") + "</td>");
                        out.println("<td>" + rs.getString("email") + "</td>");
                        out.println("<td>" + rs.getString("phone") + "</td>");
                        out.println("<td>" + rs.getString("dept") + "</td>");
                        out.println("<td>");
                        out.println("<a href='update.jsp?id=" + rs.getInt("employee_id") + "' class='edit'>Edit</a>");
                        out.println("<a href='DeleteServlet?id=" + rs.getInt("employee_id") + "' class='delete' " +
                                   "onclick='return confirm(\"Are you sure you want to delete this employee?\")'>Delete</a>");
                        out.println("</td>");
                        out.println("</tr>");
                    }
                    out.println("</table>");
                }
                
                out.println("</body>");
                out.println("</html>");
            }
        } catch (ClassNotFoundException e) {
            out.println("<h3 style='color:red'>Error: JDBC Driver not found</h3>");
            e.printStackTrace(out);
        } catch (SQLException e) {
            out.println("<h3 style='color:red'>Database Error: " + e.getMessage() + "</h3>");
            e.printStackTrace(out);
        }
    }
}