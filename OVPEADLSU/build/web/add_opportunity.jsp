<%@page import="classes.Opportunity"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
		<link rel="stylesheet" type="text/css" href="css/bootstrap-datepicker.css">

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

            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String query = "select * from country";
            ResultSet rs = stmt.executeQuery(query);

            
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
					<li class="active">Add Opportunity</li>
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
								<a href="student_view.jsp">
									<strong><h4> Student Tracking</h4></strong>
								</a>	
							</div>		
						</div>
						
						<div class="col-lg-3 col-md-3 col-sm-3"> <!--Column 2-->
							
								<br></br>
									 <form name="form" onsubmit="return validateFirstForm();" role="form" method="POST" action="addOpportunity">
									
                                                                             <%
                                                                                String oName="",type="", typeName="", description="", start_date="", 
                                                                                        end_date="", cPerson="", cNumber="", cLandline="", eadd="";
                                                                                
                                                                                if (session.getAttribute("oppName")!=null)
                                                                                    oName= String.valueOf(session.getAttribute("oppName"));
                                                                                if (session.getAttribute("oppType")!=null)
                                                                                    type= String.valueOf(session.getAttribute("oppType"));
                                                                                if (session.getAttribute("oppTypeName")!=null)
                                                                                    typeName = String.valueOf(session.getAttribute("oppTypeName"));
                                                                                if (session.getAttribute("oppDescription")!=null)
                                                                                    description= String.valueOf(session.getAttribute("oppDescription"));
                                                                                if (session.getAttribute("oppStartDate")!=null)
                                                                                    start_date= String.valueOf(session.getAttribute("oppStartDate"));
                                                                                if (session.getAttribute("oppEndDate")!=null)
                                                                                    end_date= String.valueOf(session.getAttribute("oppEndDate"));
                                                                                if (session.getAttribute("oppContactPerson")!=null)
                                                                                    cPerson= String.valueOf(session.getAttribute("oppContactPerson"));
                                                                                if (session.getAttribute("oppPhone")!=null)
                                                                                    cNumber= String.valueOf(session.getAttribute("oppPhone"));
                                                                                if (session.getAttribute("oppLandline")!=null)
                                                                                    cLandline= String.valueOf(session.getAttribute("oppLandline"));
                                                                                if (session.getAttribute("oppEmail")!=null)
                                                                                    eadd= String.valueOf(session.getAttribute("oppEmail"));
                                                                             %>
										<div class="form-group"><!-- opportunity input form opening tag -->
											<label for="opportunity">Opportunity:</label>
											<input required name="name" type="text" value="<%=oName%>" class="form-control" id="inputOppName">
										</div><!-- opportunity input form closing tag -->
                                                                                
										<div class="form-group">
                                                                                    <label for="opportunity">Type:</label>
                                                                             <% 
                                                                                      String acadRadio="",compRadio="",strRadio="";
                                                                                      strRadio=String.valueOf(session.getAttribute("oppType"));
                                                                                 if (strRadio.equals("Academe"))
                                                                                    acadRadio="checked";
                                                                                 else if(strRadio.equals("Company"))
                                                                                    compRadio="checked";
                                                                                 else{
                                                                                     acadRadio="";
                                                                                     compRadio="";
                                                                                 }

                                                                             %> 
                                                                             <input type="radio" name="type" value="Academe" required <%=acadRadio%>><label for="type">Academe</label>
                                                                             <input type="radio" name="type" value="Company"<%=compRadio%>><label for="type">Company</label>
										</div><!-- opportunity input form closing tag -->
										
                                                                                
                                                                                
										<div class="form-group"><!-- academe/company input form opening tag -->
											<label for="company">Academe/Company Name:</label>
											<input required name="typeName" type="text" value="<%=typeName%>" class="form-control" id="inputCompany">
										</div><!-- academe/company input form closing tag -->
										
										
                                                                                <div class="form-group"><!-- Work Experience -->
                                                                                    <label for="workExp">Country:</label><br>
                                                                                    <select name="country" class="form-control" id="sel1">
                                                                                        <% String cSelect="", country="";
                                                                                        while (rs.next()) {
                                                                                            country = rs.getString("name");
                                                                                            if (session.getAttribute("oppCountry")!=null)
                                                                                                country = String.valueOf(session.getAttribute("oppCountry"));
                                                                                                
                                                                                            if (country.contains(rs.getString("name")))
                                                                                                    cSelect="selected";
                                                                                        %>
                                                                                        <option <%=cSelect%> value="<%=country%>"> <%=rs.getString("code")%> | <%=rs.getString("name")%> </option>
                                                                                            <% cSelect="";
                                                                                        }
                                                                                                rs.first();
                                                                                                rs.previous();%>
                                                                                    </select>
                                                                                </div>
										
										
										<div class="form-group"><!-- description input form opening tag -->
											<label for="description">Description:</label>
											<textarea required name="description" class="form-control" id="description" rows="6"><%=description%></textarea>
										</div><!-- description input form closing tag -->
							
						</div>

					
					<div class="col-lg-3 col-md-3 col-sm-3"><!-- Column 3-->
							
								<br></br>
								
										<div class="form-group"> <!-- date input form opening tag -->
											<label for="applicationPeriod">Application Period:</label>
											<div class="input-group input-append date" id="sDate">
												<input required name="startDate" value="<%=start_date%>" type="text" class="form-control" placeholder="Start date" ></input>
												<span class="input-group-addon add-on">
												<i class="glyphicon glyphicon-calendar"></i></span>
											</div>	
			
											<br></br>
											<div class="input-group input-append date" id="eDate">
												<input required name="endDate" type="text" value="<%=end_date%>" class="form-control" placeholder="End date"></input>
												<span class="input-group-addon add-on">
												<i class="glyphicon glyphicon-calendar"></i></span>
											</div>												
										</div> <!-- date input closing tag -->
        <!-- Load jQuery and bootstrap datepicker scripts -->
									
										<div class="form-group"> <!-- contact person input opening tag-->
											<label for="contactPerson">Contact Person:</label>
											<input required name="contactPerson" type="text"  value="<%=cPerson%>" class="form-control" id="inputContactPerson">
										</div><!-- contact person input closing tag-->
										
										<div class="form-group"><!-- contact number input opening tag-->
											<label for="contactNumber">Contact Number:</label>
											<input required maxlength="12" name="contactPhone" value="<%=cNumber%>" type="number" class="form-control" id="phoneNumber" placeholder="Phone">
											<br></br>
											<input required maxlength="12" name="contactLandline" type="number" value="<%=cLandline%>" class="form-control" id="landline" placeholder="Landline">
										</div><!-- contact number input closing tag-->
											
					</div>
					
					<div class="col-lg-3 col-md-3 col-sm-3"><!--Column 4-->
							
								<br></br>
										<div class="form-group"><!-- contact number input opening tag-->
											<label for="email">E-mail Address:</label>
											<input required name="email" type="email" value="<%=eadd%>" class="form-control" id="emailAdd">
										
										</div>
                                                                                        <%
                                                                                        String ccs="", ced="", cla="", cob="", cos="",gcoe="", soe="", colleges="";
                                                                                    if (session.getAttribute("oppColleges") != null)
                                                                                        colleges = String.valueOf(session.getAttribute("oppColleges"));
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
                                                                                        %>
										
										<label for="college">College</label>
                                                                                <div class="form-group"><!--College checkbox opening tag-->
                                                                                    <div style="padding-right:100px;"class="col-lg-1 col-md-1 col-sm-1">
                                                                                        <div class="checkbox">
                                                                                            <label for="ccs-checkbox">
                                                                                                <input type="checkbox" name="checkboxes" id="ccs-checkbox" value="CCS" <%=ccs%> >
                                                                                                CCS
                                                                                            </label>
                                                                                            <label for="ced-checbox">
                                                                                                <input type="checkbox" name="checkboxes" id="ced-checkbox" value="CED" <%=ced%> >
                                                                                                CED
                                                                                            </label>
                                                                                            <label for="cla-checbox">
                                                                                                <input type="checkbox" name="checkboxes" id="cla-checkbox" value="CLA" <%=cla%> >
                                                                                                CLA
                                                                                            </label>
                                                                                            <label for="cob-checbox">
                                                                                                <input type="checkbox" name="checkboxes" id="cob-checkbox" value="COB" <%=cob%> >
                                                                                                COB
                                                                                            </label>
                                                                                        </div>
                                                                                    </div>
                                                                                    <div class="col-lg-1 col-md-1 col-sm-1">
                                                                                        <div class="checkbox">
                                                                                            <label for="checkbox-1">
                                                                                                <input type="checkbox" name="checkboxes" id="cos-checkbox" value="COS" <%=cos%> >
                                                                                                COS
                                                                                            </label>
                                                                                            <label for="gcoe-checkbox">
                                                                                                <input type="checkbox" name="checkboxes" id="gcoe-checkbox" value="GCOE" <%=gcoe%> >
                                                                                                GCOE
                                                                                            </label>
                                                                                            <label for="soe-checkbox">
                                                                                                <input type="checkbox" name="checkboxes" id="soe-checkbox" value="SOE" <%=soe%> >
                                                                                                SOE
                                                                                            </label>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
										<input type="submit" name="continue" value="Continue" class="btn btn-info" style="margin-left:90px;margin-top:30px;background-color:#009688;border:none;color:white;"/>
									</form> 
                                                                                                <!--Closing tag column 4-->
								
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
            function validateFirstForm(){
                var flag = 0;
                for (var i = 0; i < 7; i++) {
                    if(document.form["checkboxes"][i].checked){
                        flag ++;
                    }
                }
                
                if (flag == 0) {
                    return false;
                }
                
                return true;
            }
            
            // When the document is ready
           
            $(document).ready(function () {
                
                $('#sDate').datepicker({                 
                    format: "yyyy-mm-dd",
                    startDate: '+0d'
                    
                }).on('changeDate',function (selected){
                    var minDate = new Date(selected.date.valueOf());
                    var minDatePlus = new Date(minDate.setMonth(minDate.getMonth()+1));
                    $('#eDate').datepicker('setStartDate',minDatePlus);
                    
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