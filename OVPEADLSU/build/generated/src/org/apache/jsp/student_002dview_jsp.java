package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_002dview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>Office of the Vice President for External Affairs</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/global.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\"><b>OVPEA</b></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"view.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>  HOME</a></li>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
      out.write("            </form>\n");
      out.write("          </ul>\n");
      out.write("        </div><!-- /.navbar-collapse -->\n");
      out.write("      </div><!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <ul class=\"nav nav-tabs\">\n");
      out.write("      <li role=\"presentation\" class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      <li role=\"presentation\"><a href=\"#\">BAGCED</a></li>\n");
      out.write("      <li role=\"presentation\"><a href=\"#\">CCS</a></li>\n");
      out.write("      <li role=\"presentation\"><a href=\"#\">CLA</a></li>\n");
      out.write("      <li role=\"presentation\"><a href=\"#\">COS</a></li>\n");
      out.write("      <li role=\"presentation\"><a href=\"#\">GCOE</a></li>\n");
      out.write("      <li role=\"presentation\"><a href=\"#\">RVR-COB</a></li>\n");
      out.write("      <li role=\"presentation\"><a href=\"#\">SOE</a></li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <ol class=\"breadcrumb\">\n");
      out.write("      <li><a href=\"#\">Home</a></li>\n");
      out.write("      <li class=\"active\">Opportunities</li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <div class=\"opportunity-panel\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-2\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t  <label for=\"sel1\">Filter By:</label>\n");
      out.write("\t\t\t  <select class=\"form-control\" id=\"sel1\">\n");
      out.write("\t\t\t    <option>EDUCATION</option>\n");
      out.write("\t\t\t    <option>CAREERS</option>\n");
      out.write("\t\t\t  </select>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-10\">\n");
      out.write("          <div class=\"media\">\n");
      out.write("            <div class=\"media-left media-middle\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img class=\"media-object\" src=\"...\" alt=\"...\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"media-body\">\n");
      out.write("              <h4 class=\"media-heading\">IT EXPO</h4>\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"media\">\n");
      out.write("            <div class=\"media-left media-middle\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img class=\"media-object\" src=\"...\" alt=\"...\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"media-body\">\n");
      out.write("              <h4 class=\"media-heading\">DLSU JOB EXPO</h4>\n");
      out.write("              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"media\">\n");
      out.write("            <div class=\"media-left media-middle\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img class=\"media-object\" src=\"...\" alt=\"...\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"media-body\">\n");
      out.write("              <h4 class=\"media-heading\">CAREER SEMINAR</h4>\n");
      out.write("              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"media\">\n");
      out.write("            <div class=\"media-left media-middle\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img class=\"media-object\" src=\"...\" alt=\"...\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"media-body\">\n");
      out.write("              <h4 class=\"media-heading\">AZEUS INTERNSHIP</h4>\n");
      out.write("              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum . . . \n");
      out.write("              <button type=\"button\" class=\"btn btn-primary btn-xs\" data-toggle=\"modal\" data-target=\"#myModal\">See more</button>\n");
      out.write("            </div>\n");
      out.write("            <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">AZEUS INTERNSHIP</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        Description:\n");
      out.write("\t\tLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum\n");
      out.write("\t\t<br>\n");
      out.write("\t\tApplication Period:\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("          </div>\n");
      out.write("          <center><nav>\n");
      out.write("            <ul class=\"pagination\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                  <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\">1</a></li>\n");
      out.write("              <li><a href=\"#\">2</a></li>\n");
      out.write("              <li><a href=\"#\">3</a></li>\n");
      out.write("              <li><a href=\"#\">4</a></li>\n");
      out.write("              <li><a href=\"#\">5</a></li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                  <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </nav></center>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-bottom navbar-footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      Copyright &copy; 2016 Office of the Vice President for External Affairs. All rights reserved.\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
