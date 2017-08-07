package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DAO.DBConnectionFactory;
import classes.Opportunity;

public final class add_005fqualifications_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\t\t<title>Office of the Vice President for External Affairs</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Bootstrap -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/ovpea.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("\t\t<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("            ");

               // Opportunity newOpp = (Opportunity) session.getAttribute("newOpp2");
                String name = String.valueOf(session.getAttribute("rmName"));
                
                DBConnectionFactory factory = DBConnectionFactory.getInstance();
                Connection connection = factory.getConnection();
                
                Statement stmtSkill = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtLang = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtProf = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                String sQuery = "select * from skills";
                ResultSet sResult = null;
                
                String lQuery = "select * from languages";
                ResultSet lResult = null;
                
                String pQuery = "select * from proficiencies";
                ResultSet pResult = null;
                
                int oppId=1;
            
            Statement stmtOpp = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtName = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                // query for opportunity and status
                String oQuery = "select * from opportunity where id = " + oppId + "";
                ResultSet rsOpp = null;
                
                // query for skills
                String currSkill = "select S.name from skills S, opportunity_item I"
                        + " where S.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet skillRes = null;
                
                // query for languages
                String currLang = "select L.name from languages L, opportunity_item I"
                        + " where L.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet langRes = null;
                
                // query for profeciencies
                String currProf = "select P.name from proficiencies P, opportunity_item I"
                        + " where P.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet profRes = null;
                
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!--Navigation Bar-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<b><a class=\"navbar-brand\" href=\"homepage.html\">OVPEA</a></b>\r\n");
      out.write("\t\t\t\t</div> <!-- navbar-header closing tag -->\r\n");
      out.write("\t\t\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"homepage.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"view_opportunities.jsp\">Opportunities</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Log out</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div> <!-- navbar closing tag -->\r\n");
      out.write("\t\t\t</div> <!-- container closing tag -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h1>Welcome, ");
      out.print(name);
      out.write("!</h1>\r\n");
      out.write("\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"homepage.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"view_opportunities.html\">Opportunities</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\">Add opportunities</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t</div> <!--Closing tag for Welcome text and sitemap-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--Panel-->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"local-nav col-lg-3 col-md-3 col-sm-3\" > <!--Column 1: Local Nav bar-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"nav-container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"view_opportunities.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong><h2> Opportunities</h2></strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"comments.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong><h4> Comments and Inquiries</h4></strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"student_tracking.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong><h4> Student Tracking</h4></strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-3\"> <!--Column 2-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>QUALIFICATIONS</h3>\r\n");
      out.write("                                                                <form name=\"form2\" onsubmit=\"//return validateSecondForm();\" role=\"form\" method=\"POST\" action=\"addQualifications\">\r\n");
      out.write("\r\n");
      out.write("                                                                    ");

                                                                                rsOpp = stmtOpp.executeQuery(oQuery);
                                                                            
      out.write("\r\n");
      out.write("                                                                            \r\n");
      out.write("                                                                            ");
 while(rsOpp.next()) {
      out.write("\r\n");
      out.write("                                                                    \r\n");
      out.write("                                                                    ");

                                                                        String age="", degree="", workExp="1", fieldExp="", oSkill="", oLang="", oProf="";
                                                                        if (session.getAttribute("oppAge")!=null)
                                                                            age=String.valueOf(session.getAttribute("oppAge"));
                                                                        if (session.getAttribute("oppDegree")!=null)
                                                                            degree=String.valueOf(session.getAttribute("oppDegree"));
                                                                        if (session.getAttribute("oppWorkExp")!=null)
                                                                            workExp=String.valueOf(session.getAttribute("oppWorkExp"));
                                                                        if (session.getAttribute("oppFieldExp")!=null)
                                                                            fieldExp=String.valueOf(session.getAttribute("oppFieldExp"));
                                                                        if (session.getAttribute("oppOtherSkill")!=null)
                                                                            oSkill=String.valueOf(session.getAttribute("oppOtherSkill"));
                                                                        if (session.getAttribute("oppOtherLang")!=null)
                                                                            oLang=String.valueOf(session.getAttribute("oppOtherLang"));
                                                                        if (session.getAttribute("oppOtherProf")!=null)
                                                                            oProf=String.valueOf(session.getAttribute("oppOtherProf"));
                                                                    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                                <div class=\"form-group\"><!-- Work Experience -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"degree\">PREFERRED AGE</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"age\" value=\"");
      out.print(rsOpp.getString("age"));
      out.write("\" type=\"text\" class=\"form-control\" id=\"inputAge\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- Work Experience -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"degree\">DEGREE</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"degree\" value=\"");
      out.print(rsOpp.getString("degree"));
      out.write("\" type=\"text\" class=\"form-control\" id=\"inputDegree\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- Work Experience -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"workExp\">WORK EXPERIENCE</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"noOfYears\">No. Of Years:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <select name=\"workExp\" class=\"form-control\" id=\"sel1\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>3</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>6</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>7</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>8</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>9</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <option>10</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- Field -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"field\">Field of Experience:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"fieldExp\" class=\"form-control\" id=\"workExp\" rows=\"3\">");
      out.print(rsOpp.getString("field_experience"));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-3\"><!-- Column 3-->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"college\">SKILLS</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- Skills -->\r\n");
      out.write("                                                                                    \r\n");
      out.write("                                                                                    ");

                                                                                    String skill="", sChecked="";
                                                                                    StringBuilder a = new StringBuilder();
                                                                                    sResult = stmtSkill.executeQuery(sQuery);
                                                                                    skillRes = stmtName.executeQuery(currSkill);
                                                                                    while (skillRes.next()) {
                                                                                        a.append(skillRes.getString("S.name")+" ");
                                                                                    } skillRes.first(); skillRes.previous();
                                                                                    
                                                                                    skill = a.toString();
                                                                                    while (sResult.next()) {
                                                                                        /*if (session.getAttribute("oppSkills")!=null)
                                                                                            skill=String.valueOf(session.getAttribute("oppSkills"));
                                                                                        */
                                                                                        if (skill.contains(sResult.getString("name")))
                                                                                            sChecked="checked";
                                                                                
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"checkbox-skills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input ");
      out.print(sChecked);
      out.write(" type=\"checkbox\" name=\"skillCheck\" value=\"");
      out.print(sResult.getString("name"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(sResult.getString("name"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                                ");

                                                                                                    sChecked="";
                                                                                                    } sResult.first(); sResult.previous();
                                                                                                
      out.write(" \r\n");
      out.write("                                                                                                \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"soe-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tOthers:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"otherSkill\" type=\"text\" value=\"");
      out.print(oSkill);
      out.write("\" class=\"form-control\" id=\"inputSkill\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                                \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"langFluency\">LANGUAGE PROFICIENCY</label><br>\r\n");
      out.write("                                                                                        \r\n");
      out.write("                                                                                        ");

                                                                                            String lang="", lChecked="";
                                                                                            StringBuilder b = new StringBuilder();
                                                                                            lResult = stmtLang.executeQuery(lQuery);
                                                                                            langRes = stmtName.executeQuery(currLang);
                                                                                            while (langRes.next()) {
                                                                                                b.append(langRes.getString("L.name")+" ");
                                                                                            } langRes.first(); langRes.previous();

                                                                                            lang = b.toString();
                                                                                            while(lResult.next()) {
                                                                                               /* if (session.getAttribute("oppLang")!=null) 
                                                                                                    lang = String.valueOf(session.getAttribute("oppLang"));
                                                                                                       */
                                                                                                if (lang.contains(lResult.getString("name")))
                                                                                                    lChecked="checked";
                                                                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"checkbox-lang\">\r\n");
      out.write("                                                                                                            <input ");
      out.print(lChecked);
      out.write(" type=\"checkbox\" name=\"langCheck\" id=\"engCheckbox\" value=\"");
      out.print(lResult.getString("name"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(lResult.getString("name"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                            ");

                                                                                                lChecked="";
                                                                                                } lResult.first(); lResult.previous();
                                                                                            
      out.write("\r\n");
      out.write("                                                                                            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"soe-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tOthers:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"otherLang\" type=\"text\" value=\"");
      out.print(oLang);
      out.write("\" class=\"form-control\" id=\"inputLang\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-3\"><!--Column 4-->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"langFluency\">COMPUTER PROFICIENCY</label><br>\r\n");
      out.write("                                                                                        \r\n");
      out.write("                                                                                        ");

                                                                                            String prof="", pChecked="";
                                                                                            StringBuilder c = new StringBuilder();
                                                                                            pResult = stmtProf.executeQuery(pQuery);
                                                                                            profRes = stmtName.executeQuery(currProf);
                                                                                            while (profRes.next()) {
                                                                                                c.append(profRes.getString("P.name")+" ");
                                                                                            } profRes.first(); profRes.previous();

                                                                                            prof = c.toString();
                                                                                            while(pResult.next()) {
                                                                                                /*if (session.getAttribute("oppProf")!=null)
                                                                                                    prof=String.valueOf(session.getAttribute("oppProf"));
                                                                                                */
                                                                                                if (prof.contains(pResult.getString("name")))
                                                                                                    pChecked="checked";
                                                                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"checkbox-prof\">\r\n");
      out.write("                                                                                                            <input ");
      out.print(pChecked);
      out.write(" type=\"checkbox\" name=\"profCheck\" value=\"");
      out.print(pResult.getString("name"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(pResult.getString("name"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                                ");

                                                                                                    pChecked="";
                                                                                                    } pResult.first(); pResult.previous();
                                                                                                
      out.write("\r\n");
      out.write("                                                                                                \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"soe-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tOthers:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"otherProf\" type=\"text\" value=\"");
      out.print(oProf);
      out.write("\" class=\"form-control\" id=\"inputLang\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<a href=\"add_opportunity.html\" class=\"btn btn-info\" style=\"background-color:#009688;border:none;color:white;\" type=\"button\">Back</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"add_requirements.html\" class=\"btn btn-info\" style=\"margin-right:10px;background-color:#009688;border:none;color:white;\" type=\"button\">Continue</a>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"back\" value=\"Back\" class=\"btn btn-info\" style=\"background-color:#009688;border:none;color:white;\"/>\r\n");
      out.write("                                                                                <input type=\"submit\" name=\"continue\" value=\"Continue\" class=\"btn btn-info\" style=\"margin-right:10px;background-color:#009688;border:none;color:white;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} rsOpp.first(); rsOpp.previous(); 
      out.write("\r\n");
      out.write("                                                            </form> <!--Closing tag column 4-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            /* function validateSecondForm(){\r\n");
      out.write("                var skillFlag = 0;\r\n");
      out.write("                var langFlag = 0;\r\n");
      out.write("                var profFlag = 0;\r\n");
      out.write("                for (var i = 0; i <6; i++) {\r\n");
      out.write("                    if(document.form2[\"skillCheck\"][i].checked){\r\n");
      out.write("                        skillFlag ++;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                for (var i = 0; i <2; i++) {\r\n");
      out.write("                    if(document.form2[\"langCheck\"][i].checked){\r\n");
      out.write("                        langFlag ++;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                for (var i = 0; i <5; i++) {\r\n");
      out.write("                    if(document.form2[\"profCheck\"][i].checked){\r\n");
      out.write("                        profFlag ++;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("        \r\n");
      out.write("                 if (skillFlag == 0 || langFlag == 0 || profFlag == 0) {\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("            */\r\n");
      out.write("         </script>\r\n");
      out.write("         \r\n");
      out.write("         ");

            pResult.close();
            lResult.close();
            sResult.close();
            skillRes.close();
            langRes.close();
            profRes.close();
            stmtProf.close();
            stmtLang.close();
            stmtSkill.close();
            stmtOpp.close();
            stmtName.close();
            connection.close();
	
      out.write("\t\r\n");
      out.write("\t \r\n");
      out.write("        \r\n");
      out.write("  </body>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
