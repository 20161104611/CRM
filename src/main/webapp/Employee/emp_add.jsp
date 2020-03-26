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
        <form action="${pageContext.request.contextPath }/clients/addClients.action" method="post">
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>公司
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="khgongsi" name="khgongsi"   class="layui-input">
              </div>
              
          </div>
          
           <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>客户行业
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="khhangy" name="khhangy"   class="layui-input">
              </div>
              
          </div>
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>客户所有人
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="khusuoyr" name="khusuoyr"  value="${user.name}" readonly  unselectable="on"   class="layui-input">
              </div>
              
          </div>
         <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>客户状态
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehuztai" name="kehuztai"  value="未处理" readonly  unselectable="on"   class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>客户职务
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehuzhiw" name="kehuzhiw"     class="layui-input">
              </div>
              
          </div>
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>客户手机号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehusjih" name="kehusjih"     class="layui-input">
              </div>
              
          </div>
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>客户邮箱
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehemail" name="kehemail"     class="layui-input">
              </div>
              
          </div>
          
          
          
          
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" type="submit" onclick="x_admin_close()">新建</button>
          </div>
      </form>
    </div>
    
 
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>
      
	 <script type="text/javascript">
	 /*关闭弹出框口*/
	 function x_admin_close(){
		 
	     var index = parent.layer.getFrameIndex(window.name);
	     parent.layer.close(index);
	     
	 }
	 </script>
	 
  </body>

</html>