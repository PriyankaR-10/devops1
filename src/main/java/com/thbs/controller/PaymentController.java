package com.thbs.controller;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.Payment;
import com.thbs.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * @author ${Pavan Priyanka Varun}
 *
 * ${Payment Operations}
 */

@Controller
public class PaymentController {

    @Autowired
    PaymentRepo paymentRepo;

    @Autowired
    UserController userController;
    /**
     * Check for Payment credentials
     * @param request
     * @param paymentdetails
     * @return - Success Page
     */
    @RequestMapping(PropertyConstants.CARDPAYMENT)
    public String Payment(HttpServletRequest request, Payment paymentdetails )
    {
            return "success.html";
    }
/*
    @RequestMapping(PropertyConstants.DOWNLOAD)
    public String download()
    {
       download.setEmail(userController.email);
        download.writeReceipt();
        return "gallery.html";
    }*/
}
