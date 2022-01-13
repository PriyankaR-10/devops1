package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

/**
 * UserSignUp POJO class that has attributes for registering a new user
 * @author Priyanka_Ramesh Pavan Varun
 */

public class Customer
{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slno;
    @Id
    private String email;
    private String name, password,confirm_password;
    private int phone_no;

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public Customer() {
    }

    public Customer(int slno, String name, String email, String password, String confirm_password, int phone_no) {
        this.slno = slno;
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirm_password = confirm_password;
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "slno=" + slno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirm_password='" + confirm_password + '\'' +
                ", phone_no=" + phone_no +
                '}';
    }
}
