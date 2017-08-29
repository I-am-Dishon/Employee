/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.controller;

import com.employee.app.bean.UserBean;
import com.employee.app.model.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author n
 */


@Controller
public class LoginController {
    
    @RequestMapping(value="/login")
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
        HttpServletResponse response) throws Exception {

        ModelAndView mav = new ModelAndView("login");
        return mav;
    }
        
        
    @RequestMapping(value="home")
     public String home(){
         return "home";
     }
    
     
     @RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")User loginBean, Model model)
	{
            
                model.addAttribute("username", loginBean.getUserName());
                model.addAttribute("password", loginBean.getPassword());
		ModelAndView mav= null;
		try
		{
			//if(loginBean.getUserName().isEmpty())
//			if(isValidUser)
			//{
//				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", loginBean.getUserName());
				mav = new ModelAndView("product");
//			}
//			else
//			{				
//                                mav.addObject("loginBean", loginBean);
//				request.setAttribute("message", "Invalid credentials!!");
//                                mav = new ModelAndView("product");
//			}
//
		}
		catch(Exception e)
		{
                    e.printStackTrace();
		}

		return mav;
	}
}