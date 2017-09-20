/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.controller;

import com.employee.app.bean.SendEmail;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author n
 */
public class EmailSendingServlet extends HttpServlet{
    private String host;
    private String port;
    private String user;
    private String pass;
 
    @Override
    public void init() {
        // reads SMTP server setting from web.xml file
        
        //ServletContext context = getServletContext();
            host = "smtp.gmail.com";
            port = "465";
            user = "" //your email;
            pass = ""//your password;
    }
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // reads form fields
        String recipient = request.getParameter("email");
        String username = request.getParameter("UserName");
//        String content = request.getParameter("content");
 
        String resultMessage = "";
 
        try {
            SendEmail.sendMail(host, port, user, pass, recipient, username);
            resultMessage = "The e-mail was sent successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMessage = "There were an error: " + ex.getMessage();
        } finally {
            request.setAttribute("Message", resultMessage);
            getServletContext().getRequestDispatcher("/home.jsp").forward(
                    request, response);
        }
    }
}
