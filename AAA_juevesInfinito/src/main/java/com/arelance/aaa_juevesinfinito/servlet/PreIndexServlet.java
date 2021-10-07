/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.aaa_juevesinfinito.servlet;


import com.arelance.aaa_juevesinfinito.domains.Emp;
import com.arelance.aaa_juevesinfinito.domains.Proyecto;
import com.arelance.aaa_juevesinfinito.domains.Tarea;
import com.arelance.aaa_juevesinfinito.service.EmpService;
import com.arelance.aaa_juevesinfinito.service.ProyectoService;
import com.arelance.aaa_juevesinfinito.service.TareaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "PreIndexServlet", urlPatterns = {"/PreIndexServlet"})
public class PreIndexServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Inject
    private ProyectoService proyectoService;
    @Inject
    private TareaService tareaService;
    @Inject
    private EmpService empService;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        List<Proyecto> proyectos = proyectoService.ListarProyecto();
        request.setAttribute("proyectos",proyectos);
        List<Tarea> tareas = tareaService.ListarTarea();
        request.setAttribute("tareas",tareas);
        List<Emp> emps = empService.ListarEmp();
        request.setAttribute("emps",emps);
        request.getRequestDispatcher("index.jsp").forward(request, response);
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

}
