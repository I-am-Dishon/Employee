<%-- 
    Document   : addproduct
    Created on : Aug 25, 2017, 9:16:22 AM
    Author     : n
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add product</title>
        <style>
            button{
              border-radius: 25px;
              background-color: sandybrown;
              margin-top: -35px;         
              margin-left: 200px;              
              text-align: center;
              margin-top: 10px;
            }
            #addproduct{
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
                padding-top: 20px;
                padding-left: 80px;
            }
            body{
                background-color: cadetblue;
                margin-top: 20px;
            }
            table{
                border-spacing: 10px;
            }
        </style>
    </head>
    <body>
        <div id="addproduct">
            <div>
                <p><a href="product.htm" style="color: sandybrown" value="login">Back to Home</a></p>
            </div>
            <div class="container">
                <form:form>
                    <table>
                        <tr>
                            <td>Enter Product Name</td>                         
                            <td><input type="text" name="productname" size="50"></td>
                        </tr>
                        <tr>
                            <td>Enter Product Description</td>                         
                            <td><input type="text" name="productdescription" size="50"></td>
                        </tr>
                        <tr>
                            <td>Enter Minimum Bid</td>                         
                            <td><input type="text" name="amountbid" size="50"></td>
                        </tr>
                        <tr>
                            <td>Enter Auction Time</td>                         
                            <td><input type="time" name="productname" size="50"></td>
                        </tr>
                        <tr>
                            <td>Select Category</td>                         
                            <td><input type="text" name="productname" size="50"></td>
                        </tr>
                        <tr>
                            <td>Upload Image</td>                         
                            <td><input type="file" name="productname" size="50"></td>
                        </tr>
                    </table>
                    <button type="submit" name="add" style="background-color: sandybrown">Add</button>
                </form:form>
            </div>
        </div>
    </body>
</html>
