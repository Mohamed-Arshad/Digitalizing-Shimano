/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Arshad Suraj
 */
public class Sales {

    private String SalesID;
    private ArrayList<Product> Products;
    private Date Date;
    private double Total;

    //constructor for create new sales
    public Sales() {
        //SalesID=uniq sales ID
        Products = new ArrayList<>();
        Date = new Date();
        Total = 0;
    }

    //constructor for load sales from database
    public Sales(String SalesID, ArrayList<Product> Products, Date Date, double Total) {
        this.SalesID = SalesID;
        this.Products = Products;
        this.Date = Date;
        this.Total = Total;
    }

    public String getSalesID() {
        return SalesID;
    }

    public void setSalesID(String SalesID) {
        this.SalesID = SalesID;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> Products) {
        this.Products = Products;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void AddProduct(Product item) {
        Products.add(item);
    }

    public void DeleteProduct(Product item) {
        /*
     * code for Delete product
         */
    }

    public void CalculateTotal() {
        double total = 0;
        /*
    * code for calculate total
         */
        this.Total = total;
    }

    public String GenerateReceipt() {
        String Receipt = "";
        /*
    * code for generate receipt
         */
        return Receipt;
    }

}
