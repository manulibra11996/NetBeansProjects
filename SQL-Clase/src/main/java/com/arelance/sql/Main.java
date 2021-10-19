/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String[] args) {
        ResultSet rs = null;
        Statement stmt = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila?SSL=false&serverTimezone=Europe/Madrid",
                    "root", "Fullstack.2021");
            stmt = conn.createStatement();
//            rs = stmt.executeQuery("SELECT first_name,last_name FROM actor LIMIT 10"); 
//            while(rs.next()){
//                String fistName =  rs.getString("first_name");
//                String lastName =  rs.getString("last_name");
//                System.out.println(fistName + " " + lastName);
//            }

//            stmt.executeUpdate("INSERT INTO actor(first_name,last_name) VALUES ('Manuel','Fernandez')"); 
//            rs = stmt.executeQuery("SELECT first_name,last_name FROM actor WHERE last_name='Fernandez'"); 
//            String fistName =  rs.getString("first_name");
//            String lastName =  rs.getString("last_name");
//            System.out.println(fistName + " " + lastName);
//            stmt.executeUpdate("DELETE FROM actor WHERE last_name='Fernandez'"); 
//            rs = stmt.executeQuery("SELECT COUNT(last_name) FROM actor WHERE last_name='Fernandez' GROUP BY first_name,last_name"); 
//            int count = rs.getInt("COUNT(last_name)");
//            System.out.println(count);
//            stmt.executeUpdate("UPDATE actor SET last_name = 'Fernandez Fernandez' WHERE first_name='Manuel'");
//            rs = stmt.executeQuery("SELECT first_name,last_name FROM actor WHERE first_name='Manuel'"); 
//            System.out.println(rs.getString("first_name") + " " + 
//                    rs.getString("last_name"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
