<%-- 
    Document   : product
    Created on : Aug 25, 2017, 8:49:25 AM
    Author     : n
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
        <style>
            table th{
                padding-top: 25px;
                padding-bottom: 5px;
                padding-right: 40px;               
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
            #product{
                margin:0 auto;
                width :55%;
                background-color:  whitesmoke;
                border-radius: 5px;
                padding-left: 30px;
                margin-top: 60px;
            }
            table tr.fit{
                white-space: nowrap;
            }
            table tr.details{
                white-space: nowrap;
            }
            #topbar{
                position: fixed;
                top:0;
                left:0;
                width:100%;
                height:50px;
                background-color:activeborder;
            }
        </style>
    </head>
    <body>
        <div id="topbar">${username}</div>>
        <div id='product'>
            <div style="float: left">
                <p><a href="addproduct.htm" style="color: sandybrown" value="addproduct">Add Product</a></p>
                <p><a href="feedback.htm" style="color: sandybrown" value="login">Provide Feedback</a></p>
            </div>
            <div class='container'>
                <table>
                    <tr class="fit">
                        <th>Product Id</th>
                        <th>Image</th>
                        <th>Category</th>
                        <th>Product Name</th>
                        <th>Minimum Bid</th>
                        <th>Bid Deadline</th>
                    </tr>
                </table>
                <table >
                    <tr class="details">
                        <td>${ProductId}</td>
                        <td>${Image}</td>
                        <td>${Category}</td>
                        <td>${ProductName}</td>
                        <td>${MinimumBid}</td>
                        <td>${BidDeadline}</td>
                    </tr>
                </table>
                
            </div>
        </div>
    </body>
</html>
