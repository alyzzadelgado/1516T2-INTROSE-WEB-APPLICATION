<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.DBConnectionFactory"%>
<!DOCTYPE html>

<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
		<title>Office of the Vice President for External Affairs</title>

		<!-- Bootstrap -->
		
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/ovpea.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap-datetimepicker.min.css">

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
                
                Statement stmtList = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtOpen = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtClose = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                String name = String.valueOf(session.getAttribute("rmName"));
                String query;
                String filter;
            %>
	
		<!--Navigation Bar-->
		
		<nav class="navbar navbar-default">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<b><a class="navbar-brand" href="homepage.html">OVPEA</a></b>
				</div> <!-- navbar-header closing tag -->
				<div id="navbar" class="collapse navbar-collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="homepage.html">Home</a></li>
						<li><a href="view_opportunities.jsp">Opportunities</a></li>
						<li><a href="update_rm_account.jsp">Account</a></li>
						<li><a href="index.jsp">Log out</a></li>
					</ul>
				</div> <!-- navbar closing tag -->
			</div> <!-- container closing tag -->
		</nav>

		<div class="container">
				<h1>Welcome, <%=name%>!</h1>
				<ul class="breadcrumb">
					<li><a href="homepage.html">Home</a></li>
					<li class="active">Opportunities</li>
				</ul>
		</div> <!--Closing tag for Welcome text and sitemap-->
		
		<!--Panel-->
		<div class="container">
			
				<div class="row">
						<div class="local-nav col-lg-3 col-md-3 col-sm-3" > <!--Column 1: Local Nav bar-->
							<div class="nav-container">
								<a href="view_opportunities.jsp">
									<strong><h2> Opportunities</h2></strong>
								</a>
								<a href="comments.html">
									<strong><h4> Comments and Inquiries</h4></strong>
								</a>
								<a href="student_tracking.html">
									<strong><h4> Student Tracking</h4></strong>
								</a>	
							</div>		
						</div>
						<br>
                                                                
                                                                <div class="col-lg-3 col-md-8 col-sm-3"> <!--Column 2-->
                                                                        <form method="POST" action="viewOpportunity">
                                                                                <label for="status">Filter Opportunities:</label><br>
                                                                                <div class="form-group">
                                                                                    <% if(session.getAttribute("filter") == null)
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
                                                                                    %>
                                                                                        <select name="filter" class="form-control" id="choice">
                                                                                            <option <%=all%> >All</option>
                                                                                            <option <%=open%> >Open</option>
                                                                                                <option <%=close%> >Closed</option>
                                                                                            </select>
                                                                                    <input name="filterOpp" type="submit" value="Filter" class="btn btn-info" style="margin-left:278px;margin-top:-55px;background-color:#009688;border:none;color:white;"/>
                                                                                </div>
                                                                        </form>
                                                                                         <%
                                                                                            if(session.getAttribute("filter") == null || session.getAttribute("filter").equals("All"))
                                                                                                query = "select * from opportunity order by start_date desc";
                                                                                            else if (session.getAttribute("filter").equals("Open"))
                                                                                                query = "select * from opportunity where status = 'open' order by start_date desc";
                                                                                            else
                                                                                                query = "select * from opportunity where status = 'close' order by start_date desc";
                                                                                            ResultSet rsList = stmtList.executeQuery(query);
                                                                                        while (rsList.next()) {
                                                                                        %>
                                                                                        <div class="list-group-item clearfix">
                                                                                            <b><%=rsList.getString("name")%></b>
                                                                                                <span class="pull-right">
                                                                                                    <form method="POST" action="viewOpportunity">
                                                                                                        <input id="x" value="1" hidden="true" name="confirm"/>
                                                                                                        <input name="id" value="<%=rsList.getInt("id")%>" hidden="true"/> 
                                                                                                        <input name="status" value="<%=rsList.getString("status")%>" hidden="true"/>
                                                                                                        <input name="editOpp" type="submit" class="btn btn-xs btn-info" value="Edit"/>
                                                                                                        <input name="editStatus" type="submit" class="btn btn-xs btn-success" value="Status"/>
                                                                                                        <input name="delete" type="submit" onclick="confirmation()" class="btn btn-xs btn-danger" value="Delete"/>
                                                                                                        <script>
                                                                                                            function confirmation(){
                                                                                                            var x = confirm("Delete this item?");
                                                                                                            if (x===true)
                                                                                                                document.getElementById('x').value = 1;
                                                                                                            else
                                                                                                                document.getElementById('x').value = 0;
                                                                                                            }
                                                                                                        </script>
                                                                                                    </form>
                                                                                                </span>
                                                                                        </div>
                                                                                        <div class="list-group">
                                                                                            <div class="list-group-item clearfix">
                                                                                                Type: <%=rsList.getString("type")%> <br>
                                                                                                Start date: <%=rsList.getString("start_date")%> <br>
                                                                                                End date: <%=rsList.getString("end_date")%> <br>
                                                                                                Status: <%=rsList.getString("status")%>
                                                                                            </div>
                                                                                        </div>
                                                                        
                                                                                 
                                                                      <%} rsList.first(); rsList.previous(); %>        
                                                                 </div>
                                                                                                
					</div>
				</div>
		</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
	<script src="../js/bootstrap-datetimepicker.min.js"></script>
        <%
             rsList.close();
             stmtList.close();
             stmtOpen.close();
             stmtClose.close();
             connection.close();
	 %>
  </body>
  
  
</html>