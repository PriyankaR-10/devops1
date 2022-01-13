package com.thbs.sevices;

import com.thbs.model.Admin;
import com.thbs.model.restaurants;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Priyanka_Ramesh Pavan Varun
 */

public interface AdminService
{
    public String Adminlogin(@ModelAttribute("admin") Admin a1);
    public String adminop(HttpServletRequest request, restaurants rest);
}