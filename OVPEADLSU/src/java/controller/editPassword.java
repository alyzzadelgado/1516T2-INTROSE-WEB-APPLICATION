/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RMDAO;
import classes.User;
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
public class editPassword extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        String nextStep="";
        String currentPassword;
        String newPassword;
        String confirmPassword;
        User mainUser = new User();
        RMDAO userManager = new RMDAO();
        
        
        
        currentPassword=request.getParameter("currentPassword");
        newPassword=request.getParameter("newPassword");
        confirmPassword=request.getParameter("confirmPassword");
        
        mainUser.setUserid((int) session.getAttribute("rmId"));
        
        if(userManager.confirmPassword(currentPassword, mainUser)) { //check if the current password matches with the database password
        
            if(userManager.validateCharacters(newPassword)&&newPassword.length()>=6) { //check if newPassword has valid characters and has 6 or more characters
            
                if(newPassword.equals(confirmPassword)){ // check if newPassword and confirmPassword matches
                //change password
                    userManager.editPassword(newPassword, mainUser);
                    session.setAttribute("passwordError", "password has been changed");
                    nextStep="/update_rm_account.jsp";
                } else {
                    session.setAttribute("passwordError", "error: new password and confirm password does not match");
                    nextStep="/update_rm_account.jsp";
                  }
            } else {
                session.setAttribute("passwordError", "error: invalid password");
                    nextStep="/update_rm_account.jsp";
            }
            
            
            
        }
        else {
                session.setAttribute("passwordError", "current Password does not match");
                nextStep="/update_rm_account.jsp";
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
