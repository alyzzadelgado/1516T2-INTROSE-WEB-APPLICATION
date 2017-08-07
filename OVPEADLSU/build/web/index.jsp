<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Bootstrap -->
    <link href="css/global.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <title>Office of the Vice President for External Affairs</title>
	

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
      <%
          String msg;
       %>
      <div class="panel panel-success">
        <div class="panel-heading parent">
          <h3 class="panel-title text-center">Office of the Vice President for External Affairs</h3>
        </div>
        <div class="panel-body child">
        <!-- Login Form -->
        <form class="form-horizontal" method="POST" action="login">
            <div class="form-group input-group">
              <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></span>
              <input required name="username" type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
            </div>
            <div class="form-group input-group">
              <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-lock" aria-hidden="true"></span></span>
              <input required name="password" type="password" class="form-control" placeholder="Password" aria-describedby="basic-addon1">
            </div>
            <div>
                <% if (session.getAttribute("error") == null)
                    msg="";
                else
                    msg=String.valueOf(session.getAttribute("error"));
                %>
                <label><b><%=msg%><b><br></label>
            </div>
            <div class="form-group btn-block">
              <input type="submit" value="Login" class="btn btn-success">
            </div>
            <div class="row">
              <div class="col-xs-6"><a href="#">Create Account</a></div>
              <div class="col-xs-6"><a href="#">Forgot Password?</a></div>
            </div>
          </form>
        <!-- Login Form [END] -->
        </div>
      </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>