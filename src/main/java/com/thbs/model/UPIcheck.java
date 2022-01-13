package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UPI table POJO class that has attributes for UPI perspective
 * @author Priyanka_Ramesh Pavan Varun
 */

@Entity
@Table(name="UpiCheck")
public class UPIcheck {

    @Id
    private String UpiCheck;

    @Override
    public String toString() {
        return "UPIcheck{" +
                "UpiCheck='" + UpiCheck + '\'' +
                '}';
    }

    public String getUpiCheck() {
        return UpiCheck;
    }

    public void setUpiCheck(String upiCheck) {
        UpiCheck = upiCheck;
    }
}
