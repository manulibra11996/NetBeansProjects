/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Manuel
 */
public class Conexion {

    public static Connection conectar() {
        Connection con = null;

        try {
            Context ctx=new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdbc/Examen");
            con = ds.getConnection();
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
        } catch (NamingException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return con;
        }
    }

}
