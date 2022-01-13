package com.thbs.model;

import javax.persistence.*;

/**
 * Payment table POJO class that has attributes for Payment perspective
 * @author Priyanka_Ramesh Pavan Varun
 */

@Entity
@Table(name="payment")
public class Payment {



    private String name;
    @Id
    private Long card_number;
    private String exp_date;
    private  int cvv;
    private long UPIphone;
    private long Customerid;
    private String Password;

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", card_number=" + card_number +
                ", exp_date='" + exp_date + '\'' +
                ", cvv=" + cvv +
                ", UPIphone=" + UPIphone +
                ", Customerid=" + Customerid +
                ", Password='" + Password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCard_number() {
        return card_number;
    }

    public void setCard_number(Long card_number) {
        this.card_number = card_number;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public long getUPIphone() {
        return UPIphone;
    }

    public void setUPIphone(long UPIphone) {
        this.UPIphone = UPIphone;
    }

    public long getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(long customerid) {
        Customerid = customerid;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
