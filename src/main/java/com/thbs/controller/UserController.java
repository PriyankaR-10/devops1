
package com.thbs.controller;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.BookingDetails;
import com.thbs.model.Customer;
import com.thbs.model.Users;
import com.thbs.repository.*;

import com.thbs.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @Autowired
    BookingRepo bookingRepo;
    public String email;

    /**
     * register new User and save details
     * @param request
     * @param cust
     * @return
     */
    @RequestMapping(value= PropertyConstants.SIGNUP, method= RequestMethod.GET)
    public String signin(HttpServletRequest request, Customer cust)
    {
        return userService.signin(request, cust);
    }

    /**
     * Check for User credentials
     *
     * @param u1
     * @return
     */
    @RequestMapping(PropertyConstants.USERSIGNIN)
    public String login(@ModelAttribute("user") Users u1)
    {
        return userService.login(u1);
    }

    /**
     * Save the booking details
     * @param request
     * @param books
     * @return - Payment Page
     */
    @RequestMapping(PropertyConstants.SAVEBOOK)
    public String booking(HttpServletRequest request, BookingDetails books)
    {
        /*System.out.println(books.getEmail()+"before setting");
        email=books.getEmail();*/
        bookingRepo.save(books);
        return "Payment.html";
    }

}
