package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Booking a table POJO class that has attributes for booking perspective
 * @author Priyanka_Ramesh Pavan Varun
 */

@Entity
@Table(name="bookingdetails")
public class BookingDetails
{
    @Id
    private String name;
    private String date;
    private String email;
    private Integer noofpeople;
    private Integer phone;
    private String restolist;

    public BookingDetails(){
    }

    public BookingDetails(String name, String date, String email, Integer noofpeople, Integer phone, String restolist) {
        this.name = name;
        this.date = date;
        this.email = email;
        this.noofpeople = noofpeople;
        this.phone = phone;
        this.restolist = restolist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNoofpeople() {
        return noofpeople;
    }

    public void setNoofpeople(Integer noofpeople) {
        this.noofpeople = noofpeople;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getRestolist() {
        return restolist;
    }

    public void setRestolist(String restolist) {
        this.restolist = restolist;
    }

    @Override
    public String toString() {
        return "bookingdetails{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", noofpeople=" + noofpeople +
                ", phone=" + phone +
                ", restolist='" + restolist + '\'' +
                '}';
    }
}
