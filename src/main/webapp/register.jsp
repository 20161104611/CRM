<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >

<head>
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
    
    <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.2.min.js "></script>

	<script type="text/javascript" src="http://localhost:8080/CRM/js/area.js"></script>
	
	<script language="javascript">
function verifyname() {
		
	  	var usercord = $("#usercord").val();
	   //var username = document.getElementById("username").value;
	 //  $('#spanid').html("用户已存在");
		$.ajax({
			type : 'post',
			url : './user/verifyname.action',
			data : {
				'usercord' : usercord,
			},
			dataType : 'text',
			success : function(data) {
				$('#spanid').empty();
				if(data == 1){
					//存在
					$('#spanid').append("<font color='red'>用户名已存在</font>")
					///document.getElementById("spanid").innerText="用户已存在!";
				}else if(data == 2){
					$('#spanid').append("<font color='red'>输入框不能为空</font>");
					//document.getElementById("spanid").innerText="输入框不能为空!";
				}
				else {
					//不存在
					$('#spanid').append("<font color='green'>用户名可用</font>");
					//document.getElementById("spanid").innerText="用户名可以用!";
				}
// 				window.console.log('成功回调函数');
			},
			error : function() {
				window.console.log('失败回调函数');
			}
		})
	}
</script>

<style>
        #preview, .img, img {
            width: 200px;
            height: 200px;
        }
 		
        #preview {
            border: 1px solid #000;
        }
        
       	sapn{
       		color: black;
       	}
        #file{
         color: black;
        }
        select {
		display: inline-block;
		width: 100px;
		position: relative;
		vertical-align: middle;
		padding: 0;
		overflow: hidden;
		background-color: #fff;
		color: #555;
		border: 1px solid #aaa;
		text-shadow: none;
		border-radius: 4px;	
		transition: box-shadow 0.25s ease;
		z-index: 2;
	}

</style>


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
							<h4>Register to Administration</h4>
							<form  action="${pageContext.request.contextPath }/user/register.action" enctype="multipart/form-data" method="post">
								<div class="form-group">
									<label>用户名</label>
									<input type="text" id="usercord" name="usercord" onblur="verifyname()" class="form-control" placeholder="usercord">
								</div>
								<span id="spanid"></span><br>
								<div class="form-group">
									<label>密码</label>
									<input  type="password" id="pwd" name="pwd" class="form-control" placeholder="pwd">
								</div>
								<div class="form-group">
									<label>电话号</label>
									<input type="text" id="phone" name="phone" class="form-control" placeholder="name">
								</div>
								<div class="form-group">
									<label>邮箱号</label>
									<input type="text" id="email" name="email" class="form-control" placeholder="name">
								</div>
									<input type="hidden" id="flag" name="flag" value="2" class="form-control" placeholder="name">
								<div class="checkbox">
									<label>
										<input type="checkbox"> Agree the terms and policy 
									</label>									
								</div>
								<button type="submit" class="btn btn-primary btn-flat m-b-30 m-t-30">Register</button>
								
								<div class="register-link m-t-15 text-center">
									<p>Already have account ? <a href="Login/login.jsp"> 登录</a></p>
								</div>
							</form>
							<script>
								document.getElementById("s_county").onchange=function locationname() {
									var s_province = $("#s_province").val();
									var s_city = $("#s_city").val();
									var s_county = $("#s_county").val();
									document.getElementById("location").value=s_province+s_city+s_county;
								}
							</script>
							<script>
								document.getElementById("date1").onchange=function datename() {
									var date1 = $("#date1").val();
									document.getElementById("date").value=date1;
								}
							</script>
							
							 <script type="text/javascript">
		function preview(file) {	
			var img1=document.getElementById("file").files[0].name;
			var img2=document.getElementById("img2").value;
			document.getElementById("img").value = img2 + img1;
				 var prevDiv = document.getElementById('preview');
				if (file.files && file.files[0]) {
				var reader = new FileReader();
				reader.onload = function(evt) {
					prevDiv.innerHTML = '<img src="' + evt.target.result + '" />';
								                
				}
					 reader.readAsDataURL(file.files[0]);
				} else {
					prevDiv.innerHTML = '<div class="img" style="filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
								           
					}
								        
				}
	</script>
					
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>