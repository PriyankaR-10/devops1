package com.thbs.sevices;

import com.thbs.model.BookingDetails;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Priyanka_Ramesh
 */

public interface BookingService
{
    public String booking(HttpServletRequest request, BookingDetails books);
}
