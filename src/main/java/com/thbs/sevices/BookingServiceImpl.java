package com.thbs.sevices;

import com.thbs.model.BookingDetails;
import com.thbs.repository.bookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * BookingServiceImpl implements the business logic for Booking a table
 * @author Priyanka_Ramesh
 */

@Service
public class BookingServiceImpl implements BookingService
{
    @Autowired
    bookingRepo bookRepo;

    @Override
    public String booking(HttpServletRequest request, BookingDetails books)
    {
        switch (request.getParameter("value"))
        {
            case "Next":
                bookRepo.save(books);
                return "Payment.html";
        }
        return "booking.html";
    }
}
