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
public class Receptionist {

    private ArrayList<Transection> TransectionDetails;
    private ArrayList<Product> Availablestock;
    private ArrayList<Sales> SalesDetails;
    private ArrayList<Production> ProductionDetails;
    private ArrayList<Customer> CustomerDetails;

    public Receptionist() {
        TransectionDetails=new ArrayList<>();
        Availablestock=new ArrayList<>();
        SalesDetails=new ArrayList<>();
        ProductionDetails=new ArrayList<>();
        CustomerDetails=new ArrayList<>();
        
    }

    public ArrayList<Transection> getTransectionDetails() {
        return TransectionDetails;
    }

    public void setTransectionDetails(ArrayList<Transection> TransectionDetails) {
        this.TransectionDetails = TransectionDetails;
    }

    public ArrayList<Product> getAvailablestock() {
        return Availablestock;
    }

    public void setAvailablestock(ArrayList<Product> Availablestock) {
        this.Availablestock = Availablestock;
    }

    public ArrayList<Sales> getSalesDetails() {
        return SalesDetails;
    }

    public void setSalesDetails(ArrayList<Sales> SalesDetails) {
        this.SalesDetails = SalesDetails;
    }

    public ArrayList<Production> getProductionDetails() {
        return ProductionDetails;
    }

    public void setProductionDetails(ArrayList<Production> ProductionDetails) {
        this.ProductionDetails = ProductionDetails;
    }

    public ArrayList<Customer> getCustomerDetails() {
        return CustomerDetails;
    }

    public void setCustomerDetails(ArrayList<Customer> CustomerDetails) {
        this.CustomerDetails = CustomerDetails;
    }
    
    public void cleartransection(){
        TransectionDetails=new ArrayList<>();
    }
    
    public double calculatebalance(){
        double balance=0;
        for(int i=0;i<TransectionDetails.size();i++){
           if(TransectionDetails.get(i).getType().equalsIgnoreCase("INCOME")){
               balance=balance+TransectionDetails.get(i).getAmount();
           }else{
               balance=balance-TransectionDetails.get(i).getAmount();
           }
        }
        return balance;
    }

    /*
    * codes for othe receptionist class methods in class diagram
     */
}
