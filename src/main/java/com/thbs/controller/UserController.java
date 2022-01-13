
package com.thbs.controller;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.Customer;
import com.thbs.model.Users;
import com.thbs.repository.*;

import com.thbs.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * @author ${Pavan Priyanka Varun}
 *
 * ${User operations}
 */

@Controller
public class UserController
{

    @Autowired
    UserService userService;

    /**
     * register new User and save details
     *
     * @return - Home page
     */
    @RequestMapping(value= PropertyConstants.SIGNUP, method= RequestMethod.GET)
    public String signin(HttpServletRequest request, Customer cust)
    {
        return userService.signin(request, cust);
    }

    /**
     * Check for User credentials
     *
     * @return - Gallery Page
     */
    @RequestMapping(PropertyConstants.USERSIGNIN)
    public String login(@ModelAttribute("user") Users u1)
    {
        return userService.login(u1);
    }


}
