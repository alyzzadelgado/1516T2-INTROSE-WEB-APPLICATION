package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes.Opportunity;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import DAO.DBConnectionFactory;

public final class add_005fopportunity_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-datepicker.css\">\r\n");
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
            
            String name = String.valueOf(session.getAttribute("rmName"));

            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String query = "select * from country";
            ResultSet rs = stmt.executeQuery(query);
            
            int oppId=1;
            
            Statement stmtOpp = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtCode = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                // query for opportunity and status
                String oQuery = "select * from opportunity where id = " + oppId + "";
                ResultSet rsOpp = null;
                
                // query for colleges
                String cQuery = "select C.name from colleges C, opportunity_item I"
                        + " where C.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet rsCode = null;

        
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
      out.write("\t\t\t\t\t<li><a href=\"view_opportunities.jsp\">Opportunities</a></li>\r\n");
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
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-3\"> <!--Column 2-->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <form name=\"form\" onsubmit=\"//return validateFirstForm();\" role=\"form\" method=\"POST\" action=\"addOpportunity\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                             ");

                                                                                rsOpp = stmtOpp.executeQuery(oQuery);
                                                                            
      out.write("\r\n");
      out.write("                                                                            \r\n");
      out.write("                                                                            ");
 while(rsOpp.next()) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- opportunity input form opening tag -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"opportunity\">Opportunity:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input required name=\"name\" type=\"text\" value=\"");
      out.print(rsOpp.getString("name"));
      out.write("\" class=\"form-control\" id=\"inputOppName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- opportunity input form closing tag -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- academe/company input form opening tag -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"company\">Academe/Company:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input required name=\"type\" type=\"text\" value=\"");
      out.print(rsOpp.getString("type"));
      out.write("\" class=\"form-control\" id=\"inputCompany\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- academe/company input form closing tag -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                                <div class=\"form-group\"><!-- Work Experience -->\r\n");
      out.write("                                                                                    <label for=\"workExp\">Country:</label><br>\r\n");
      out.write("                                                                                    <select name=\"country\" class=\"form-control\" id=\"sel1\">\r\n");
      out.write("                                                                                        ");
 String cSelect="", country="";
                                                                                        while (rs.next()) {
                                                                                            country = rs.getString("name");
                                                                                            if (rsOpp.getString("country").contains(country))
                                                                                                cSelect="selected";
                                                                                        
      out.write("\r\n");
      out.write("                                                                                        <option ");
      out.print(cSelect);
      out.write(" value=\"");
      out.print(country);
      out.write("\"> ");
      out.print(rs.getString("code"));
      out.write(" | ");
      out.print(rs.getString("name"));
      out.write(" </option>\r\n");
      out.write("                                                                                            ");
 cSelect="";
                                                                                        }
                                                                                        rs.first(); rs.previous();
      out.write("\r\n");
      out.write("                                                                                    </select>\r\n");
      out.write("                                                                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- description input form opening tag -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"description\">Description:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea required name=\"description\" class=\"form-control\" id=\"description\" rows=\"6\">");
      out.print(rsOpp.getString("description"));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- description input form closing tag -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-3\"><!-- Column 3-->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"> <!-- date input form opening tag -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"applicationPeriod\">Application Period:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group input-append date\" id=\"sDate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input required name=\"startDate\" value=\"");
      out.print(rsOpp.getString("start_date"));
      out.write("\" type=\"text\" class=\"form-control\" placeholder=\"Start date\" ></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon add-on\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-calendar\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"input-group input-append date\" id=\"eDate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input required name=\"endDate\" type=\"text\" value=\"");
      out.print(rsOpp.getString("end_date"));
      out.write("\" class=\"form-control\" placeholder=\"End date\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon add-on\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-calendar\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div> <!-- date input closing tag -->\r\n");
      out.write("        <!-- Load jQuery and bootstrap datepicker scripts -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"> <!-- contact person input opening tag-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"contactPerson\">Contact Person:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input required name=\"contactPerson\" type=\"text\"  value=\"");
      out.print(rsOpp.getString("contact_person"));
      out.write("\" class=\"form-control\" id=\"inputContactPerson\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- contact person input closing tag-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- contact number input opening tag-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"contactNumber\">Contact Number:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input required maxlength=\"12\" name=\"contactPhone\" value=\"");
      out.print(rsOpp.getString("contact_number"));
      out.write("\" type=\"number\" class=\"form-control\" id=\"phoneNumber\" placeholder=\"Phone\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input required maxlength=\"12\" name=\"contactLandline\" type=\"number\" value=\"");
      out.print(rsOpp.getString("contact_landline"));
      out.write("\" class=\"form-control\" id=\"landline\" placeholder=\"Landline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- contact number input closing tag-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-3\"><!--Column 4-->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><!-- contact number input opening tag-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"email\">E-mail Address:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input required name=\"email\" type=\"email\" value=\"");
      out.print(rsOpp.getString("email"));
      out.write("\" class=\"form-control\" id=\"emailAdd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                        ");

                                                                                        String ccs="", ced="", cla="", cob="", cos="",gcoe="", soe="", colleges="";
                                                                                    rsCode = stmtCode.executeQuery(cQuery);
                                                                                    StringBuilder s = new StringBuilder();
                                                                                    while (rsCode.next()) {
                                                                                        s.append(rsCode.getString("C.name")+" ");
                                                                                    } rsCode.first(); rsCode.previous();
                                                                                    
                                                                                    colleges = s.toString();
                                                                                    if(colleges.contains("CCS"))
                                                                                        ccs="checked";
                                                                                    if (colleges.contains("CED"))
                                                                                        ced="checked";
                                                                                    if (colleges.contains("CLA"))
                                                                                        cla="checked";
                                                                                    if (colleges.contains("COB"))
                                                                                        cob="checked";
                                                                                    if (colleges.contains("COS"))
                                                                                        cos="checked";
                                                                                    if (colleges.contains("GCOE"))
                                                                                        gcoe="checked";
                                                                                    if (colleges.contains("SOE"))
                                                                                        soe="checked";
                                                                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"college\">College</label>\r\n");
      out.write("                                                                                <div class=\"form-group\"><!--College checkbox opening tag-->\r\n");
      out.write("                                                                                    <div style=\"padding-right:100px;\"class=\"col-lg-1 col-md-1 col-sm-1\">\r\n");
      out.write("                                                                                        <div class=\"checkbox\">\r\n");
      out.write("                                                                                            <label for=\"ccs-checkbox\">\r\n");
      out.write("                                                                                                <input type=\"checkbox\" name=\"checkboxes\" id=\"ccs-checkbox\" value=\"CCS\" ");
      out.print(ccs);
      out.write(" >\r\n");
      out.write("                                                                                                CCS\r\n");
      out.write("                                                                                            </label>\r\n");
      out.write("                                                                                            <label for=\"ced-checbox\">\r\n");
      out.write("                                                                                                <input type=\"checkbox\" name=\"checkboxes\" id=\"ced-checkbox\" value=\"CED\" ");
      out.print(ced);
      out.write(" >\r\n");
      out.write("                                                                                                CED\r\n");
      out.write("                                                                                            </label>\r\n");
      out.write("                                                                                            <label for=\"cla-checbox\">\r\n");
      out.write("                                                                                                <input type=\"checkbox\" name=\"checkboxes\" id=\"cla-checkbox\" value=\"CLA\" ");
      out.print(cla);
      out.write(" >\r\n");
      out.write("                                                                                                CLA\r\n");
      out.write("                                                                                            </label>\r\n");
      out.write("                                                                                            <label for=\"cob-checbox\">\r\n");
      out.write("                                                                                                <input type=\"checkbox\" name=\"checkboxes\" id=\"cob-checkbox\" value=\"COB\" ");
      out.print(cob);
      out.write(" >\r\n");
      out.write("                                                                                                COB\r\n");
      out.write("                                                                                            </label>\r\n");
      out.write("                                                                                        </div>\r\n");
      out.write("                                                                                    </div>\r\n");
      out.write("                                                                                    <div class=\"col-lg-1 col-md-1 col-sm-1\">\r\n");
      out.write("                                                                                        <div class=\"checkbox\">\r\n");
      out.write("                                                                                            <label for=\"checkbox-1\">\r\n");
      out.write("                                                                                                <input type=\"checkbox\" name=\"checkboxes\" id=\"cos-checkbox\" value=\"COS\" ");
      out.print(cos);
      out.write(" >\r\n");
      out.write("                                                                                                COS\r\n");
      out.write("                                                                                            </label>\r\n");
      out.write("                                                                                            <label for=\"gcoe-checkbox\">\r\n");
      out.write("                                                                                                <input type=\"checkbox\" name=\"checkboxes\" id=\"gcoe-checkbox\" value=\"GCOE\" ");
      out.print(gcoe);
      out.write(" >\r\n");
      out.write("                                                                                                GCOE\r\n");
      out.write("                                                                                            </label>\r\n");
      out.write("                                                                                            <label for=\"soe-checkbox\">\r\n");
      out.write("                                                                                                <input type=\"checkbox\" name=\"checkboxes\" id=\"soe-checkbox\" value=\"SOE\" ");
      out.print(soe);
      out.write(" >\r\n");
      out.write("                                                                                                SOE\r\n");
      out.write("                                                                                            </label>\r\n");
      out.write("                                                                                        </div>\r\n");
      out.write("                                                                                    </div>\r\n");
      out.write("                                                                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"continue\" value=\"Continue\" id=\"continue\" class=\"btn btn-info\" style=\"margin-left:90px;margin-top:30px;background-color:#009688;border:none;color:white;\"/>\r\n");
      out.write("                                                                                ");
} rsOpp.first(); rsOpp.previous(); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form> <!--Closing tag column 4-->\r\n");
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
      out.write("    <script src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"/js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            /*function validateFirstForm(){\r\n");
      out.write("                var flag = 0;\r\n");
      out.write("                for (var i = 0; i < 7; i++) {\r\n");
      out.write("                    if(document.form[\"checkboxes\"][i].checked){\r\n");
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
      out.write("            \r\n");
      out.write("            $('#continue').click(function() {\r\n");
      out.write("               if (!$.isNumeric()($('#phoneNumber').val())) \r\n");
      out.write("                   return true;\r\n");
      out.write("               else false;\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            // When the document is ready\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                \r\n");
      out.write("                $('#sDate').datepicker({\r\n");
      out.write("                    minDate: 0,\r\n");
      out.write("                    format: \"yyyy-mm-dd\"\r\n");
      out.write("                });  \r\n");
      out.write("            \r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                \r\n");
      out.write("                $('#eDate').datepicker({\r\n");
      out.write("                    format: \"yyyy-mm-dd\"\r\n");
      out.write("                });  \r\n");
      out.write("            \r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        ");

        rs.close();
        rsCode.close();
        rsOpp.close();
        stmtOpp.close();
        stmtCode.close();
        stmt.close();
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
