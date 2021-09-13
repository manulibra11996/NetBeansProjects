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
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Main_menu {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        while (true) {            
            System.out.println("Opciones");
            System.out.println("1-Alta cliente");
            System.out.println("2-Alta articulo");
            System.out.println("3-Consultar clientes");
            System.out.println("4-Comprar");
            System.out.println("5-Factura cliente");
            
            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduzca el nombre");
                    String nombreA = teclado.next();
                    System.out.println("Introduzca el apellido");
                    String apellidoA = teclado.next();
                    conn = obtenerConneccion();
                    conn.createStatement().
                            executeUpdate("INSERT INTO cliente(nombre,apellidos) VALUES ('"+ nombreA + "','"+ apellidoA + "')");
                    conn.close();
                    break;
                case 2:
                    System.out.println("Introduzca el nombre");
                    String nombreArt = teclado.next();
                    System.out.println("Introduzca el precio");
                    float precioArt = teclado.nextFloat();
                    conn = obtenerConneccion();
                    conn.createStatement().
                            executeUpdate("INSERT INTO articulo(nombre,precio,categoria,descripcion) VALUES ('"+ nombreArt + "',"+ precioArt + ")");
                    conn.close();
                    break;
                case 3:
                    listarClientes();
                    break;
                default:
                    break;
            }
        }
    }
    public static Connection obtenerConneccion() throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tienda_db?SSL=false&serverTimezone=Europe/Madrid", 
                    "test", "Fullstack.2021");
        return con;
    }
    
    public static void listarClientes() throws SQLException{
        try (Connection con = obtenerConneccion(); 
                Statement stmt= con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM cliente;");){
            System.out.println("Selecciona un cliente: ");
            int i=1;
            while(rs.next()){
                System.out.println(i++ + " " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
        }
        
    }
}
