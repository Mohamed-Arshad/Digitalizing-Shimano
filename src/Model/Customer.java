/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Arshad Suraj
 */
public class Customer {

    private String CustomerID;
    private String Name;
    private String Address;
    private String contactNo;
    private ArrayList<Sales> Receipt;

    //constructor for create new customer
    public Customer(String Name, String Address, String contactNo) {
        //CustomerID= generate new id
        this.Name = Name;
        this.Address = Address;
        this.contactNo = contactNo;
        Receipt = new ArrayList<>();
    }

    //constructor for load customer from database
    public Customer(String CustomerID, String Name, String Address, String contactNo, ArrayList<Sales> Receipt) {
        this.CustomerID = CustomerID;
        this.Name = Name;
        this.Address = Address;
        this.contactNo = contactNo;
        this.Receipt = Receipt;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public ArrayList<Sales> getReceipt() {
        return Receipt;
    }

    public void setReceipt(ArrayList<Sales> Receipt) {
        this.Receipt = Receipt;
    }

    public void AddReceipt(Sales sales) {
        Receipt.add(sales);
    }

    public void DeleteReceipt(Sales sales) {
        /*
     * code for delete receipt
         */
    }

}
