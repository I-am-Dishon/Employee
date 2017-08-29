/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.bean;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 *
 * @author n
 */
public class SendEmail {
     
    
    private static  JavaMailSender mailSender;
    
        @Autowired
        public void setMailSender(JavaMailSender mailSender){
            this.mailSender = mailSender;
        }
        public JavaMailSender getMailSender() {
            return mailSender;
        }
        
    
        
        

    public static void sendMail(String host,String port, String user,String password, String email, String name) {
    
        String status = "success";
        
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", port);
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            
            Authenticator auth = new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(name, password);
            }
            };
            
                Session session = Session.getInstance(properties,auth);
                MimeMessage message = new MimeMessage(session);
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom("Administrator");
            helper.setTo(email);
            helper.setSubject("Registration Confirmation");
            
            String text = "Thank you for your registration. Your details are:<br />"
                    + "username:<b>" + name + "</b><br />"
                    + "password:<b>" + password + "</b>";
                    
            helper.setText(text, true);
            mailSender.send(message);
            Transport.send(message);
        } catch (MessagingException e){
            status = "There is a problem sending mail";
        }        
//        
    }
        
}
