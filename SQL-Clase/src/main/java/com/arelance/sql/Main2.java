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
public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        Statement stmt1 = null;
//        Statement stmt2 = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila?SSL=false&serverTimezone=Europe/Madrid",
                    "root", "Fullstack.2021");
            stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            stmt2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

            rs1 = stmt1.executeQuery("SELECT actor_id,first_name,last_name FROM actor");
//            rs2 = stmt2.executeQuery("SELECT actor_id,first_name,last_name FROM actor");

            rs1.last();
            rs1.updateString("first_name", "Thor");
            rs1.updateString("last_name", "Stark");
            rs1.updateRow();

//            Thread.sleep(10000);
//            while(rs2.next()){
//                String fistName =  rs2.getString("first_name");
//                String lastName =  rs2.getString("last_name");
//                System.out.println(fistName + " " + lastName);
//            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
