package com.thbs.controller;

import com.thbs.constants.PropertyConstants;
import com.thbs.model.BookingDetails;
import com.thbs.model.restaurants;
import com.thbs.repository.RestaurantRepo;
import com.thbs.repository.bookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  com.thbs.model.User;

import java.util.List;

/**
 * @author ${Pavan Priyanka Varun}
 *
 * ${Restaurant and booking Details}
 */

@RestController
public class RestaurantController {

    @Autowired
    RestaurantRepo restaurantRepo;

    @Autowired
     bookingRepo bookingRepo;

    /**
     * to get list of restaurants
     *
     */
    @GetMapping(PropertyConstants.RESTAURANTS)
    public List<restaurants> getdata(){

        return restaurantRepo.findAll();
    }

    /**
     * return booking details of specific User
     *
     * @return - Booking details Page
     */
    @PostMapping(PropertyConstants.BOOKINGLIST)
    public List<BookingDetails> alldataById(@RequestBody User user)
    {

        return bookingRepo.findByIdEmail(user.getEmail());
    }
}