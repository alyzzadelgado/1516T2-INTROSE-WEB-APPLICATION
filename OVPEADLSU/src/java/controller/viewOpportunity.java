/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.OppDAO;
import classes.Opportunity;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pauldelgado
 */
public class viewOpportunity extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String nextStep = "";
        
        String status = String.valueOf(request.getParameter("status"));
        session.setAttribute("filter", request.getParameter("filter"));
        
        if(request.getParameter("filterOpp") != null) {
            session.setAttribute("filter", request.getParameter("filter"));
            nextStep="/view_opportunities.jsp";
        }
        else if (request.getParameter("editOpp") != null) {
            if(Integer.parseInt(request.getParameter("id")) != 0)
            {
                //session.setAttribute("currStatus", status);
                session.setAttribute("currOppId", request.getParameter("id"));
                nextStep="/edit_opportunity.jsp";
            }
            else
            {
                nextStep="/view_opportunities.jsp";
            }
        }
        else if (request.getParameter("editStatus") != null)
        {
            if(Integer.parseInt(request.getParameter("id")) != 0)
            {
                session.setAttribute("currStatus", status);
                session.setAttribute("currOppId", request.getParameter("id"));
                nextStep="/edit_status.jsp";
            }
            else
            {
                nextStep="/view_opportunities.jsp";
            }
        }
        else if (request.getParameter("delete") != null)
        {
            if (request.getParameter("confirm")!= null) 
            {
                int confirm = Integer.parseInt(String.valueOf(request.getParameter("confirm")));
                if (confirm == 1)
                {
                    session.setAttribute("currStatus", status);
                    OppDAO oppDB = new OppDAO();
                    oppDB.deleteOpp(Integer.parseInt(request.getParameter("id")));
                    nextStep="/view_opportunities.jsp";
                }
                else if (confirm == 0)
                    nextStep="/view_opportunities.jsp";
            }
            else
                nextStep="/view_opportunities.jsp";
            
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
