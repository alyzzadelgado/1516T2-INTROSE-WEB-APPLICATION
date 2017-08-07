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
                
                Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtCCS = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtCED = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtCLA = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtCOS = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtGCOE = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtCOB = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                Statement stmtSOE = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                
                String qALL="", qCED="", qCCS="", qCLA="", qCOS="", qGCOE="", qCOB="", qSOE="";
                ResultSet rsList=null, rsCCS=null, rsCLA=null, rsCOS=null, rsCED=null, rsGCOE=null, rsCOB=null, rsSOE=null;
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
      <li class="active">Opportunities</li>
    </ol>
    
    <div class="container">
      <div class="row">
        <div class="col-md-2">
            <form method="POST" action="studentView">
			<div class="form-group">
                                <% String filter;
                                    if(session.getAttribute("filterType") == null)
                                        filter="All";
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
                                %>
			  <label for="sel1">Filter By:</label>
			  <select name="filterType" class="form-control" id="sel1">
                            <option <%=all%> >ALL</option>
			    <option <%=ed%> >EDUCATION</option>
			    <option <%=car%> >CAREERS</option>
			  </select>
                          <input name="filterView" type="submit" value="Filter" class="btn btn-info" style="margin-top:-56px; margin-left:180px;" />
			</div>
                    </form>
        </div>
      </div>
    </div>
                          
    <div class="container">
        <ul class="nav nav-tabs">
          <li class="active"><a href="#all">ALL</a></li>
          <li><a href="#bagced">BAGCED</a></li>
          <li><a href="#ccs">CCS</a></li>
          <li><a href="#cla">CLA</a></li>
          <li><a href="#cos">COS</a></li>
          <li><a href="#gcoe">GCOE</a></li>
          <li><a href="#cob">RVR-COB</a></li>
          <li><a href="#soe">SOE</a></li>
        </ul>
        
        <div class="tab-content"> <!-- opening div for tab content -->
            <div id="all" class="tab-pane fade in active">
                <%
                    qALL = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id group by O.name";
                if (filter.contains("EDUCATION"))
                    qALL = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and O.type = 'academe' group by O.name";
                else if (filter.contains("CAREER"))
                    qALL ="select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and O.type = 'company' group by O.name";
                    rsList = stmt.executeQuery(qALL);
                         
                    while (rsList.next()) { 
                        if (rsList.wasNull()) {%>
                        <h5> There are no opportunities at the moment. </h5>
                    <%}
                       else { %>
                            <h3><%=rsList.getString("name")%></h3>
                            <p><%=rsList.getString("description")%></p>
                <%
                    }}rsList.first(); rsList.previous(); 
                    %>
            </div> 
            <div id="bagced" class="tab-pane fade in active">
                <%
                    qCED = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c002'";
                if (filter.contains("EDUCATION"))
                    qCED = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c002' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qCED = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c002' and O.type = 'company'";
                
                    rsCED = stmtCED.executeQuery(qCED);
                    
                    if (rsCED.wasNull()) {%>
                        <h3> There are no opportunities under this college at the moment. </h3>
                    <%}
                       else {      
                        while (rsCED.next()) {%>
                <h3><%=rsCED.getString("name")%></h3>
                <p><%=rsCED.getString("description")%></p>
                <%} rsCED.first(); rsCED.previous(); 
                    }  %>
            </div>
            <div id="ccs" class="tab-pane fade in active">
                <%
                    qCCS = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c001'";
                if (filter.contains("EDUCATION"))
                    qCCS = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c001' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qCCS = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c001' and O.type = 'company'";
                    
                    rsCCS = stmtCCS.executeQuery(qCCS);
                           
                    if (rsCCS.wasNull()) {%>
                        <h3> There are no opportunities under this college at the moment. </h3>
                    <%}
                       else {
                        while (rsCCS.next()) { %>
                <h3><%=rsCCS.getString("name")%></h3>
                <p><%=rsCCS.getString("description")%></p>
                <%} rsCCS.first(); rsCCS.previous();
                    } %>
            </div>
            <div id="cla" class="tab-pane fade in active">
                <%
                    qCLA = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c003'";
                if (filter.contains("EDUCATION"))
                    qCLA = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c003' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qCLA = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c003' and O.type = 'company'";
                    
                    rsCLA = stmtCLA.executeQuery(qCLA);
                        
                    if (rsCLA.wasNull()) {%>
                        <h3> There are no opportunities under this college at the moment. </h3>
                    <%}
                       else { 
                        while (rsCLA.next()) {%>
                <h3><%=rsCLA.getString("name")%></h3>
                <p><%=rsCLA.getString("description")%></p>
                <%} rsCLA.first(); rsCLA.previous(); 
                    } %>
            </div>
            <div id="cos" class="tab-pane fade in active">
                <%
                    qCOS = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c005'";
                if (filter.contains("EDUCATION"))
                    qCOS = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c005' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qCOS = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c005' and O.type = 'company'";
                    
                    rsCOS = stmtCOS.executeQuery(qCOS);
                    
                    if (rsCOS.wasNull()) {%>
                     <h3> There are no opportunities under this college at the moment. </h3>
                    <% }
                    else {while (rsCOS.next()) { %>
                <h3><%=rsCOS.getString("name")%></h3>
                <p><%=rsCOS.getString("description")%></p>
                <%} rsCOS.first(); rsCOS.previous(); 
                    }%>
            </div>
            <div id="gcoe" class="tab-pane fade in active">
                <%
                    qGCOE = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c006'";
                if (filter.contains("EDUCATION"))
                    qGCOE = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c006' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qGCOE = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c006' and O.type = 'company'";
                    
                    rsGCOE = stmtGCOE.executeQuery(qGCOE);
                        
                        if (rsGCOE.wasNull()) {%>
                        <h3> There are no opportunities under this college at the moment. </h3>
                    <%}
                       else { 
                    while (rsGCOE.next()) {%>
                <h3><%=rsGCOE.getString("name")%></h3>
                <p><%=rsGCOE.getString("description")%></p>
                <%} rsGCOE.first(); rsGCOE.previous(); 
                        } %>
            </div>
            <div id="cob" class="tab-pane fade in active">
                <%
                    qCOB = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c004'";
                if (filter.contains("EDUCATION"))
                    qCOB = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c004' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qCOB = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c004' and O.type = 'company'";
                    
                    rsCOB = stmtCOB.executeQuery(qCOB);
                    
                    if (rsCOB.wasNull()) { %>
                    <h3> There are no opportunities under this college at the moment. </h3>
                    <% }
                    else {
                    while (rsCOB.next()) { %>
                <h3><%=rsCOB.getString("name")%></h3>
                <p><%=rsCOB.getString("description")%></p>
                <%} rsCOB.first(); rsCOB.previous(); 
                    }%>
            </div>
            <div id="soe" class="tab-pane fade in active">
                <%
                    qSOE = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c007'";
                if (filter.contains("EDUCATION"))
                    qSOE = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c007' and O.type = 'academe'";
                else if (filter.contains("CAREER"))
                    qSOE = "select O.name, O.description from opportunity O, opportunity_item I, colleges C where O.id = I.opp_id and I.item_id = C.id and C.id = 'c007' and O.type = 'company'";
                    
                    rsSOE = stmtSOE.executeQuery(qSOE);
                    
                    if (rsSOE.wasNull()) {%>
                    
                        <h3> There are no opportunities under this college at the moment. </h3>
                    
                        <%}
                       else { 
                        while (rsSOE.next()) { %>
                        
                <h3><%=rsSOE.getString("name")%></h3>
                <p><%=rsSOE.getString("description")%></p>
                
                <%} rsSOE.first(); rsSOE.previous(); 
                    }%>
            </div>
        </div> <!--closing div for tab contents -->
    </div>

    

    <nav class="navbar navbar-default navbar-fixed-bottom navbar-footer">
    <div class="container">
      Copyright &copy; 2016 Office of the Vice President for External Affairs. All rights reserved.
    </div>
  </nav>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    
    <script>
        $(document).ready(function(){
            $(".nav-tabs a").click(function(){
                $(this).tab('show');
            });
        });
    </script>
    
    <%
    rsList.close();
    rsCCS.close();
    rsCED.close();
    rsCLA.close();
    rsCOB.close();
    rsCOS.close();
    rsSOE.close();
    rsGCOE.close();
    stmt.close();
    stmtCCS.close();
    stmtCED.close();
    stmtCLA.close();
    stmtCOS.close();
    stmtSOE.close();
    stmtCOB.close();
    stmtGCOE.close();
    connection.close();
    %>
  </body>
</html>