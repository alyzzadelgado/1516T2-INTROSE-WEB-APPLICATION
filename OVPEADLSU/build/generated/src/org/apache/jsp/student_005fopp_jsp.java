package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import DAO.DBConnectionFactory;
import java.sql.Statement;

public final class student_005fopp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("      ");

          
          DBConnectionFactory factory = DBConnectionFactory.getInstance();
            Connection connection = factory.getConnection();
            
          int oppId = Integer.parseInt(String.valueOf(session.getAttribute("oppId")));
            
            Statement stmtOpp = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtCode = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtSkill = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtLang = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtProf = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtReq = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                // query for opportunity and status
                String oQuery = "select * from opportunity where id = " + oppId + "";
                ResultSet rsOpp = null;
                
                // query for colleges
                String cQuery = "select C.name, C.description from colleges C, opportunity_item I"
                        + " where C.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet rsCode = null;
                
                // query for skills
                String sQuery = "select S.name from skills S, opportunity_item I"
                        + " where S.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet rsSkill = null;
                
                // query for languages
                String lQuery = "select L.name from languages L, opportunity_item I"
                        + " where L.id = I.item_id and I.opp_id = " + oppId + "";
                //ResultSet rsLang = null;
                
                // query for proficiencies
                String pQuery = "select P.name from proficiencies P, opportunity_item I"
                        + " where P.id = I.item_id and I.opp_id = " + oppId + "";
                //ResultSet rsProf = null;
                
                // query for requirements
                String rQuery = "select R.name from requirements R, opportunity_item I"
                        + " where R.id = I.item_id and I.opp_id = " + oppId + "";
                //ResultSet rsReq = null;
          
      out.write("\n");
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
      out.write("    <ol class=\"breadcrumb\">\n");
      out.write("      <li><a href=\"#\">Home</a></li>\n");
      out.write("      <li><a href=\"student_view.jsp\">Opportunities</a></li>\n");
      out.write("      <li class=\"active\">View Opportunity</li>\n");
      out.write("    </ol>\n");
      out.write("    \n");
      out.write("          ");

                rsOpp = stmtOpp.executeQuery(oQuery);
                while(rsOpp.next()){
          
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h4>General Details</h4>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Opportunity Name</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("name"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Opportunity Type</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("type"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Details</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("type_name"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Status</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("status"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Country</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("country"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Description</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("description"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Application Period</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Start Date</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("start_date"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>End Date</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("end_date"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Contact Details</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Contact Person</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("contact_person"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Phone Number</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("contact_number"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">    \n");
      out.write("            <label>Landline Number</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("contact_landline"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Email-Address</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("email"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
 } rsOpp.first(); rsOpp.previous(); 
      out.write("\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h4>Colleges</h4>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        ");

            rsCode = stmtCode.executeQuery(cQuery);
            while (rsCode.next()){
        
      out.write("\n");
      out.write("        <label>");
      out.print(rsCode.getString("name"));
      out.write("</label><br>\n");
      out.write("        ");
      out.print(rsCode.getString("description"));
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        ");
 } rsCode.first(); rsCode.previous(); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h4>Qualifications</h4>\n");
      out.write("        ");

            rsOpp = stmtOpp.executeQuery(oQuery);
            while (rsOpp.next()) {
        
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Preferred Age</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("age"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Degree</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("degree"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Work Experience</label>\n");
      out.write("            ");
      out.print(String.valueOf(rsOpp.getInt("work_experience")));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Field Experience</label>\n");
      out.write("            ");
      out.print(rsOpp.getString("field_experience"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
 } rsOpp.first(); rsOpp.previous(); 
      out.write("\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h4>Skills</h4>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        ");

            rsSkill = stmtSkill.executeQuery(sQuery);
            while (rsSkill.next()){
        
      out.write("\n");
      out.write("        <label>");
      out.print(rsSkill.getString("name"));
      out.write("</label>\n");
      out.write("        <br><br>\n");
      out.write("        ");
 } rsSkill.first(); rsSkill.previous(); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-bottom navbar-footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      Copyright &copy; 2016 Office of the Vice President for External Affairs. All rights reserved.\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        -->\n");
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
