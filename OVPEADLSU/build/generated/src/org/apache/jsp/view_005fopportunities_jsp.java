package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import DAO.DBConnectionFactory;

public final class view_005fopportunities_jsp extends org.apache.jasper.runtime.HttpJspBase
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

                DBConnectionFactory factory = DBConnectionFactory.getInstance();
                Connection connection = factory.getConnection();
                
                Statement stmtList = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtOpen = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtClose = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String name = String.valueOf(session.getAttribute("rmName"));
                String query;
                String filter;
            
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
      out.write("\t\t\t\t\t\t<li><a href=\"update_rm_account.jsp\">Account</a></li>\r\n");
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
      out.write("\t\t\t\t\t<li class=\"active\">Opportunities</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t</div> <!--Closing tag for Welcome text and sitemap-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--Panel-->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"local-nav col-lg-3 col-md-3 col-sm-3\" > <!--Column 1: Local Nav bar-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"nav-container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"view_opportunities.jsp\">\r\n");
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
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("                                                                \r\n");
      out.write("                                                                <div class=\"col-lg-3 col-md-8 col-sm-3\"> <!--Column 2-->\r\n");
      out.write("                                                                        <form method=\"POST\" action=\"viewOpportunity\">\r\n");
      out.write("                                                                                <label for=\"status\">Filter Opportunities:</label><br>\r\n");
      out.write("                                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                                    ");
 if(session.getAttribute("filter") == null)
                                                                                        filter="All";
                                                                                       else
                                                                                        filter=String.valueOf(session.getAttribute("filter"));
                                                                                    
                                                                                    String all="", open="", close="";
                                                                                        
                                                                                            if (filter.equals("All")) {
                                                                                                all = "selected";
                                                                                            }
                                                                                            if (filter.equals("Open")){
                                                                                                open = "selected";
                                                                                            }
                                                                                            if (filter.equals("Closed")){
                                                                                                close = "selected"; 
                                                                                            }
                                                                                    
      out.write("\r\n");
      out.write("                                                                                        <select name=\"filter\" class=\"form-control\" id=\"choice\">\r\n");
      out.write("                                                                                            <option ");
      out.print(all);
      out.write(" >All</option>\r\n");
      out.write("                                                                                            <option ");
      out.print(open);
      out.write(" >Open</option>\r\n");
      out.write("                                                                                                <option ");
      out.print(close);
      out.write(" >Closed</option>\r\n");
      out.write("                                                                                            </select>\r\n");
      out.write("                                                                                    <input name=\"filterOpp\" type=\"submit\" value=\"Filter\" class=\"btn btn-info\" style=\"margin-left:278px;margin-top:-55px;background-color:#009688;border:none;color:white;\"/>\r\n");
      out.write("                                                                                </div>\r\n");
      out.write("                                                                        </form>\r\n");
      out.write("                                                                                         ");

                                                                                            if(session.getAttribute("filter") == null || session.getAttribute("filter").equals("All"))
                                                                                                query = "select * from opportunity order by start_date desc";
                                                                                            else if (session.getAttribute("filter").equals("Open"))
                                                                                                query = "select * from opportunity where status = 'open' order by start_date desc";
                                                                                            else
                                                                                                query = "select * from opportunity where status = 'close' order by start_date desc";
                                                                                            ResultSet rsList = stmtList.executeQuery(query);
                                                                                        while (rsList.next()) {
                                                                                        
      out.write("\r\n");
      out.write("                                                                                        <div class=\"list-group-item clearfix\">\r\n");
      out.write("                                                                                            <b>");
      out.print(rsList.getString("name"));
      out.write("</b>\r\n");
      out.write("                                                                                                <span class=\"pull-right\">\r\n");
      out.write("                                                                                                    <form method=\"POST\" action=\"viewOpportunity\">\r\n");
      out.write("                                                                                                        <input id=\"x\" value=\"1\" hidden=\"true\" name=\"confirm\"/>\r\n");
      out.write("                                                                                                        <input name=\"id\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\"/> \r\n");
      out.write("                                                                                                        <input name=\"status\" value=\"");
      out.print(rsList.getString("status"));
      out.write("\" hidden=\"true\"/>\r\n");
      out.write("                                                                                                        <input name=\"editOpp\" type=\"submit\" class=\"btn btn-xs btn-info\" value=\"Edit\"/>\r\n");
      out.write("                                                                                                        <input name=\"editStatus\" type=\"submit\" class=\"btn btn-xs btn-success\" value=\"Status\"/>\r\n");
      out.write("                                                                                                        <input name=\"delete\" type=\"submit\" onclick=\"confirmation()\" class=\"btn btn-xs btn-danger\" value=\"Delete\"/>\r\n");
      out.write("                                                                                                        <script>\r\n");
      out.write("                                                                                                            function confirmation(){\r\n");
      out.write("                                                                                                            var x = confirm(\"Delete this item?\");\r\n");
      out.write("                                                                                                            if (x===true)\r\n");
      out.write("                                                                                                                document.getElementById('x').value = 1;\r\n");
      out.write("                                                                                                            else\r\n");
      out.write("                                                                                                                document.getElementById('x').value = 0;\r\n");
      out.write("                                                                                                            }\r\n");
      out.write("                                                                                                        </script>\r\n");
      out.write("                                                                                                    </form>\r\n");
      out.write("                                                                                                </span>\r\n");
      out.write("                                                                                        </div>\r\n");
      out.write("                                                                                        <div class=\"list-group\">\r\n");
      out.write("                                                                                            <div class=\"list-group-item clearfix\">\r\n");
      out.write("                                                                                                Type: ");
      out.print(rsList.getString("type"));
      out.write(" <br>\r\n");
      out.write("                                                                                                Start date: ");
      out.print(rsList.getString("start_date"));
      out.write(" <br>\r\n");
      out.write("                                                                                                End date: ");
      out.print(rsList.getString("end_date"));
      out.write(" <br>\r\n");
      out.write("                                                                                                Status: ");
      out.print(rsList.getString("status"));
      out.write("\r\n");
      out.write("                                                                                            </div>\r\n");
      out.write("                                                                                        </div>\r\n");
      out.write("                                                                        \r\n");
      out.write("                                                                                 \r\n");
      out.write("                                                                      ");
} rsList.first(); rsList.previous(); 
      out.write("        \r\n");
      out.write("                                                                 </div>\r\n");
      out.write("                                                                                                \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("        ");

             rsList.close();
             stmtList.close();
             stmtOpen.close();
             stmtClose.close();
             connection.close();
	 
      out.write("\r\n");
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
