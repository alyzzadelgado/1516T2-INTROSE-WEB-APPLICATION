/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CollegesDAO;
import DAO.OppDAO;
import DAO.OppItemDAO;
import classes.Colleges;
import classes.OppItems;
import classes.Opportunity;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class addOpportunity extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String nextStep="";
        Opportunity newOpp = new Opportunity();
        
        String[] colleges;
        String debug=null;
        colleges=request.getParameterValues("checkboxes");
       
        if (request.getParameter("continue")!=null)
        {
            session.setAttribute("oppName", request.getParameter("name"));
            session.setAttribute("oppType", request.getParameter("type"));
            session.setAttribute("oppTypeName", request.getParameter("typeName"));
            session.setAttribute("oppCountry", request.getParameter("country"));
            session.setAttribute("oppDescription", request.getParameter("description"));
            session.setAttribute("oppStartDate", request.getParameter("startDate"));
            session.setAttribute("oppEndDate", request.getParameter("endDate"));
            session.setAttribute("oppContactPerson", request.getParameter("contactPerson"));
            session.setAttribute("oppPhone", request.getParameter("contactPhone"));
            session.setAttribute("oppLandline", request.getParameter("contactLandline"));
            session.setAttribute("oppEmail", request.getParameter("email"));
            
            if(colleges != null) {
                newOpp.setColleges(colleges);
                session.setAttribute("oppColleges", newOpp.getCollege());
            }
            else
                session.setAttribute("oppColleges", "");
        }
       
        nextStep="/add_qualifications.jsp";
            
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
