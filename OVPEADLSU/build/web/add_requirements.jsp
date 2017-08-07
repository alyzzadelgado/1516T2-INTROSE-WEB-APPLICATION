<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.DBConnectionFactory"%>
<%@page import="classes.Opportunity"%>
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
                //Opportunity newOpp = (Opportunity) session.getAttribute("newOpp3");
            String name = String.valueOf(session.getAttribute("rmName"));
            
            DBConnectionFactory factory = DBConnectionFactory.getInstance();
                Connection connection = factory.getConnection();
                
                Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                String query = "select * from requirements";
                ResultSet rs = null;
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
					<li><a href="view_opportunities.html">Opportunities</a></li>
					<li class="active">Add Requirements</li>
				</ul>
		</div> <!--Closing tag for Welcome text and sitemap-->
		
		<!--Panel-->
		<div class="container">
			
				<div class="row">
						<div class="local-nav col-lg-3 col-md-3 col-sm-3" > <!--Column 1: Local Nav bar-->
							<div class="nav-container">
								<a href="view_opportunities.html">
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
						
						<div class="col-lg-3 col-md-3 col-sm-3"> <!--Column 2-->
								<h3>REQUIREMENTS</h3>
									<form name="reqForm" onsubmit="//return validateThirdForm();" role="form" method="POST" action="addRequirements">
											<div class="form-group">
                                                                                            
                                                                                            <%
                                                                                                String req="", rChecked="", oReq="";
                                                                                                if (session.getAttribute("oppOtherReq")!=null)
                                                                                                    oReq = String.valueOf(session.getAttribute("oppOtherReq"));
                                                                                                rs = stmt.executeQuery(query);
                                                                                                while (rs.next()) {
                                                                                                    if (session.getAttribute("oppReq")!=null)
                                                                                                        req  =String.valueOf(session.getAttribute("oppReq"));
                                                                                                    
                                                                                                    if (req.contains(rs.getString("name")))
                                                                                                        rChecked = "checked";
                                                                                            %>
                                                                                           
                                                                                                <div class="checkbox">
													<label for="checkbox-req">
													<input <%=rChecked%> type="checkbox" name="reqCheck" value="<%=rs.getString("name")%>">
													<%=rs.getString("name")%>
													</label>
												</div>
                                                                                                        
                                                                                            <%
                                                                                                rChecked = "";
                                                                                                } rs.first(); rs.previous();
                                                                                            %>
                                                                                            
												<div class="checkbox">
													<label for="soe-checkbox">
													Others:
													</label>
													<textarea name="otherReq" class="form-control" id="otherReq" rows="6"><%=oReq%></textarea>
												</div>
										</div>	
										<!--<a href="add_qualifications.html" class="btn btn-info" style="background-color:#009688;border:none;color:white;" type="button">Back</a>
										<a href="view_opportunities.html" class="btn btn-info" style="margin-right:10px;background-color:#009688;border:none;color:white;" type="button">Add Opportunity</a>-->
                                                                                <input type="submit" name="back" value="Back" class="btn btn-info" style="background-color:#009688;border:none;color:white;"/>
                                                                                <input type="submit" name="add" value="Add Opportunity" onclick="confirmation()" class="btn btn-info" style="margin-right:10px;background-color:#009688;border:none;color:white;"/>
										<input name="confirm" id="x" hidden="true"/>
                                                                                <script>
                                                                                            function confirmation(){
                                                                                            var x = confirm("Add Opportunity?");
                                                                                            if (x===true)
                                                                                                document.getElementById('x').value = 1;
                                                                                            else
                                                                                                document.getElementById('x').value = 0;
                                                                                            }
                                                                                </script>
                                                                                </div>
							</form>
								
					</div>
				</div>
		</div>
	
	
		

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-datetimepicker.min.js"></script>
        <script type="text/javascript">
            /*function validateThirdForm(){
                var flag = 0;
                for (var i = 0; i < 5; i++) {
                    if(document.reqForm["reqCheck"][i].checked){
                        flag ++;
                    }
                }
                
                if (flag == 0) {
                    return false;
                }
                
                return true;
            }*/
         </script>
         
         <%
            rs.close();
            stmt.close();
            connection.close();
         %>
	 
  </body>
  
  
</html>