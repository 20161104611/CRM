<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
%> 
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Nixon : Widget</title>
	
	<!-- ================= Favicon ================== -->
    <!-- Standard -->
    <link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
    <!-- Retina iPad Touch Icon-->
    <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
    <!-- Retina iPhone Touch Icon-->
    <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
    <!-- Standard iPad Touch Icon--> 
    <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
    <!-- Standard iPhone Touch Icon--> 
    <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">
	
	<!-- Styles -->
   
    
    
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets/fontAwesome/css/fontawesome-all.min.css" />
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets/css/lib/themify-icons.css" />
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets/css/lib/bootstrap.min.css" />
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets/css/lib/nixon.css" />
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets/css/style.css" />
</head>

<body class="bg-primary">
	<div class="Nixon-login">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<div class="login-content">
						<div class="login-logo">
							<a href="index.html"><span>Foodmin</span></a>
						</div>
						<div class="login-form">
							<h4> Administratior Login</h4>
							<form action="${pageContext.request.contextPath }/user/login.action" method="post">
								<div class="form-group">
									<label>用户名</label>
									<input type="text" name="usercord" class="form-control" placeholder="usercord">
								</div>
								<div class="form-group">
									<label>密码</label>
									<input  type="password" name="pwd" class="form-control" placeholder="pwd">
								</div>
								
								<button type="submit" class="btn btn-primary btn-flat m-b-30 m-t-30">Sign in</button>
								
								<div class="register-link m-t-15 text-center">
									<p>Don't have account ? <a href="register.jsp"> Sign Up Here</a></p>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>