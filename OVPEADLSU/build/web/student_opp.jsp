<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.DBConnectionFactory"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Office of the Vice President for External Affairs</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/global.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
      <%
          
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
                ResultSet rsLang = null;
                
                // query for proficiencies
                String pQuery = "select P.name from proficiencies P, opportunity_item I"
                        + " where P.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet rsProf = null;
                
                // query for requirements
                String rQuery = "select R.name from requirements R, opportunity_item I"
                        + " where R.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet rsReq = null;
          %>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><b>OVPEA</b></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="view.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>  HOME</a></li>
            <div class="input-group">
            <form class="navbar-form navbar-left" role="search">
              <div class="form-group">
                <input type="text" class="form-control" placeholder="Search">
              </div>
              <button type="submit" class="btn btn-default">Search</button>
            </form>
          </ul>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
    </nav>

    <ol class="breadcrumb">
      <li><a href="#">Home</a></li>
      <li><a href="student_view.jsp">Opportunities</a></li>
      <li class="active">View Opportunity</li>
    </ol>
    
          <%
                rsOpp = stmtOpp.executeQuery(oQuery);
                while(rsOpp.next()){
          %>
    <div class="container">
        <h4>General Details</h4>
        <div class="container">
            <div class="form-group">
                <label>Opportunity Name</label>
                <%=rsOpp.getString("name")%>
            </div>
            <div class="form-group">
                <label>Opportunity Type</label>
                <%=rsOpp.getString("type")%>
            </div>
            <div class="form-group">
                <label>Details</label>
                <%=rsOpp.getString("type_name")%>
            </div>
            <div class="form-group">
                <label>Status</label>
                <%=rsOpp.getString("status")%>
            </div>
            <div class="form-group">
                <label>Country</label>
                <%=rsOpp.getString("country")%>
            </div>
            <div class="form-group">
                <label>Description</label>
                <%=rsOpp.getString("description")%>
            </div>
            <div class="form-group">
                <label>Application Period</label>
            </div>
            <div class="form-group">
                <label>Start Date</label>
                <%=rsOpp.getString("start_date")%>
            </div>
            <div class="form-group">
                <label>End Date</label>
                <%=rsOpp.getString("end_date")%>
            </div>
            <div class="form-group">
                <label>Contact Details</label>
            </div>
            <div class="form-group">
                <label>Contact Person</label>
                <%=rsOpp.getString("contact_person")%>
            </div>
            <div class="form-group">
                <label>Phone Number</label>
                <%=rsOpp.getString("contact_number")%>
            </div>
            <div class="form-group">    
                <label>Landline Number</label>
                <%=rsOpp.getString("contact_landline")%>
            </div>
            <div class="form-group">
                <label>Email-Address</label>
                <%=rsOpp.getString("email")%>
            </div>
            <% } rsOpp.first(); rsOpp.previous(); %>
        </div>
        <br>
    </div>
    
    
    <div class="container">
        <h4>Colleges</h4>
        <div class="container">
            <div class="form-group">
            <%
                rsCode = stmtCode.executeQuery(cQuery);
                while (rsCode.next()){
            %>
            <label><%=rsCode.getString("name")%></label><br>
            <%=rsCode.getString("description")%>
            <br><br>
            <% } rsCode.first(); rsCode.previous(); %>
            </div>
        </div>
    </div>
        
    <div class="container">
        <h4>Qualifications</h4>
        <div class="container">
            <h4>Details</h4>
            <%
                rsOpp = stmtOpp.executeQuery(oQuery);
                while (rsOpp.next()) {
            %>
            <div class="form-group">
                <label>Preferred Age</label>
                <%=rsOpp.getString("age")%>
            </div>
            <div class="form-group">
                <label>Degree</label>
                <%=rsOpp.getString("degree")%>
            </div>
            <div class="form-group">
                <label>Work Experience</label>
                <%=String.valueOf(rsOpp.getInt("work_experience"))%>
            </div>
            <div class="form-group">
                <label>Field Experience</label>
                <%=rsOpp.getString("field_experience")%>
            </div>
            <% } rsOpp.first(); rsOpp.previous(); %>
            <br>
        </div>
        <div class="container">
            <h4>Skills</h4>
            <div class="form-group">
            <%
                rsSkill = stmtSkill.executeQuery(sQuery);
                while (rsSkill.next()){
            %>
            <label><%=rsSkill.getString("name")%></label>
            <br>
            <% } rsSkill.first(); rsSkill.previous(); %>
            </div>
            <br>
        </div>
        <div class="container">
            <h4>Languages</h4>
            <div class="form-group">
            <%
                rsLang = stmtLang.executeQuery(lQuery);
                while (rsLang.next()){
            %>
            <label><%=rsLang.getString("name")%></label>
            <br>
            <% } rsLang.first(); rsLang.previous(); %>
            </div>
            <br>
        </div>
        <div class="container">
            <h4>Proficiencies</h4>
            <div class="form-group">
            <%
                rsProf = stmtProf.executeQuery(pQuery);
                while (rsProf.next()){
            %>
            <label><%=rsProf.getString("name")%></label>
            <br>
            <% } rsProf.first(); rsProf.previous(); %>
            </div>
            <br>
        </div>
    </div>
    <div class="container">
        <h4>Requirements</h4>
        <div class="container">
            <div class="form-group">
            <%
                rsReq = stmtReq.executeQuery(rQuery);
                while (rsReq.next()){
            %>
            <label><%=rsReq.getString("name")%></label>
            <br>
            <% } rsReq.first(); rsReq.previous(); %>
            </div>
            <br>
        </div>
    </div>
            
            <form method="POST" action="studentOpp">
    <input type="submit" name="back" value="Back" class="btn btn-info" style="margin-left:500px;margin-bottom:20px;background-color:#009688;border:none;color:white;">
            </form>

        <!--
    <nav class="navbar navbar-default navbar-fixed-bottom navbar-footer">
    <div class="container">
      Copyright &copy; 2016 Office of the Vice President for External Affairs. All rights reserved.
    </div>
  </nav>
        -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>