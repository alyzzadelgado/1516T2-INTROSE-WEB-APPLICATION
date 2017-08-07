/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class editQualifications extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        HttpSession session = request.getSession();
        String nextStep="";
        Opportunity newOpp = new Opportunity();
        
        String[] skills;
        skills=request.getParameterValues("skillCheck");
        String[] lang;
        lang=request.getParameterValues("langCheck");
        String[] prof;
        prof=request.getParameterValues("profCheck");
        
        
        if (request.getParameter("continue")!=null)
        {
            session.setAttribute("oppAge", request.getParameter("age"));
            session.setAttribute("oppDegree", request.getParameter("degree"));
            session.setAttribute("oppWorkExp", request.getParameter("workExp"));
            session.setAttribute("oppFieldExp", request.getParameter("fieldExp"));
            session.setAttribute("oppOtherSkill", request.getParameter("otherSkill"));
            session.setAttribute("oppOtherLang", request.getParameter("otherLang"));
            session.setAttribute("oppOtherProf", request.getParameter("otherProf"));
            
            if (lang!=null) {
            newOpp.setLanguages(lang);
            session.setAttribute("oppLang", newOpp.getLanguage());
            }
            else
            session.setAttribute("oppLang", "");
            
            if(prof!=null) {
            newOpp.setProficiencies(prof);
            session.setAttribute("oppProf", newOpp.getProficiency());
            }
            else
            session.setAttribute("oppProf", "");
            
            if (skills!=null) {
            newOpp.setSkills(skills);
            session.setAttribute("oppSkills", newOpp.getSkill());
            }
            else
            session.setAttribute("oppSkills", "");
            
            
            nextStep="/edit_requirements.jsp";
        }
        else if (request.getParameter("back")!=null) {
            session.setAttribute("oppAge", request.getParameter("age"));
            session.setAttribute("oppDegree", request.getParameter("degree"));
            session.setAttribute("oppWorkExp", request.getParameter("workExp"));
            session.setAttribute("oppFieldExp", request.getParameter("fieldExp"));
            session.setAttribute("oppOtherSkill", request.getParameter("otherSkill"));
            session.setAttribute("oppOtherLang", request.getParameter("otherLang"));
            session.setAttribute("oppOtherProf", request.getParameter("otherProf"));
            
            if (lang!=null) {
            newOpp.setLanguages(lang);
            session.setAttribute("oppLang", newOpp.getLanguage());
            }
            else
            session.setAttribute("oppLang", "");
            
            if(prof!=null) {
            newOpp.setProficiencies(prof);
            session.setAttribute("oppProf", newOpp.getProficiency());
            }
            else
            session.setAttribute("oppProf", "");
            
            if (skills!=null) {
            newOpp.setSkills(skills);
            session.setAttribute("oppSkills", newOpp.getSkill());
            }
            else
            session.setAttribute("oppSkills", "");
            
            
            nextStep="/edit_opportunity.jsp";
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
