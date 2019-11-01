/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DBCon {
    private String URL="jdbc:sqlite:bloodbank.db";
    private Connection con=null;
    private Statement st=null;
    public DBCon()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            con= DriverManager.getConnection(URL);
            st=con.createStatement();
            //System.out.println("Connection established");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }
    
    

    public Statement getSt() {
        return st;
    }
    /*
    public static void main(String[] args) {
        DBCon c=new DBCon();
    }
    */
}
