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
                
                int id = Integer.parseInt(String.valueOf(session.getAttribute("currOppId")));
                String name = String.valueOf(session.getAttribute("rmName"));
                
                Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                String query = "select * from opportunity where id = " +id+ "";
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
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
					<li><a href="view_opportunities.jsp">Opportunities</a></li>
					<li class="active">Edit Status</li>
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
							
								<br></br>
                                                                <%
                                                                                
                                                                                    // sets checked radio button based on status in db
                                                                                    String currStatus = String.valueOf(session.getAttribute("currStatus"));
                                                                                    String open = "", close = "";
                                                                                    //rsStatus = stmtStatus.executeQuery(sQuery);
                                                                                    //while (rsStatus.next()) {
                                                                                    String status = rs.getString("status");
                                                                                    if (status.contains("open"))
                                                                                        open="checked";
                                                                                    if (status.contains("close"))
                                                                                        close="checked";
                                                                                    //}
                                                                                %>
									<form role="form" method="POST" action="editStatus">
										<div class="form-group"><!-- opportunity input form opening tag -->
											<label for="opportunity"><strong><h3><%=rs.getString("name")%></h3></strong></label>
                                                                                        <br><input name="statRadio" type="radio" value="open" <%=open%> > Open </input>		
											<br><input name="statRadio" type="radio" value="close" <%=close%> > Close </input>
											<br>
											<br>
                                                                                        <% if(currStatus.equals("close")) {%>
                                                                                        <div class="form-group"> <!-- date input form opening tag -->
                                                                                            <label for="applicationPeriod">Application Period:</label>
                                                                                            <div class="input-group input-append date" id="sDate">
                                                                                                <input required name="endDate" id="startDate" type="text" class="form-control" placeholder="End date"></input>
                                                                                                <span class="input-group-addon add-on">
                                                                                                <i class="glyphicon glyphicon-calendar"></i></span>
                                                                                            </div>	
                                                                                        </div>
                                                                                            <%} %>
											<!--<a href="view_opportunities.html"  type="button">Update</a>-->
                                                                                        <input name="confirm" id="x" hidden="true"/>
                                                                                        <input type="submit" name="update" onclick="confirmation()" class="btn btn-s btn-info" style="margin-left:0px;margin-top:10px;background-color:#009688;border:none;color:white;" value="Update"/>
                                                                                        <script>
                                                                                            function confirmation(){
                                                                                            var x = confirm("Update this item?");
                                                                                            if (x===true)
                                                                                                document.getElementById('x').value = 1;
                                                                                            else
                                                                                                document.getElementById('x').value = 0;
                                                                                            }
                                                                                </script>
                                                                                </div><!-- opportunity input form closing tag -->
									</form>	
                                                                                            <form method="POST" action="editStatus">
                                                                                                <% if (currStatus.equals("close")) {%>
                                                                                                    <input type="submit" name="cancel" class="btn btn-s btn-info" style="margin-left:80px;margin-top:-83px;background-color:#009688;border:none;color:white;" value="Cancel"/>
                                                                                                   
                                                                                                <%}
                                                                                                //else {%>
                                                                                                    <!--<input type="submit" name="cancel" class="btn btn-s btn-info" style="margin-left:-200px;margin-top:191px;background-color:#009688;border:none;color:white;" value="Cancel"/>
                                                                                                <%//}%>-->
                                                                                            </form>
                                                                                            
					</div>		
					</div>
				</div>
		</div>
	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/js/bootstrap.min.js"></script>
	<script src="/js/bootstrap-datetimepicker.min.js"></script>
	<script src="js/jquery-1.9.1.min.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script type="text/javascript">
            // When the document is ready
           
            $(document).ready(function () {
                
                $('#sDate').datepicker({                 
                    format: "yyyy-mm-dd",
                    startDate: '+1m'
                    
                }).on('changeDate',function (selected){
                    var minDate = new Date(selected.date.valueOf());
                    $('#eDate').datepicker('setStartDate',minDate);
                    
                });  
            
            });
          

            $(document).ready(function () {
                
                $('#eDate').datepicker({                  
                    format: "yyyy-mm-dd",
                });  
            
            });
        </script>
        <%
	  rs.close();
          stmt.close();
          connection.close();
        %>
  </body>
  
  
</html>