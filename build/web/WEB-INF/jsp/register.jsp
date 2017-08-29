<%-- 
    Document   : viewEmployee1
    Created on : Aug 21, 2017, 10:02:25 AM
    Author     : n
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <style>
            body{
                height: 100%;
                background-color: cadetblue;
                }
            #form{
                height: auto;
                margin:0 auto;
                width :50%;
                max-width: 30%;
                background-color:whitesmoke;
                padding-bottom: 10px;
                padding-left: 30px;
                padding-top: 5px;
                border-radius: 8px;
                padding-right: -20px;
            }
            button{
              border-radius: 25px;
              background-color: sandybrown;
              margin-top: -35px;              
              float: right;
              text-align: center;
            }
            .content{
                padding-left: 70px;
                width: 50%;
            }
            
        </style> 
        
    </head>
    <body>
        <div class='container' id="form">
            <form  method="GET" action="home.htm" modelAttribute="spring" class="content">
                <p>UserName:</p>
                <p><input type="text" name="userName" required="required" path="userName"/></p>
                <p>Password:</p>
                <p><input type="password" name="password" required="required" path="password"/></p>
                <p>Verify Password:</p>
                <p><input type="password" name="verifypassword" required="required" path="verifypassword"/></p>
                <p>Email:</p>
                <input type="email" name="email" required="required" path="email"/>
                <p><a href="login.htm" style="color: sandybrown" value="login">Back to Login</a></p>
                <button type="submit" align='right' name="register" style="">Register</button>
        </form>
        </div>
    </body>
</html>
