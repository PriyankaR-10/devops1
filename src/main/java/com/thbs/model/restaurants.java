package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Restaurant POJO class that has attributes for CRUD operations to be performed by admin
 * @author Priyanka_Ramesh
 */

@Entity
public class restaurants
{
    @Id
    private int resid;
    private String resname;
    private String resplace;
    private int resprice;

    public restaurants() {
    }

    public restaurants(int resid, String resname, String resplace, int resprice) {
        this.resid = resid;
        this.resname = resname;
        this.resplace = resplace;
        this.resprice = resprice;
    }

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getResplace() {
        return resplace;
    }

    public void setResplace(String resplace) {
        this.resplace = resplace;
    }

    public int getResprice() {
        return resprice;
    }

    public void setResprice(int resprice) {
        this.resprice = resprice;
    }

    @Override
    public String toString() {
        return "restaurants{" +
                "resid=" + resid +
                ", resname='" + resname + '\'' +
                ", resplace='" + resplace + '\'' +
                ", resprice=" + resprice +
                '}';
    }
}
