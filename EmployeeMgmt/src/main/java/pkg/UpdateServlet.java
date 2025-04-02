package pkg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        if (id != null && !id.isEmpty()) {
            try {
                // Get DB configuration
                String driver = getServletContext().getInitParameter("jdbcDriver");
                String url = getServletContext().getInitParameter("jdbcUrl");
                String username = getServletContext().getInitParameter("jdbcUsername");
                String password = getServletContext().getInitParameter("jdbcPassword");
                
                // Load driver and get employee data
                Class.forName(driver);
                try (Connection conn = DriverManager.getConnection(url, username, password);
                     PreparedStatement pstmt = conn.prepareStatement(
                         "SELECT * FROM employees WHERE employee_id = ?")) {
                    
                    pstmt.setInt(1, Integer.parseInt(id));
                    ResultSet rs = pstmt.executeQuery();
                    
                    if (rs.next()) {
                        request.setAttribute("employee_id", rs.getInt("employee_id"));
                        request.setAttribute("employee_name", rs.getString("employee_name"));
                        request.setAttribute("age", rs.getInt("age"));
                        request.setAttribute("email", rs.getString("email"));
                        request.setAttribute("phone", rs.getString("phone"));
                        request.setAttribute("dept", rs.getString("dept"));
                    }
                }
            } catch (Exception e) {
                request.setAttribute("errorMessage", "Error loading employee data: " + e.getMessage());
            }
            request.getRequestDispatcher("update.jsp").forward(request, response);
        } else {
            response.sendRedirect("DisplayServlet");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Get form data
        String id = request.getParameter("id");
        String name = request.getParameter("employee_name");
        String ageStr = request.getParameter("age");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String dept = request.getParameter("dept");
        
        // Validate age
        int age;
        try {
            age = Integer.parseInt(ageStr);
            if (age < 18 || age > 65) {
                request.setAttribute("errorMessage", "Age must be between 18 and 65");
                request.setAttribute("employee_id", id);
                request.setAttribute("employee_name", name);
                request.setAttribute("age", ageStr);
                request.setAttribute("email", email);
                request.setAttribute("phone", phone);
                request.setAttribute("dept", dept);
                request.getRequestDispatcher("update.jsp").forward(request, response);
                return;
            }
        } catch (NumberFormatException e) {
            request.setAttribute("errorMessage", "Invalid age format. Please enter a number.");
            request.setAttribute("employee_id", id);
            request.setAttribute("employee_name", name);
            request.setAttribute("age", ageStr);
            request.setAttribute("email", email);
            request.setAttribute("phone", phone);
            request.setAttribute("dept", dept);
            request.getRequestDispatcher("update.jsp").forward(request, response);
            return;
        }
        
        // Get DB configuration
        String driver = getServletContext().getInitParameter("jdbcDriver");
        String url = getServletContext().getInitParameter("jdbcUrl");
        String username = getServletContext().getInitParameter("jdbcUsername");
        String password = getServletContext().getInitParameter("jdbcPassword");
        
        try {
            Class.forName(driver);
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement pstmt = conn.prepareStatement(
                     "UPDATE employees SET employee_name=?, age=?, email=?, phone=?, dept=? WHERE employee_id=?")) {
                
                pstmt.setString(1, name);
                pstmt.setInt(2, age);
                pstmt.setString(3, email);
                pstmt.setString(4, phone);
                pstmt.setString(5, dept);
                pstmt.setInt(6, Integer.parseInt(id));
                
                int rowsAffected = pstmt.executeUpdate();
                
                if (rowsAffected > 0) {
                    response.sendRedirect("DisplayServlet?updateSuccess=true");
                } else {
                    request.setAttribute("errorMessage", "No employee found with ID: " + id);
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            }
        } catch (Exception e) {
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}