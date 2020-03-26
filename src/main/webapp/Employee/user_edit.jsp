<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="x-admin-sm">
  
  <head>
<%
	String id = request.getParameter("id");
	session.setAttribute("id",id);
%>
<%
	String username = request.getParameter("username");
	session.setAttribute("username",username);
%>
<%
	String name = request.getParameter("name");
	session.setAttribute("name",name);
%>
<%
	String price = request.getParameter("price");
	session.setAttribute("price",price);
%>
<%
	String weixin = request.getParameter("weixin");
	session.setAttribute("weixin",weixin);
%>
<%
	String phone = request.getParameter("phone");
	session.setAttribute("phone",phone);
%>
<%
	String qq = request.getParameter("qq");
	session.setAttribute("qq",qq);
%>
<%
	String email = request.getParameter("email");
	session.setAttribute("email",email);
%>
<%
	String location = request.getParameter("location");
	session.setAttribute("location",location);
%>
<%
	String img = request.getParameter("img");
	session.setAttribute("img",img);
%>
<%
	String date = request.getParameter("date");
	session.setAttribute("date",date);
%>
    <title>欢迎页面-X-admin2.1</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/font.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/xadmin.css">
    <script type="text/javascript" src="http://localhost:8080/CRM/assets1/js/xadmin.js"></script> 
    
    <script type="text/javascript" src="http://localhost:8080/CRM/js/area.js"></script>
    
    
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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

}
</style>
  </head>
  
  <body>
  		
    <div class="x-body">
        <form action="${pageContext.request.contextPath }/user/updateuser.action"  enctype="multipart/form-data" method="post">
         <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>头像
              </label>
              <div class="layui-input-inline">
                  <div id="preview" >
                  	<img alt="" src="http://localhost:8080/img/${img}">
                  </div>
                  <input type="file" name="img1" id="file" onchange="preview(this)" ><br/>
				  <input type="hidden" name="img" id="img" value="${img}" class="form-control">
				  <input type="hidden" name="img2" id="img2" value="" class="form-control">
              </div>
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>昵称
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name" value="${name}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>邮箱
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_email" name="email" value="${email}" required="" lay-verify="email"
                  autocomplete="off" class="layui-input">
              </div>
              
          </div>
          
           <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>电话号
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="phone" value="${phone}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>微信
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="weixin" value="${weixin}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>QQ
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="qq" value="${qq}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>性别
              </label>
              <div class="layui-input-inline">
                  <select id="gender" name="gender"  class="select" >
						<option>男</option>
						<option>女</option>
				  </select>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>出生日期
              </label>
              <div class="layui-input-inline">
                  <input type="date" id="date1" name="date1" class="layui-input" >
                  <input type="text" name="date" id="date"   value="${date}"  class="form-control">
              </div>
             
          </div>
          
          <input type="hidden" name="id" id="id" value="${id}" class="form-control">
          <input type="hidden" name="username" id="username" value="${username}" class="form-control">
          <!-- 地址当最后一个 -->
           <div >
              <label class="layui-form-label">地址</label>
				
              
                <select id="s_province" name="s_province"  ></select>
				<select id="s_city" name="s_city" ></select>
				<select id="s_county" name="s_county"  ></select>
				<script type="text/javascript">_init_area();</script>
           <input type="text" name="location" id="location" value="${location}" class="form-control">
          </div>
          
          
          
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" type="submit" onclick="x_admin_close()">修改</button>
          </div>
      </form>
    </div>
    
  <script>
	document.getElementById("s_county").onchange=function locationname() {
		var s_province = $("#s_province").val();
		var s_city = $("#s_city").val();
		var s_county = $("#s_county").val();
		document.getElementById("location").value=s_province+s_city+s_county;
	}
	</script>
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>
      <script>
			document.getElementById("date1").onchange=function datename() {
				var date1 = $("#date1").val();
				document.getElementById("date").value=date1;
			}
	 </script>
	 <script type="text/javascript">
	 /*关闭弹出框口*/
	 function x_admin_close(){
		 
	     var index = parent.layer.getFrameIndex(window.name);
	     parent.layer.close(index);
	     
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
  </body>

</html>