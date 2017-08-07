package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DAO.DBConnectionFactory;

public final class student_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
                
                Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String qALL="";
                ResultSet rsList=null;
                qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id group by O.name";
                
                boolean firstLoad=true;
      
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
      out.write("    \n");
      out.write("    <ol class=\"breadcrumb\">\n");
      out.write("      <li><a href=\"#\">Home</a></li>\n");
      out.write("      <li class=\"active\">Opportunities</li>\n");
      out.write("    </ol>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-2\">\n");
      out.write("            <form method=\"POST\" action=\"studentView\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                                ");
 String filter;
                                    if(session.getAttribute("filterType") == null)
                                        filter="ALL";
                                    else
                                        filter=String.valueOf(session.getAttribute("filterType"));
                                                                                    
                                    String all="", ed="", car="";
                                                                                        
                                    if (filter.equals("ALL")) {
                                        all = "selected";
                                    }
                                    if (filter.equals("EDUCATION")){
                                        ed = "selected";
                                    }
                                    if (filter.equals("CAREERS")){
                                        car = "selected"; 
                                    }
                                
      out.write("\n");
      out.write("\t\t\t  <label for=\"sel1\">Filter By:</label>\n");
      out.write("\t\t\t  <select name=\"filterType\" class=\"form-control\" id=\"sel1\">\n");
      out.write("                            <option ");
      out.print(all);
      out.write(" >ALL</option>\n");
      out.write("\t\t\t    <option ");
      out.print(ed);
      out.write(" >EDUCATION</option>\n");
      out.write("\t\t\t    <option ");
      out.print(car);
      out.write(" >CAREERS</option>\n");
      out.write("\t\t\t  </select>\n");
      out.write("                          <input name=\"filterView\" type=\"submit\" value=\"Filter\" class=\"btn btn-info\" style=\"margin-top:-56px; margin-left:180px;\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("                          \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <ul class=\"nav nav-tabs\">\n");
      out.write("          <li class=\"active\"><a href=\"#all\">ALL</a></li>\n");
      out.write("          <li><a href=\"#bagced\">BAGCED</a></li>\n");
      out.write("          <li><a href=\"#ccs\">CCS</a></li>\n");
      out.write("          <li><a href=\"#cla\">CLA</a></li>\n");
      out.write("          <li><a href=\"#cos\">COS</a></li>\n");
      out.write("          <li><a href=\"#gcoe\">GCOE</a></li>\n");
      out.write("          <li><a href=\"#cob\">RVR-COB</a></li>\n");
      out.write("          <li><a href=\"#soe\">SOE</a></li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <div class=\"tab-content\"> <!-- opening div for tab content -->\n");
      out.write("            <div id=\"all\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id group by O.name";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and O.type = 'academe' group by O.name";
                else if (filter.contains("CAREER"))
                    qALL ="select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and O.type = 'company' group by O.name";
                    rsList = stmt.executeQuery(qALL);
                    
                    firstLoad=false;
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
      out.write("\n");
      out.write("            </div> \n");
      out.write("            <div id=\"bagced\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c002'";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c002' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c002' and O.type = 'company'";
                
                if (firstLoad == false){
                    rsList = stmt.executeQuery(qALL);
                    
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                            session.setAttribute("currOppId", rsList.getInt("id"));
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"ccs\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c001'";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c001' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c001' and O.type = 'company'";
                    
                if (firstLoad == false){
                    rsList = stmt.executeQuery(qALL);
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                            session.setAttribute("currOppId", rsList.getInt("id"));
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"cla\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c003'";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c003' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c003' and O.type = 'company'";
                    
                if (firstLoad == false){
                    rsList = stmt.executeQuery(qALL);
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                            session.setAttribute("currOppId", rsList.getInt("id"));
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"cos\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c005'";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c005' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c005' and O.type = 'company'";
                    
                if (firstLoad == false){
                    rsList = stmt.executeQuery(qALL);
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                            session.setAttribute("currOppId", rsList.getInt("id"));
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"gcoe\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c006'";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c006' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c006' and O.type = 'company'";
                    
                if (firstLoad == false){
                    rsList = stmt.executeQuery(qALL);
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                            session.setAttribute("currOppId", rsList.getInt("id"));
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"cob\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c004'";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c004' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c004' and O.type = 'company'";
                    
                if (firstLoad == false){
                    rsList = stmt.executeQuery(qALL);
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                            session.setAttribute("currOppId", rsList.getInt("id"));
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"soe\" class=\"tab-pane fade in active\">\n");
      out.write("                ");

                if (filter.contains("ALL"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c007'";
                else if (filter.contains("EDUCATION"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c007' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qALL = "select O.* from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c007' and O.type = 'company'";
                    
                if (firstLoad == false){
                    rsList = stmt.executeQuery(qALL);
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {
      out.write("\n");
      out.write("                        <h4> There are no opportunities at the moment. </h4>\n");
      out.write("                    ");
}
                       else {
                            session.setAttribute("currOppId", rsList.getInt("id"));
                    
      out.write("\n");
      out.write("                       <h3>");
      out.print(rsList.getString("name"));
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(rsList.getString("description"));
      out.write("</p>\n");
      out.write("                        <form method=\"POST\" action=\"studentView\" >\n");
      out.write("                        <input name=\"oppId\" value=\"");
      out.print(rsList.getInt("id"));
      out.write("\" hidden=\"true\" />\n");
      out.write("                        <input type=\"submit\" name=\"oppSelect\" value=\"See More\" class=\"btn btn-primary btn-xs\" />\n");
      out.write("                        </form>\n");
      out.write("                        ");
 }} rsList.first(); rsList.previous(); 
                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
 firstLoad = false; 
            
      out.write("\n");
      out.write("        </div> <!--closing div for tab contents -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
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
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\".nav-tabs a\").click(function(){\n");
      out.write("                $(this).tab('show');\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    ");

    rsList.close();
    stmt.close();
    connection.close();
    
      out.write("\n");
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
