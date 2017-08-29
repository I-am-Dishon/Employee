/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author n
 */
@Controller
public class ProductController {
    
    @RequestMapping(value="product")
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response)throws Exception{
        
         
        return new ModelAndView("product");
    }
    @RequestMapping(value="addproduct")
    protected ModelAndView addproduct(HttpServletRequest request,
            HttpServletResponse response)throws Exception{
        
         
        return new ModelAndView("addproduct");
    }
    @RequestMapping(value="feedback")
    protected ModelAndView feedback(HttpServletRequest request,
            HttpServletResponse response)throws Exception{
        
         
        return new ModelAndView("feedback");
    }
}
