package com.thbs.controller;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.Payment;
import com.thbs.model.UPIcheck;
import com.thbs.repository.PaymentRepo;
import com.thbs.repository.UpiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
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
    UpiRepo upiRepo;

    /**
     * Check for Payment credentials
     *
     * @return - Success Page
     */
    @RequestMapping(PropertyConstants.CARDPAYMENT)
    public String Payment(HttpServletRequest request, Payment paymentdetails ){
        Optional<Payment> searchUser = paymentRepo.findById( paymentdetails.getCard_number());
        if(searchUser.isPresent())
        {
            Payment P1= searchUser.get();
            if(Objects.equals(paymentdetails.getCvv(), P1.getCvv()))
            {
                return "success.html";
            }
            return "Payment.html";
        }
        else
            return "Payment.html";

    }

    /**
     * Check for UPI credentials
     *
     * @return - Success Page
     */
   @RequestMapping(PropertyConstants.UPIPAYMENT)
    public String PaymentUPI(HttpServletRequest request, UPIcheck upidetails ){
        Optional<UPIcheck> searchUser = upiRepo.findById(upidetails.getUpiCheck());
        if(searchUser.isPresent()){
            return "success.html";}
        else
            return "Upi.html";

    }

}
