<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="number"],
        input[type="email"],
        select {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .btn {
            display: inline-block;
            padding: 10px 15px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        .btn:hover {
            background-color: #45a049;
        }
        .error {
            color: red;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Update Employee</h1>
        
        <form action="UpdateServlet" method="post">
            <input type="hidden" name="id" value="${param.id}">
            
            <div class="form-group">
                <label for="employee_name">Employee Name</label>
                <input type="text" id="employee_name" name="employee_name" value="${employee.employee_name}" required>
            </div>
            
            <div class="form-group">
                <label for="age">Age</label>
                <input type="number" id="age" name="age" value="${employee.age}" min="18" max="65">
            </div>
            
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" value="${employee.email}" required>
                <span class="error">${emailError}</span>
            </div>
            
            <div class="form-group">
                <label for="phone">Phone Number</label>
                <input type="text" id="phone" name="phone" value="${employee.phone}" pattern="[0-9]{10}">
                <small>Format: 10 digits (no dashes or spaces)</small>
            </div>
            
            <div class="form-group">
                <label for="dept">Department</label>
                <select id="dept" name="dept">
                    <option value="IT" ${employee.dept == 'IT' ? 'selected' : ''}>IT</option>
                    <option value="HR" ${employee.dept == 'HR' ? 'selected' : ''}>HR</option>
                    <option value="Finance" ${employee.dept == 'Finance' ? 'selected' : ''}>Finance</option>
                    <option value="Marketing" ${employee.dept == 'Marketing' ? 'selected' : ''}>Marketing</option>
                    <option value="Operations" ${employee.dept == 'Operations' ? 'selected' : ''}>Operations</option>
                </select>
            </div>
            
            <div class="form-group">
                <input type="submit" value="Update Employee" class="btn">
                <a href="DisplayServlet" style="margin-left: 10px;">Cancel</a>
            </div>
        </form>
    </div>
</body>
</html>