<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<%@page import="classes.Opportunity"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.DBConnectionFactory"%>
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
				<h1>Welcome, <%=name%></h1>
				<ul class="breadcrumb">
					<li><a href="homepage.html">Home</a></li>
					<li class="active">Account</li>
				</ul>
		</div> <!--Closing tag for Welcome text and sitemap-->
		
		<!--Panel-->
		<div class="container">
			
				<div class="row">
						<div class="local-nav col-lg-3 col-md-3 col-sm-3" > <!--Column 1: Local Nav bar-->
							<div class="nav-container">
								<a href="view_opportunities.html">
									<strong><h4> Opportunities</h4></strong>
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
						<div class="col-lg-5 col-md-5 col-sm-5"> <!--Column 2-->
								
								<h2>Username</h2>
								<div class="panel-group">
                                                                    <% if (session.getAttribute("usernameError") == null)
                                                                                             msg="";
                                                                                             else
                                                                                             msg=String.valueOf(session.getAttribute("usernameError"));
                                                                                                %>
                                                                                            <label><b><%=msg%><b><br></label>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"  style="font-size:13px; margin-left:2px; color: #009688;">	
												<a data-toggle="collapse" href="#collapse1">Edit Username</a>
											</h4>
										</div>
										<div id="collapse1" class="panel-collapse collapse">
											
                                                                                        <form method="POST" action="editUsername">
                                                                                            <div class="panel-body" style="margin-left:3px;">Username:<%=username%></div>
											
                                                                                            <div class="form-group" style="margin-left:17px;">
												<label for="username">New username:</label>
												<input name="inputUsername" type="text" class="form-control" id="inputUsername">
                                                                                            </div>
                                                                                              
                                                                                            <input value="Save" class="btn btn-primary" style="margin-left:327px;background-color:#009688;border:none;color:white;"type="submit">											
                                                                                            <input value="Cancel" class="btn btn-primary" style="background-color:#E0E0E0;border:none;color:black;"type="button" data-toggle="collapse" data-target="#collapse1" aria-expanded="false" aria-controls="collapse1">
                                                                                         
                                                                                        </form>
										</div>
									</div>
								</div>
								
								<br>
								
								<h2>Password </h2>
								<div class="panel-group">
                                                                    <% if (session.getAttribute("passwordError") == null)
                                                                                             msg="";
                                                                                             else
                                                                                             msg=String.valueOf(session.getAttribute("passwordError"));
                                                                                                %>
                                                                                            <label><b><%=msg%><b><br></label>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"  style="font-size:13px; margin-left:2px; color: #009688;">
												<a data-toggle="collapse" href="#collapse2">Change Password</a>
											</h4>
										</div>
										<div id="collapse2" class="panel-collapse collapse">
                                                                                        <form method="POST" action="editPassword">
											<div class="form-group" style="margin-left:17px;">
												<label for="currPassword">Current:</label>
												<input name="currentPassword" type="Password" class="form-control" id="currPassword">
											</div>
											
											<div class="form-group" style="margin-left:17px;">
												<label for="newPassword">New:</label>
												<input name="newPassword" type="Password" class="form-control" id="newPassword">
											</div>
											
											<div class="form-group" style="margin-left:17px;">
												<label for="reNewPassword">Retype New:</label>
												<input name="confirmPassword" type="Password" class="form-control" id="reNewPassword">
											</div>
											
											<input value="Save" class="btn btn-primary" style="margin-left:327px;background-color:#009688;border:none;color:white;"type="submit">
												
					
											<input value="Cancel" class="btn btn-primary" style="background-color:#E0E0E0;border:none;color:black;"type="button" data-toggle="collapse" data-target="#collapse2" aria-expanded="false" aria-controls="collapse2">
                                                                                        </form>	
										</div>
									</div>
								</div>
						</div>
					</div>
				</div>
		</div>
	
	
		

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
	<script src="../js/bootstrap-datetimepicker.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	 
  </body>
  
  
</html>