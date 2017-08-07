package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import classes.Opportunity;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DAO.DBConnectionFactory;

public final class update_005frm_005faccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

            DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection connection = factory.getConnection();
            
            String name = String.valueOf(session.getAttribute("rmName"));
            String rmid = String.valueOf(session.getAttribute("rmId"));
            String username= "";
            
            String query = "select * from resmanager where rm_id = "+rmid;
           
            PreparedStatement pstmt = connection.prepareStatement(query);
             

            ResultSet rs = pstmt.executeQuery(query);
            
             while(rs.next()) {
              username= rs.getString("username");
            }
            String msg;

        
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
      out.write("\t\t\t\t\t\t<li><a href=\"view_opportunities.html\">Opportunities</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"update_rm_account.html\">Account</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.html\">Log out</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div> <!-- navbar closing tag -->\r\n");
      out.write("\t\t\t</div> <!-- container closing tag -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h1>Welcome, ");
      out.print(name);
      out.write("</h1>\r\n");
      out.write("\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"homepage.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"update_rm_account.html\">Account</a></li>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t<strong><h4> Opportunities</h4></strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"comments.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong><h4> Comments and Inquiries</h4></strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"student_tracking.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong><h4> Student Tracking</h4></strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-5 col-md-5 col-sm-5\"> <!--Column 2-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Username</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-group\">\r\n");
      out.write("                                                                    ");
 if (session.getAttribute("usernameError") == null)
                                                                                             msg="";
                                                                                             else
                                                                                             msg=String.valueOf(session.getAttribute("usernameError"));
                                                                                                
      out.write("\r\n");
      out.write("                                                                                            <label><b>");
      out.print(msg);
      out.write("<b><br></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\"  style=\"font-size:13px; margin-left:2px; color: #009688;\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#collapse1\">Edit Username</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"collapse1\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                                        <form method=\"POST\" action=\"editUsername\">\r\n");
      out.write("                                                                                            <div class=\"panel-body\" style=\"margin-left:3px;\">Username:");
      out.print(username);
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                                            <div class=\"form-group\" style=\"margin-left:17px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"username\">New username:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"inputUsername\" type=\"text\" class=\"form-control\" id=\"inputUsername\">\r\n");
      out.write("                                                                                            </div>\r\n");
      out.write("                                                                                              \r\n");
      out.write("                                                                                            <input value=\"Save\" class=\"btn btn-primary\" style=\"margin-left:327px;background-color:#009688;border:none;color:white;\"type=\"submit\">\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                                            <input value=\"Cancel\" class=\"btn btn-primary\" style=\"background-color:#E0E0E0;border:none;color:black;\"type=\"button\" data-toggle=\"collapse\" data-target=\"#collapse1\" aria-expanded=\"false\" aria-controls=\"collapse1\">\r\n");
      out.write("                                                                                         \r\n");
      out.write("                                                                                        </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Password </h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-group\">\r\n");
      out.write("                                                                    ");
 if (session.getAttribute("passwordError") == null)
                                                                                             msg="";
                                                                                             else
                                                                                             msg=String.valueOf(session.getAttribute("passwordError"));
                                                                                                
      out.write("\r\n");
      out.write("                                                                                            <label><b>");
      out.print(msg);
      out.write("<b><br></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\"  style=\"font-size:13px; margin-left:2px; color: #009688;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#collapse2\">Change Password</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"collapse2\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                                                                        <form method=\"POST\" action=\"editPassword\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-left:17px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"currPassword\">Current:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"currentPassword\" type=\"Password\" class=\"form-control\" id=\"currPassword\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-left:17px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"newPassword\">New:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"newPassword\" type=\"Password\" class=\"form-control\" id=\"newPassword\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-left:17px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"reNewPassword\">Retype New:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"confirmPassword\" type=\"Password\" class=\"form-control\" id=\"reNewPassword\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input value=\"Save\" class=\"btn btn-primary\" style=\"margin-left:327px;background-color:#009688;border:none;color:white;\"type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input value=\"Cancel\" class=\"btn btn-primary\" style=\"background-color:#E0E0E0;border:none;color:black;\"type=\"button\" data-toggle=\"collapse\" data-target=\"#collapse2\" aria-expanded=\"false\" aria-controls=\"collapse2\">\r\n");
      out.write("                                                                                        </form>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
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
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
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
