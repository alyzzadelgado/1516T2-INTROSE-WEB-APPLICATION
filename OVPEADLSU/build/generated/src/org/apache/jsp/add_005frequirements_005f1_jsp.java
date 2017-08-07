package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DAO.DBConnectionFactory;
import classes.Opportunity;

public final class add_005frequirements_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t");

                //Opportunity newOpp = (Opportunity) session.getAttribute("newOpp3");
            String name = String.valueOf(session.getAttribute("rmName"));
            
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
                Connection connection = factory.getConnection();
                
                Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                String query = "select * from requirements";
                ResultSet rs = null;
                
                int oppId=1;
            
            Statement stmtOpp = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtCode = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                // query for opportunity and status
                String oQuery = "select * from opportunity where id = " + oppId + "";
                ResultSet rsOpp = null;
                
                // query for colleges
                String rQuery = "select R.name from requirements R, opportunity_item I"
                        + " where R.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet rsCode = null;
             
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t\t\t<h3>REQUIREMENTS</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form name=\"reqForm\" onsubmit=\"//return validateThirdForm();\" role=\"form\" method=\"POST\" action=\"addRequirements\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                                                                            ");

                                                                                rsOpp = stmtOpp.executeQuery(oQuery);
                                                                            
      out.write("\r\n");
      out.write("                                                                            \r\n");
      out.write("                                                                            ");
 while(rsOpp.next()) {
      out.write("\r\n");
      out.write("                                                                                            ");

                                                                                                String req="", rChecked="", oReq="";
                                                                                                StringBuilder r = new StringBuilder();
                                                                                                if (session.getAttribute("oppOtherReq")!=null)
                                                                                                    oReq = String.valueOf(session.getAttribute("oppOtherReq"));
                                                                                                rs = stmt.executeQuery(query);
                                                                                                rsCode = stmtCode.executeQuery(rQuery);
                                                                                                while (rsCode.next()) {
                                                                                                    r.append(rsCode.getString("R.name")+" ");
                                                                                                } rsCode.first(); rsCode.previous();

                                                                                                req = r.toString();
                                                                                                while (rs.next()) {
                                                                                                    /*if (session.getAttribute("oppReq")!=null)
                                                                                                        req  =String.valueOf(session.getAttribute("oppReq"));
                                                                                                    */
                                                                                                    if (req.contains(rs.getString("name")))
                                                                                                        rChecked = "checked";
                                                                                            
      out.write("\r\n");
      out.write("                                                                                           \r\n");
      out.write("                                                                                                <div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"checkbox-req\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input ");
      out.print(rChecked);
      out.write(" type=\"checkbox\" name=\"reqCheck\" value=\"");
      out.print(rs.getString("name"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rs.getString("name"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                                        \r\n");
      out.write("                                                                                            ");

                                                                                                rChecked = "";
                                                                                                } rs.first(); rs.previous();
                                                                                            
      out.write("\r\n");
      out.write("                                                                                            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"soe-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tOthers:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"otherReq\" class=\"form-control\" id=\"otherReq\" rows=\"6\">");
      out.print(oReq);
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<a href=\"add_qualifications.html\" class=\"btn btn-info\" style=\"background-color:#009688;border:none;color:white;\" type=\"button\">Back</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"view_opportunities.html\" class=\"btn btn-info\" style=\"margin-right:10px;background-color:#009688;border:none;color:white;\" type=\"button\">Add Opportunity</a>-->\r\n");
      out.write("                                                                                <input type=\"submit\" name=\"back\" value=\"Back\" class=\"btn btn-info\" style=\"background-color:#009688;border:none;color:white;\"/>\r\n");
      out.write("                                                                                <input type=\"submit\" name=\"add\" value=\"Add Opportunity\" class=\"btn btn-info\" style=\"margin-right:10px;background-color:#009688;border:none;color:white;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                                ");
} rsOpp.first(); rsOpp.previous(); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            /*function validateThirdForm(){\r\n");
      out.write("                var flag = 0;\r\n");
      out.write("                for (var i = 0; i < 5; i++) {\r\n");
      out.write("                    if(document.reqForm[\"reqCheck\"][i].checked){\r\n");
      out.write("                        flag ++;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                if (flag == 0) {\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                return true;\r\n");
      out.write("            }*/\r\n");
      out.write("         </script>\r\n");
      out.write("         \r\n");
      out.write("         ");

            rs.close();
            rsCode.close();
            stmt.close();
            stmtOpp.close();
            stmtCode.close();
            connection.close();
         
      out.write("\r\n");
      out.write("\t \r\n");
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
