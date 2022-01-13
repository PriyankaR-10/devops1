package com.thbs.controller;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.BookingDetails;
import com.thbs.sevices.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ${Pavan Priyanka Varun}
 *
 * ${Booking}
 */

@Controller
public class BookController
{
    @Autowired
    BookingService bookingService;

    /**
     * Save the booking details
     *
     * @return - Payment Page
     */
    @RequestMapping(PropertyConstants.SAVEBOOK)
    public String booking(HttpServletRequest request, BookingDetails books)
    {
        return bookingService.booking(request,books);
    }
}
