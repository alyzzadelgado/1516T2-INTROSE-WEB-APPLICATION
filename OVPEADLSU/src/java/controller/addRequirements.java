/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CollegesDAO;
import DAO.LangDAO;
import DAO.OppDAO;
import DAO.OppItemDAO;
import DAO.ProfDAO;
import DAO.ReqDAO;
import DAO.SkillsDAO;
import classes.Colleges;
import classes.Language;
import classes.OppItems;
import classes.Opportunity;
import classes.Proficiency;
import classes.Requirement;
import classes.Skills;
import java.io.IOException;
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
public class addRequirements extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        HttpSession session = request.getSession();
        String nextStep="";
        Opportunity newOpp = new Opportunity();
        
        String[] req;
        req=request.getParameterValues("reqCheck");
        String oppReq;
        if (req!=null) {
            newOpp.setRequirements(req);
            oppReq=newOpp.getRequirement();
        }
        else {
            oppReq="";
            session.setAttribute("oppReq", "");
        }
        
        if (request.getParameter("add")!=null) {
            if (Integer.parseInt(String.valueOf(request.getParameter("confirm"))) == 1) {
                newOpp.setName(String.valueOf(session.getAttribute("oppName")));
                newOpp.setType(String.valueOf(session.getAttribute("oppType")));
                newOpp.setTypeName(String.valueOf(session.getAttribute("oppTypeName")));
                newOpp.setCountry(String.valueOf(session.getAttribute("oppCountry")));
                newOpp.setDescription(String.valueOf(session.getAttribute("oppDescription")));
                newOpp.setStartDate(String.valueOf(session.getAttribute("oppStartDate")));
                newOpp.setEndDate(String.valueOf(session.getAttribute("oppEndDate")));
                newOpp.setContactPerson(String.valueOf(session.getAttribute("oppContactPerson")));
                newOpp.setPhoneNum(String.valueOf(session.getAttribute("oppPhone")));
                newOpp.setLandline(String.valueOf(session.getAttribute("oppLandline")));
                newOpp.setEmail(String.valueOf(session.getAttribute("oppEmail")));
                newOpp.setAge(String.valueOf(session.getAttribute("oppAge")));
                newOpp.setDegree(String.valueOf(session.getAttribute("oppDegree")));
                newOpp.setWorkExp(Integer.parseInt(String.valueOf(session.getAttribute("oppWorkExp"))));
                newOpp.setFieldExp(String.valueOf(session.getAttribute("oppFieldExp")));
                newOpp.setOtherSkills(String.valueOf(session.getAttribute("oppOtherSkill")));
                newOpp.setOtherLang(String.valueOf(session.getAttribute("oppOtherLang")));
                newOpp.setOtherProf(String.valueOf(session.getAttribute("oppOtherProf")));
                newOpp.setStatus("open");
                newOpp.setOtherReq(request.getParameter("otherReq"));


                Opportunity currOpp = new Opportunity();
                OppDAO oppDB = new OppDAO();
                currOpp = oppDB.add(newOpp);
                OppItemDAO itemsDB = new OppItemDAO();

                if (currOpp!=null) {
                    nextStep="/view_opportunities.jsp";
                    session.setAttribute("addOpp", "success");
                }
                    // sets selected colleges to opportunity_item table
                    CollegesDAO colDB = new CollegesDAO();
                    List<Colleges> listCol = colDB.getColleges();
                    if (!(session.getAttribute("oppColleges").equals(""))) {
                        OppItems colleges = new OppItems();
                        colleges.setOppId(currOpp.getId());
                        for (int j=0; j<listCol.size(); j++)
                        {
                            String curCol = listCol.get(j).getName();
                            if (String.valueOf(session.getAttribute("oppColleges")).contains(curCol)) {
                                colleges.setItemId(listCol.get(j).getId());
                                itemsDB.add(colleges);
                            }
                        }
                    }
                    // sets selected skills to opportunity_item table
                    SkillsDAO skillDB = new SkillsDAO();
                    List<Skills> listSkill = skillDB.getSkills();
                    if (!(session.getAttribute("oppSkills").equals(""))) {
                            OppItems skills = new OppItems();
                            skills.setOppId(currOpp.getId());
                            for (int k=0; k<listSkill.size(); k++)
                            {
                                String curSki = listSkill.get(k).getName();
                                if (String.valueOf(session.getAttribute("oppSkills")).contains(curSki)) {
                                    skills.setItemId(listSkill.get(k).getId());
                                    itemsDB.add(skills);
                                }
                            }
                    }
                    // sets selected language to opportunity_item table
                    LangDAO langDB = new LangDAO();
                    List<Language> listLang = langDB.getLanguage();
                    if (!(session.getAttribute("oppLang").equals(""))) {
                            OppItems lang = new OppItems();
                            lang.setOppId(currOpp.getId());
                            for (int l=0; l<listLang.size(); l++)
                            {
                                String curLang = listLang.get(l).getName();
                                if (String.valueOf(session.getAttribute("oppLang")).contains(curLang)) {
                                    lang.setItemId(listLang.get(l).getId());
                                    itemsDB.add(lang);
                                }
                            }
                    }
                    // sets selected proficiency to opportunity_item table
                    ProfDAO profDB = new ProfDAO();
                    List<Proficiency> listProf = profDB.getProficiency();
                    if (!(session.getAttribute("oppProf").equals(""))) {
                            OppItems prof = new OppItems();
                            prof.setOppId(currOpp.getId());
                            for (int m=0; m<listProf.size(); m++)
                            {
                                String curProf = listProf.get(m).getName();
                                if (String.valueOf(session.getAttribute("oppProf")).contains(curProf)) {
                                    prof.setItemId(listProf.get(m).getId());
                                    itemsDB.add(prof);
                                }
                            }
                    }
                    // sets selected requirementsto to opportunity_table
                    ReqDAO reqDB = new ReqDAO();
                    List<Requirement> listReq = reqDB.getRequirement();
                    if (!(oppReq.equals(""))) {
                        OppItems require = new OppItems();
                        require.setOppId(currOpp.getId());
                        for (int i=0; i<listReq.size(); i++)
                        {
                            String curReq = listReq.get(i).getName();
                            if (oppReq.contains(curReq)) {
                                require.setItemId(listReq.get(i).getId());
                                itemsDB.add(require);
                            }
                        }
                    }
                session.setAttribute("oppName", null);
                session.setAttribute("oppType", null);
                session.setAttribute("oppCountry", null);
                session.setAttribute("oppDescription", null);
                session.setAttribute("oppStartDate", null);
                session.setAttribute("oppEndDate", null);
                session.setAttribute("oppContactPerson", null);
                session.setAttribute("oppPhone", null);
                session.setAttribute("oppLandline", null);
                session.setAttribute("oppEmail", null);
                session.setAttribute("oppColleges", null);
                session.setAttribute("oppAge", null);
                session.setAttribute("oppDegree", null);
                session.setAttribute("oppWorkExp", 1);
                session.setAttribute("oppFieldExp", null);
                session.setAttribute("oppSkills", null);
                session.setAttribute("oppOtherSkill", null);
                session.setAttribute("oppLang", null);
                session.setAttribute("oppOtherLang", null);
                session.setAttribute("oppProf", null);
                session.setAttribute("oppOtherProf", null);
                session.setAttribute("oppReq", null);
                session.setAttribute("oppOtherReq", null);
                session.setAttribute("currOppId", null);
                }
            else
            nextStep="/view_opportunities.jsp";
        }
        
        else if (request.getParameter("back")!=null) {
            nextStep="/add_qualifications.jsp";
            session.setAttribute("oppReq", newOpp.getRequirement());
            session.setAttribute("oppOtherReq", request.getParameter("otherReq"));
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
