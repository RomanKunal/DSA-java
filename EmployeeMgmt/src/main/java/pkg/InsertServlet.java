package pkg;

import jakarta.servlet.ServletException;
import java.sql.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Get Data from form
		
		  	String employeeName = request.getParameter("employee_name");
	        int age = Integer.parseInt(request.getParameter("age"));
	        String email = request.getParameter("email");
	        String phone = request.getParameter("phone");
	        String dept = request.getParameter("dept");
	        
	        //Get DB confs
	        String driver=getServletContext().getInitParameter("jdbcDriver");
	        String jdbcUrl=getServletContext().getInitParameter("jdbcUrl");
	        String jdbcUsername=getServletContext().getInitParameter("jdbcUsername");
	        String jdbcPassword=getServletContext().getInitParameter("jdbcPassword");
	        
	        
	     // Validate required fields
            if (employeeName == null || employeeName.trim().isEmpty() || 
                email == null || email.trim().isEmpty()) {
                throw new ServletException("Employee name and email are required fields");
            }
	        
	        //Load the driver
	        try {
	        	Class.forName(driver);
	        	Connection connection=DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
	        	String sql = "INSERT INTO employees (employee_name, age, email, phone, dept) VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            
	            // Set parameters
	            preparedStatement.setString(1, employeeName);
	            preparedStatement.setInt(2, age);
	            preparedStatement.setString(3, email);
	            preparedStatement.setString(4, phone != null ? phone : "");
	            preparedStatement.setString(5, dept != null ? dept : "");
	            
	            // Execute query
	            int rowsAffected = preparedStatement.executeUpdate();
	            
	            if (rowsAffected > 0) {
	                // Success - redirect to success page
	                response.sendRedirect("success.jsp");
	            } else {
	                request.setAttribute("errorMessage", "Failed to insert employee record");
	                request.getRequestDispatcher("error.jsp").forward(request, response);
	            }
	        	
	        	
	        }catch(Exception e) {
	        	e.getMessage();
	        }
	}

}
