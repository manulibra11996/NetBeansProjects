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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Main_menu {

    static Connection conn = null;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        while (true) {
            System.out.println("Opciones");
            System.out.println("1-Alta cliente");
            System.out.println("2-Alta articulo");
            System.out.println("3-Comprar");
            System.out.println("4-Factura cliente");
            System.out.println("0-Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    añadirCliente();
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Introduzca el nombre");
                    String nombreArt = teclado.next();
                    System.out.println("Introduzca el precio");
                    float precioArt = teclado.nextFloat();
                    conn = obtenerConneccion();
                    conn.createStatement().
                            executeUpdate("INSERT INTO articulo(nombre,precio) VALUES ('" + nombreArt + "'," + precioArt + ")");
                    conn.close();
                    break;
                case 3:
                    System.out.println(" ");
                    listarClientes();
                    String nombreCom = teclado.next();
                    conn = obtenerConneccion();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM cliente WHERE nombre='" + nombreCom + "';");
                    int clientes = 0;
                    while (rs.next()) {
                        clientes++;
                    }
                    if (clientes == 0) {
                        System.out.println("El cliente no existe, añadelo a continuación");
                        añadirCliente();
                    }
                    //MAPS
                    List<String> articulosList = new ArrayList<String>();
                    List<Integer> cantidadList = new ArrayList<Integer>();
                    boolean bucle = true;
                    int articulos = 0;
                    while (bucle) {
                        System.out.println("Opciones");
                        System.out.println("1-Comprar");
                        System.out.println("0-Salir");
                        int compra = teclado.nextInt();

                        switch (compra) {
                            case 1:
                                listarArticulos();
                                String articuloCom = teclado.next();
                                System.out.println("Cantidad de articulos a comprar:");
                                int cantidad = teclado.nextInt();

                                Statement stmt1 = conn.createStatement();
                                ResultSet rs1 = stmt1.executeQuery(
                                        "SELECT * FROM articulo WHERE nombre='"
                                        + articuloCom + "';");

                                while (rs1.next()) {
                                    articulos++;
                                    articulosList.add(rs1.getString("nombre"));
                                    cantidadList.add(cantidad);
                                }
                                break;
                            case 0:
                                bucle = false;
                                break;
                        }

                    }

                    if (clientes != 0 && articulos != 0) {
                        Statement stmt2 = conn.createStatement();
                        stmt2.executeUpdate("INSERT INTO pedido(id_cliente) "
                                + "VALUES ((SELECT id_cliente FROM cliente WHERE nombre='" + nombreCom + "'))");
                        for (int i = 0; i < articulosList.size(); i++) {
                            Statement stmt3 = conn.createStatement();
                            stmt3.executeUpdate("INSERT INTO detallepedido(id_pedido,id_articulo,cantidad,precio) "
                                    + "VALUES ((SELECT id_pedido FROM pedido WHERE id_cliente=(SELECT id_cliente FROM cliente "
                                    + "WHERE nombre='" + nombreCom + "') ORDER BY id_pedido DESC LIMIT 1),(SELECT id_articulo FROM articulo "
                                    + "WHERE nombre='" + articulosList.get(i) + "')," + cantidadList.get(i) + ",(SELECT precio FROM articulo "
                                    + "WHERE nombre='" + articulosList.get(i) + "'));");
                        }

                    }
                    conn.close();
                    break;

                case 4:
                    System.out.println(" ");
                    listarClientes();
                    String nombreFac = teclado.next();
                    System.out.println("Seleccione una factura:");
                    conn = obtenerConneccion();
                    Statement stmt4 = conn.createStatement();
                    ResultSet rs4 = stmt4.executeQuery("SELECT * FROM pedido RIGHT JOIN detallepedido "
                            + "ON pedido.id_pedido = detallepedido.id_pedido WHERE id_cliente=(SELECT id_cliente FROM cliente "
                            + "WHERE nombre='" + nombreFac + "')");
                    Statement stmt5 = conn.createStatement();
                    ResultSet rs5 = stmt5.executeQuery("SELECT * FROM pedido WHERE id_cliente=(SELECT id_cliente FROM cliente "
                            + "WHERE nombre='" + nombreFac + "')");
                    while (rs5.next()) {
                        System.out.println(rs5.getString("id_pedido"));
                    }
                    String factura = teclado.next();
                    Statement stmt6 = conn.createStatement();
                    ResultSet rs6 = stmt6.executeQuery("SELECT * FROM cliente WHERE id_cliente = "
                            + "(SELECT id_cliente FROM pedido WHERE id_pedido =(SELECT id_cliente FROM cliente WHERE nombre='" + nombreFac + "'));");
                    Statement stmt7 = conn.createStatement();
                    ResultSet rs7 = stmt7.executeQuery("SELECT * FROM articulo LEFT JOIN detallepedido "
                            + "ON articulo.id_articulo = detallepedido.id_articulo WHERE id_pedido = " + factura + ";");
                    String nombreCli = null;
                    while (rs6.next()) {
                        nombreCli = rs6.getString("nombre");//nombre cliente
                    }
                    String identificador = factura;
                    int cantidadFac = 0;
                    int precioFac = 0;
                    int totalFac = 0;
                    System.out.println("Nombre del cliente " + nombreCli);
                    System.out.println("Identificador factura " + identificador);
                    System.out.println("Articulos:");
                    while (rs7.next()) {
                        System.out.print(rs7.getString("nombre") + " ");//nombre articulo
                        System.out.println(rs7.getString("cantidad"));//cantidad articulo
                        cantidadFac = rs7.getInt("cantidad");
                        precioFac = rs7.getInt("precio");
                        totalFac = (cantidadFac * precioFac) + totalFac;
                    }
                    System.out.println("Total: " + totalFac);
                    conn.close();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public static Connection obtenerConneccion() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tienda_db?SSL=false&serverTimezone=Europe/Madrid",
                "test", "Fullstack.2021");
        return con;
    }

    public static void listarClientes() throws SQLException {
        try (Connection con = obtenerConneccion();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM cliente;");) {
            System.out.println("Selecciona un cliente: ");
            int i = 1;
            while (rs.next()) {
                System.out.println(i++ + " " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
        }

    }

    public static void listarArticulos() throws SQLException {
        try (Connection con = obtenerConneccion();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM articulo;");) {
            System.out.println("Selecciona un articulo: ");
            int i = 1;
            while (rs.next()) {
                System.out.println(i++ + " " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
        }

    }

    public static void añadirCliente() throws SQLException {
        System.out.println(" ");
        System.out.println("Introduzca el nombre");
        String nombreA = teclado.next();
        System.out.println("Introduzca el apellido");
        String apellidoA = teclado.next();
        conn = obtenerConneccion();
        conn.createStatement().
                executeUpdate("INSERT INTO cliente(nombre,apellidos) VALUES ('" + nombreA + "','" + apellidoA + "')");
        conn.close();
    }
}
