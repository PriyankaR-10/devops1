package com.thbs.controller;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.Admin;
import com.thbs.model.restaurants;
import com.thbs.sevices.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ${Pavan Priyanka Varun}
 *
 * ${Admin operations}
 */
@Controller
public class AdminController
{
    @Autowired
    AdminService adminService;

    /**
     * Check for Admin credentials
     *
     * @return - Admin operations Page
     */
    @RequestMapping(PropertyConstants.ADMINCHECK)
    public String Adminlogin(@ModelAttribute("admin") Admin a1)
    {
        return adminService.Adminlogin(a1);
    }

    /**
     * Admin Crud Operations
     *
     */
    @RequestMapping(value = PropertyConstants.ADMINOP,method = RequestMethod.GET)
    public String adminop(HttpServletRequest request, restaurants rest)
    {
        return adminService.adminop(request,rest);
    }
}
