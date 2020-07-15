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
public class Production {

    private String ProductionID;
    private ArrayList<Product> Input;
    private ArrayList<Product> Output;
    private Date Date;

    //constructor for create new production
    public Production() {
        //ProductionID=generate uniq id
        Input = new ArrayList<>();
        Output = new ArrayList<>();
        Date = new Date();
    }

    //constructor for load production from database
    public Production(String ProductionID, ArrayList<Product> Input, ArrayList<Product> Output, Date Date) {
        this.ProductionID = ProductionID;
        this.Input = Input;
        this.Output = Output;
        this.Date = Date;
    }

    public String getProductionID() {
        return ProductionID;
    }

    public void setProductionID(String ProductionID) {
        this.ProductionID = ProductionID;
    }

    public ArrayList<Product> getInput() {
        return Input;
    }

    public void setInput(ArrayList<Product> Input) {
        this.Input = Input;
    }

    public ArrayList<Product> getOutput() {
        return Output;
    }

    public void setOutput(ArrayList<Product> Output) {
        this.Output = Output;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public void AddInput(Product item) {
        Input.add(item);
    }

    public void DeleteInput(Product item) {
        //code to remove the item from input array
    }

    public void AddOutput(Product item) {
        Input.add(item);
    }

    public void DeleteOutput(Product item) {
        //code to remove the item from output array
    }

    public String GenerateProductionDetails() {
        String ProductionDetails = "";
        /*
        * code to generate production details
         */
        return ProductionDetails;
    }

}
