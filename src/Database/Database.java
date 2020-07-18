/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arshad Suraj
 */
public class Database {
    private Connection con;
    private String url="jdbc:mysql://localhost:3306/digitalizing_shimano";
    private String username="root";
    private String password="";
    private Statement st;

    public Database() {
        try {
            con = DriverManager.getConnection(url,username,password);
            st=con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Database not connected");
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Class.forName("com.mysql.jdbc.Driver");
    public boolean insert(String sql){
        try {
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean update(String sql){
        try {
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     public ResultSet select(String query){
        try {
            ResultSet rs = st.executeQuery(query);
            return rs;
         } catch (SQLException ex) {
             System.out.println("Output not found");
             return null;
         }
    }
    
       
}
