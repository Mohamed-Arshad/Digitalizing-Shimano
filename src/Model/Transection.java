/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Arshad Suraj
 */
public class Transection {

    private String Description;
    private String type;
    private double Amount;
    private Date Date;

    //constructor for create new transection
    public Transection(String Description, String type, double Amount) {
        this.Description = Description;
        this.type = type;
        this.Amount = Amount;
        Date = new Date();
    }

    //constructor for load transection from database
    public Transection(String Description, String type, double Amount, Date Date) {
        this.Description = Description;
        this.type = type;
        this.Amount = Amount;
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

}
