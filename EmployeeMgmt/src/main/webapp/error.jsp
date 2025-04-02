<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error Occurred</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .error-container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            text-align: center;
            max-width: 500px;
            width: 90%;
        }
        .error-icon {
            color: #e74c3c;
            font-size: 60px;
            margin-bottom: 20px;
        }
        h1 {
            color: #2c3e50;
            margin-bottom: 20px;
        }
        .error-message {
            color: #e74c3c;
            background-color: #fdecea;
            padding: 15px;
            border-radius: 4px;
            margin-bottom: 20px;
            font-size: 16px;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #3498db;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s;
        }
        .btn:hover {
            background-color: #2980b9;
        }
        .stack-trace {
            text-align: left;
            margin-top: 20px;
            padding: 10px;
            background-color: #f9f9f9;
            border-radius: 4px;
            font-family: monospace;
            font-size: 12px;
            color: #7f8c8d;
            max-height: 200px;
            overflow-y: auto;
            display: ${showStackTrace == true ? 'block' : 'none'};
        }
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
    <div class="error-container">
        <div class="error-icon">
            <i class="fas fa-exclamation-circle"></i>
        </div>
        <h1>Error Occurred</h1>
        <div class="error-message">
            ${errorMessage != null ? errorMessage : 'An unexpected error occurred while processing your request.'}
        </div>
        <a href="index.jsp" class="btn">Return to Dashboard</a>
        <a href="#" onclick="window.history.back()" class="btn" style="background-color: #95a5a6; margin-left: 10px;">Go Back</a>
        
        <div class="stack-trace">
            ${stackTrace}
        </div>
    </div>
</body>
</html>