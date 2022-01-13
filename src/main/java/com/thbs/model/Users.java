package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User POJO class that has attributes for Signing-up if he/she is already an existing user
 * @author Priyanka_Ramesh Pavan Varun
 */

@Entity
public class Users
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slno;
    @Id
    private String email;
    private String password;

    public Users()
    {
        super();
    }

    public Users(int slno, String email, String password) {
        super();
        this.slno = slno;
        this.email = email;
        this.password = password;
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
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

    @Override
    public String toString() {
        return "Users{" +
                "slno=" + slno +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
