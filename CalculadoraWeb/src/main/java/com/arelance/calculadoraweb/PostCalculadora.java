/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.calculadoraweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel
 */
@WebServlet(name = "PostCalculadora", urlPatterns = {"/PostCalculadora"})
public class PostCalculadora extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {

            double op1 = Double.parseDouble(request.getParameter("op1"));
            double op2 = Double.parseDouble(request.getParameter("op2"));
            String operacion = request.getParameter("operacion");
            double valor = 0;

            if (op1 != 0 && op2 != 0) {
                switch (operacion) {
                    case "sumar":
                        valor = sumar(op1, op2);
                        break;
                    case "restar":
                        valor = restar(op1, op2);
                        break;
                    case "multiplicar":
                        valor = multiplicar(op1, op2);
                        break;
                    case "dividir":
                        valor = dividir(op1, op2);
                        break;
                }
//                request.setAttribute("op1", op1);
//                request.setAttribute("op2", op2);
                request.setAttribute("valor", valor);
                request.getRequestDispatcher("/index_1.jsp").
                        forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public double sumar(double op1, double op2) {
        return op1 + op2;
    }

    public double restar(double op1, double op2) {
        return op1 - op2;
    }

    public double multiplicar(double op1, double op2) {
        return op1 * op2;
    }

    public double dividir(double op1, double op2) {
        return op1 / op2;
    }
}
