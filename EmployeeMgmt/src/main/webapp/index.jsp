<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }
        .container {
            max-width: 1000px;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 30px;
        }
        .card-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            gap: 20px;
            margin-top: 30px;
        }
        .card {
            width: 200px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0,0,0,0.1);
            text-align: center;
            transition: transform 0.3s;
        }
        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0 6px 12px rgba(0,0,0,0.15);
        }
        .card a {
            text-decoration: none;
            color: #333;
            display: block;
        }
        .card i {
            font-size: 40px;
            margin-bottom: 15px;
        }
        .card h3 {
            margin: 0;
            color: #2c3e50;
        }
        .card p {
            color: #7f8c8d;
            font-size: 14px;
        }
        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
        }
        .logout-btn {
            padding: 8px 15px;
            background-color: #e74c3c;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .logout-btn:hover {
            background-color: #c0392b;
        }
        /* Different colors for different operations */
        .insert { color: #4CAF50; } /* Green for insert */
        .display { color: #3498db; } /* Blue for display */
        .update { color: #f39c12; } /* Orange for update */
        .delete { color: #e74c3c; } /* Red for delete */
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Employee Management System</h1>
            <form action="LogoutServlet" method="post">
                <button type="submit" class="logout-btn">Logout</button>
            </form>
        </div>
        
        <div class="card-container">
            <!-- Insert Employee -->
            <div class="card">
                <a href="insert.jsp">
                    <i class="fas fa-user-plus insert"></i>
                    <h3>Add Employee</h3>
                    <p>Register new employees in the system</p>
                </a>
            </div>
            
            <!-- Display Employees -->
            <div class="card">
                <a href="DisplayServlet">
                    <i class="fas fa-users display"></i>
                    <h3>View Employees</h3>
                    <p>Browse all employee records</p>
                </a>
            </div>
            
            <!-- Update Employee -->
            <div class="card">
                <a href="update.jsp">
                    <i class="fas fa-user-edit update"></i>
                    <h3>Update Employee</h3>
                    <p>Modify existing employee records</p>
                </a>
            </div>
            
            <!-- Delete Employee -->
            <div class="card">
                <a href="delete.jsp">
                    <i class="fas fa-user-times delete"></i>
                    <h3>Delete Employee</h3>
                    <p>Remove employees from the system</p>
                </a>
            </div>
        </div>
    </div>
</body>
</html>