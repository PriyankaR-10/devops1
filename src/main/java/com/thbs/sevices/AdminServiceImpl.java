package com.thbs.sevices;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.Admin;
import com.thbs.model.restaurants;
import com.thbs.repository.AdminRepo;
import com.thbs.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * AdminServiceImpl implements the business logic for CRUD Operations
 * @author Priyanka_Ramesh Pavan Varun
 */

@Service
public class AdminServiceImpl implements AdminService
{
    @Autowired
    AdminRepo adminRepo;

    @Autowired
    RestaurantRepo restaurantRepo;

    @Override
    public String Adminlogin(@ModelAttribute("admin") Admin a1)
    {

        Optional<Admin> searchAdmin = adminRepo.findById(a1.getUsername());
        if(searchAdmin.isPresent())
        {
            Admin c1= searchAdmin.get();
            if(a1.getPassword().equals(c1.getPassword()))
            {

                return "adminoperations.html";
            }
            return "admin_login.html";
        }
        else
            return "admin_login.html";
    }


    @Override
    public String adminop(HttpServletRequest request, restaurants rest)
    {
        switch (request.getParameter("value"))
        {
            case PropertyConstants.ADD:
                restaurantRepo.save(rest);
                break;
            case PropertyConstants.MODIFY:
                restaurantRepo.save(rest);
                break;
            case PropertyConstants.DELETE:
                restaurantRepo.delete(rest);
                break;
        }
        return "adminoperations.html";
    }
}
