/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RMDAO;
import classes.User;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alydoubleza
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // rm input
        User rm = new User();
        rm.setUsername(request.getParameter("username"));
        // hashes password in database for security
        rm.setPassword(String.valueOf(request.getParameter("password").hashCode()));
        
        /* 
        user #1: Ms. Research Manager
            username: 12345678
            password: p@ssword
        
        user #2: Mr. Research Manager
            username: 12398765
            password: dlsu5678
        */
        
        // finds rm in database
        RMDAO rmDB = new RMDAO();
        User currRM = rmDB.login(rm);
        
        // declare so that rm will be redirected to another page
        String nextStep="";
        HttpSession session = request.getSession();
        
        // if no rm account was found
        if (currRM.getUserid() == 0)
            currRM = null;
        
        // if rm account was found
        if (currRM != null)
        {
            session.setAttribute("login", "success");
            session.setAttribute("rmId", currRM.getUserid());
            session.setAttribute("rmName", currRM.getAccountName());
            nextStep = "/add_opportunity.jsp";
        }
        else
        {
            session.setAttribute("error", "Invalid account!");
            nextStep = "/index.jsp";
        }
        
        
        ServletContext context = getServletContext();
        RequestDispatcher rd = context.getRequestDispatcher(nextStep);
        rd.forward(request, response);
        
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
