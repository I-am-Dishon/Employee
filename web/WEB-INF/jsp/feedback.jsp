<%-- 
    Document   : feedback
    Created on : Aug 25, 2017, 9:17:08 AM
    Author     : n
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
        <style>
            #feedback{
                margin:0 auto;
                width :55%;
                background-color:  whitesmoke;
                border-radius: 5px;
                padding-left: 30px;
                padding-bottom: 15px;
                padding-top: 10px;
            }
            .container{
                margin: 0 auto;
                width: 50%;
                padding-left:  0px;
                width: auto !important;
                
            }
            body{
                background-color: cadetblue;
            }
            button{
              border-radius: 25px;
              background-color: sandybrown;
              margin-top: -35px;         
              margin-left: 300px;              
              text-align: center;
              
            }
        </style>
    </head>
    <body>
        <div id="feedback">
            <div>
                <p><a href="product.htm" style="color: sandybrown" value="login">Back to Home</a></p>
            </div>
            <div class="container">
                <form>
                    <table border="0" width="35%" align="center">
                        <caption><h2>Provide Feedback</h2></caption>
                        <tr>
                            <td>Subject </td>
                            <td><input type="text" name="subject" size="50"/></td>
                        </tr>
                        <tr>
                            <td>Feedback</td>
                            <td><textarea rows="10" cols="39" name="content"></textarea> </td>
                        </tr>                        
                    </table>  
                    <button type="submit" value="Send" style="background-color: sandybrown">Send</button>
                </form>
            </div>
        </div>
    </body>
</html>
