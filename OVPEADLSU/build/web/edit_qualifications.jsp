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
               // Opportunity newOpp = (Opportunity) session.getAttribute("newOpp2");
                String name = String.valueOf(session.getAttribute("rmName"));
                
                DBConnectionFactory factory = DBConnectionFactory.getInstance();
                Connection connection = factory.getConnection();
                
                Statement stmtSkill = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtLang = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtProf = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                String sQuery = "select * from skills";
                ResultSet sResult = null;
                
                String lQuery = "select * from languages";
                ResultSet lResult = null;
                
                String pQuery = "select * from proficiencies";
                ResultSet pResult = null;
                
                int oppId = Integer.parseInt(String.valueOf(session.getAttribute("currOppId")));
            
            Statement stmtOpp = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            Statement stmtName = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                // query for opportunity and status
                String oQuery = "select * from opportunity where id = " + oppId + "";
                ResultSet rsOpp = null;
                
                // query for skills
                String currSkill = "select S.name from skills S, opportunity_item I"
                        + " where S.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet skillRes = null;
                
                // query for languages
                String currLang = "select L.name from languages L, opportunity_item I"
                        + " where L.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet langRes = null;
                
                // query for profeciencies
                String currProf = "select P.name from proficiencies P, opportunity_item I"
                        + " where P.id = I.item_id and I.opp_id = " + oppId + "";
                ResultSet profRes = null;
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
                                        <li class="active">Edit Qualifications</li>
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
						
						<div class="col-lg-3 col-md-3 col-sm-3"> <!--Column 2-->
								<h3>QUALIFICATIONS</h3>
                                                                <form name="form2" onsubmit="//return validateSecondForm();" role="form" method="POST" action="editQualifications">

                                                                    <%
                                                                                rsOpp = stmtOpp.executeQuery(oQuery);
                                                                            %>
                                                                            
                                                                            <% while(rsOpp.next()) {%>
                                                                    
                                                                    <%
                                                                        String age="", degree="", workExp="", fieldExp="", oSkill="", oLang="", oProf="";
                                                                        if (session.getAttribute("oppAge")!=null)
                                                                            age=String.valueOf(session.getAttribute("oppAge"));
                                                                        else {
                                                                            age = rsOpp.getString("age");
                                                                            if (age=="null")
                                                                                age="";
                                                                        }
                                                                        if (session.getAttribute("oppDegree")!=null)
                                                                            degree=String.valueOf(session.getAttribute("oppDegree"));
                                                                        else
                                                                            degree = rsOpp.getString("degree");
                                                                        if (session.getAttribute("oppWorkExp")!=null)
                                                                            workExp=String.valueOf(session.getAttribute("oppWorkExp"));
                                                                        else
                                                                            workExp = rsOpp.getString("work_experience");
                                                                        if (session.getAttribute("oppFieldExp")!=null)
                                                                            fieldExp=String.valueOf(session.getAttribute("oppFieldExp"));
                                                                        else
                                                                            fieldExp = rsOpp.getString("field_experience");
                                                                        if (session.getAttribute("oppOtherSkill")!=null)
                                                                            oSkill=String.valueOf(session.getAttribute("oppOtherSkill"));
                                                                        else
                                                                            oSkill = rsOpp.getString("skills");
                                                                        if (session.getAttribute("oppOtherLang")!=null)
                                                                            oLang=String.valueOf(session.getAttribute("oppOtherLang"));
                                                                        else
                                                                            oLang = rsOpp.getString("language");
                                                                        if (session.getAttribute("oppOtherProf")!=null)
                                                                            oProf=String.valueOf(session.getAttribute("oppOtherProf"));
                                                                        else
                                                                            oProf = rsOpp.getString("proficiency");
                                                                    %>
										
                                                                                <div class="form-group"><!-- Work Experience -->
											<label for="degree">PREFERRED AGE</label><br>
											<input name="age" value="<%=age%>" type="text" class="form-control" id="inputAge">
										</div>
										<div class="form-group"><!-- Work Experience -->
											<label for="degree">DEGREE</label><br>
											<input name="degree" value="<%=degree%>" type="text" class="form-control" id="inputDegree">
										</div>
										<div class="form-group"><!-- Work Experience -->
											<label for="workExp">WORK EXPERIENCE</label><br>
											<label for="noOfYears">No. Of Years:</label>
											  <select name="workExp" class="form-control" id="sel1" >
											  <%
                                                                                                String work="", one="", two="", three="", four="", five="", six="", seven="", eight="", nine="", ten="";
                                                                                                if (session.getAttribute("oppWorkExp")!=null)
                                                                                                    work = String.valueOf(session.getAttribute("oppWorkExp"));
                                                                                                else
                                                                                                    work = String.valueOf(rsOpp.getInt("work_experience"));
                                                                                                if (work.contains("1")) 
                                                                                                    one="selected";
                                                                                                if (work.contains("2")) 
                                                                                                    two="selected";
                                                                                                if (work.contains("3")) 
                                                                                                    three="selected";
                                                                                                if (work.contains("4")) 
                                                                                                    four="selected";
                                                                                                if (work.contains("5")) 
                                                                                                    five="selected";
                                                                                                if (work.contains("6")) 
                                                                                                    six="selected";
                                                                                                if (work.contains("7")) 
                                                                                                    seven="selected";
                                                                                                if (work.contains("8")) 
                                                                                                    eight="selected";
                                                                                                if (work.contains("9")) 
                                                                                                    nine="selected";
                                                                                                if (work.contains("10")) 
                                                                                                    ten="selected";
                                                                                              %>
											    <option <%=one%>>1</option>
											    <option <%=two%>>2</option>
											    <option <%=three%>>3</option>
											    <option <%=four%>>4</option>
											    <option <%=five%>>5</option>
											    <option <%=six%>>6</option>
											    <option <%=seven%>>7</option>
											    <option <%=eight%>>8</option>
											    <option <%=nine%>>9</option>
											    <option <%=ten%>>10</option>
											  </select>
										</div>
										<div class="form-group"><!-- Field -->
											<label for="field">Field of Experience:</label>
											<textarea name="fieldExp" class="form-control" id="workExp" rows="3"><%=fieldExp%></textarea>
										</div>	
						</div>
					
					<div class="col-lg-3 col-md-3 col-sm-3"><!-- Column 3-->
							
								<br></br>
								
										<label for="college">SKILLS</label>
										<div class="form-group"><!-- Skills -->
                                                                                    
                                                                                    <%
                                                                                    String skill="", sChecked="";
                                                                                    StringBuilder a = new StringBuilder();
                                                                                    sResult = stmtSkill.executeQuery(sQuery);
                                                                                    skillRes = stmtName.executeQuery(currSkill);
                                                                                    while (skillRes.next()) {
                                                                                        a.append(skillRes.getString("S.name")+" ");
                                                                                    } skillRes.first(); skillRes.previous();
                                                                                    
                                                                                    if (session.getAttribute("oppSkills")!=null)
                                                                                            skill=String.valueOf(session.getAttribute("oppSkills"));
                                                                                    else
                                                                                        skill = a.toString();
                                                                                    while (sResult.next()) {
                                                                                        if (skill.contains(sResult.getString("name")))
                                                                                            sChecked="checked";
                                                                                %>
												<div class="checkbox">
													<label for="checkbox-skills">
													<input <%=sChecked%> type="checkbox" name="skillCheck" value="<%=sResult.getString("name")%>">
													<%=sResult.getString("name")%>
													</label>
												</div>
                                                                                                <%
                                                                                                    sChecked="";
                                                                                                    } sResult.first(); sResult.previous();
                                                                                                %> 
                                                                                                
												<div class="checkbox">
													<label for="soe-checkbox">
													Others:
													</label>
													<input name="otherSkill" type="text" value="<%=oSkill%>" class="form-control" id="inputSkill">
												</div>
                                                                                                
											<div class="form-group">
											<label for="langFluency">LANGUAGE PROFICIENCY</label><br>
                                                                                        
                                                                                        <%
                                                                                            String lang="", lChecked="";
                                                                                            StringBuilder b = new StringBuilder();
                                                                                            lResult = stmtLang.executeQuery(lQuery);
                                                                                            langRes = stmtName.executeQuery(currLang);
                                                                                            while (langRes.next()) {
                                                                                                b.append(langRes.getString("L.name")+" ");
                                                                                            } langRes.first(); langRes.previous();

                                                                                            if (session.getAttribute("oppLang")!=null) 
                                                                                                    lang = String.valueOf(session.getAttribute("oppLang"));
                                                                                            else
                                                                                                lang = b.toString();
                                                                                            while(lResult.next()) {
                                                                                                if (lang.contains(lResult.getString("name")))
                                                                                                    lChecked="checked";
                                                                                        %>
											<div class="checkbox">
													<label for="checkbox-lang">
                                                                                                            <input <%=lChecked%> type="checkbox" name="langCheck" id="engCheckbox" value="<%=lResult.getString("name")%>">
													<%=lResult.getString("name")%>
													</label>
												</div>
                                                                                            <%
                                                                                                lChecked="";
                                                                                                } lResult.first(); lResult.previous();
                                                                                            %>
                                                                                            
												<div class="checkbox">
													<label for="soe-checkbox">
													Others:
													</label>
													<input name="otherLang" type="text" value="<%=oLang%>" class="form-control" id="inputLang">
												</div>
                                                                                            
										</div>
									</div>		
										
					</div>
					
					<div class="col-lg-3 col-md-3 col-sm-3"><!--Column 4-->
							
								<br></br>
											<div class="form-group">
											<label for="langFluency">COMPUTER PROFICIENCY</label><br>
                                                                                        
                                                                                        <%
                                                                                            String prof="", pChecked="";
                                                                                            StringBuilder c = new StringBuilder();
                                                                                            pResult = stmtProf.executeQuery(pQuery);
                                                                                            profRes = stmtName.executeQuery(currProf);
                                                                                            while (profRes.next()) {
                                                                                                c.append(profRes.getString("P.name")+" ");
                                                                                            } profRes.first(); profRes.previous();

                                                                                            if (session.getAttribute("oppProf")!=null)
                                                                                                    prof=String.valueOf(session.getAttribute("oppProf"));
                                                                                            else
                                                                                                prof = c.toString();
                                                                                            while(pResult.next()) {
                                                                                                if (prof.contains(pResult.getString("name")))
                                                                                                    pChecked="checked";
                                                                                        %>
											<div class="checkbox">
													<label for="checkbox-prof">
                                                                                                            <input <%=pChecked%> type="checkbox" name="profCheck" value="<%=pResult.getString("name")%>">
													<%=pResult.getString("name")%>
													</label>
												</div>
                                                                                                <%
                                                                                                    pChecked="";
                                                                                                    } pResult.first(); pResult.previous();
                                                                                                %>
                                                                                                
												<div class="checkbox">
													<label for="soe-checkbox">
													Others:
													</label>
													<input name="otherProf" type="text" value="<%=oProf%>" class="form-control" id="inputLang">
												</div>
										</div>
										<!--<a href="add_opportunity.html" class="btn btn-info" style="background-color:#009688;border:none;color:white;" type="button">Back</a>
										<a href="add_requirements.html" class="btn btn-info" style="margin-right:10px;background-color:#009688;border:none;color:white;" type="button">Continue</a>-->
										<input type="submit" name="back" value="Back" class="btn btn-info" style="background-color:#009688;border:none;color:white;"/>
                                                                                <input type="submit" name="continue" value="Continue" class="btn btn-info" style="margin-right:10px;background-color:#009688;border:none;color:white;"/>
								<%} rsOpp.first(); rsOpp.previous(); %>
                                                            </form> <!--Closing tag column 4-->
								
					</div>
				</div>
		</div>
	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-datetimepicker.min.js"></script>
        <script type="text/javascript">
            /* function validateSecondForm(){
                var skillFlag = 0;
                var langFlag = 0;
                var profFlag = 0;
                for (var i = 0; i <6; i++) {
                    if(document.form2["skillCheck"][i].checked){
                        skillFlag ++;
                    }
                }
                for (var i = 0; i <2; i++) {
                    if(document.form2["langCheck"][i].checked){
                        langFlag ++;
                    }
                }
                for (var i = 0; i <5; i++) {
                    if(document.form2["profCheck"][i].checked){
                        profFlag ++;
                    }
                }
        
                 if (skillFlag == 0 || langFlag == 0 || profFlag == 0) {
                    return false;
                }
                
                return true;
            }
            */
         </script>
         
         <%
            pResult.close();
            lResult.close();
            sResult.close();
            skillRes.close();
            langRes.close();
            profRes.close();
            stmtProf.close();
            stmtLang.close();
            stmtSkill.close();
            stmtOpp.close();
            stmtName.close();
            connection.close();
	%>	
	 
        
  </body>
  
  
</html>