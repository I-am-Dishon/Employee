<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
              float: end;
              text-align: center;
            }
            .content{
                padding-left: 70px;
                padding-right: -10px;
                width: 50%;
            }        
        </style> 
    </head>

    <body>
        <div class='container' id="form">
            <form  method="POST" value="login" class="content" modelAttribute='login'>
                <p>UserName:</p>
                <p><input type="text" name="username" required="required"/></p>
                <p>Password:</p>
                <p><input type="password" name="password" required="required"/></p>
                <p><a href="register.htm" style="color: sandybrown" value="register">Register Here</a></p>

                <!--<input type="submit" name="Login" value="login" style="background-color: sandybrown"/>-->
                <button  type="submit"  name="Login" style="background-color: sandybrown">Login</button>
            </form>
        </div>   
    </body>
</html>
