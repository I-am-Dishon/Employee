/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.controller;

import com.employee.app.dao.UserDao;
import com.employee.app.model.User;
import java.io.IOException;
import java.util.Date;
import javax.annotation.Resource;
import javax.mail.MessagingException;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author n
 */

@Controller
@SessionAttributes("user")
public class RegisterController {
    
    @Resource(name="mailSession")
    private Session mailSession1;
//    @Autowired
    UserDao userDao = new UserDao();
    private  JavaMailSender mailSender = new JavaMailSenderImpl();
                  
    
    @RequestMapping(value="register")
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response)throws Exception{
        
         
        return new ModelAndView("register");
    }
    
//    @RequestMapping(value="/home", method=RequestMethod.POST)
//     public String home(){
//         return "home";
//     }
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
     public String login(){
         return "login";
     }
     
     @RequestMapping(value="/home", method = RequestMethod.GET)
     public  ModelAndView doPost(HttpServletRequest request,
            HttpServletResponse response, @ModelAttribute("spring")User user, Model model) throws ServletException, IOException, MessagingException{
                
          
        model.addAttribute("username", user.getUserName());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("verifypassword", user.getVerifypassword());
        model.addAttribute("email", user.getEmail());
        
        
//        String recipient = request.getParameter("email");
//        String username = request.getParameter("UserName");
               
        //ModelAndView mav = new ModelAndView("home");
         
        //return mav;
       // mav.addObject("helloMessage", me);
        //return "home";
        //mail.sendMail(user.getUserName(), user.getEmail(), user.getPassword());
        
        if(user.getPassword().compareTo(user.getVerifypassword()) == 0){
//        
//           
            
//          
            userDao.insertUser(user);
            String recipient = request.getParameter("email");
            String subject = "Registration Confirmation";
            String name = request.getParameter("userName");
            String password = request.getParameter("password");
//            String message = "Thank you for your registration. Your details are:<br />"
//                    + "username:<b>" + user.getUserName() + "</b><br />"
//                    + "password:<b>" + user.getPassword() + "</b>";
         
        
         //mailSession.getDebug();
        // creates a simple e-mail object
            MimeMessage message = new MimeMessage(mailSession1);
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom("Administrator");
            helper.setTo(recipient);
            helper.setSubject(subject);
            helper.setSentDate(new Date());
            
            String text = "Thank you for your registration. Your details are:<br />"
                    + "username:<b>" + name + "</b><br />"
                    + "password:<b>" + password + "</b>";
                    
            helper.setText(text, true);
            mailSender.send(message);
           // Transport.send(message);
         
        // forwards to the view named "Result"
        
            
//            SendEmail.sendMail(host, port, user, pass, recipient, username);
//           userDao.insertUser(user.getUserName(), user.getEmail(), user.getPassword());
            //mail.sendail(user.getUserName(), user.getEmail(), user.getPassword());
            return new ModelAndView("home", "helloMessage", user.getEmail());
//            
        } else {
//            
             return new ModelAndView("register"); 
        }
//               
       
     }
//     @RequestMapping(method = RequestMethod.POST)
//    public String doSendEmail(HttpServletRequest request) {
//        // takes input from e-mail form
//        
//    }
     
    
}
