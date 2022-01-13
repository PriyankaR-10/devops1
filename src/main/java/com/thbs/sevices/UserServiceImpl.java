package com.thbs.sevices;

import com.thbs.model.Customer;
import com.thbs.model.Users;
import com.thbs.repository.CustRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;


/**
 * UserServiceImpl implements the business logic for Registering as a new user or
 * if he is an existing user then enable to login through registered id
 * @author Priyanka_Ramesh
 */

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    CustRepo custRepo;

    @Override
    public String signin(HttpServletRequest request, Customer cust)
    {
        switch (request.getParameter("value"))
        {
            case "Signup":
                custRepo.save(cust);
                return "login.html";
        }
        return "login.html";
    }

    @Override
    public String login(@ModelAttribute("user") Users u1)
    {
        Optional<Customer> searchUser = custRepo.findById(u1.getEmail());
        if(searchUser.isPresent())
        {
            Customer c1= searchUser.get();
            if(u1.getPassword().equals(c1.getPassword()))
            {
                return "gallery.html";
            }
            return "login.html";
        }
        else
            return "login.html";
    }
}

