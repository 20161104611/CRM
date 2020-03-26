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
	String ename = request.getParameter("ename");
	session.setAttribute("ename",ename);
%>

<%
	String name = request.getParameter("name");
	session.setAttribute("name",name);
%>
<%
	String etel = request.getParameter("etel");
	session.setAttribute("etel",etel);
%>
<%
	String location = request.getParameter("location");
	session.setAttribute("location",location);
%>
<%
	String startdate = request.getParameter("startdate");
	session.setAttribute("startdate",startdate);
%>
<%
	String duration = request.getParameter("duration");
	session.setAttribute("duration",duration);
%>
<%
	String content = request.getParameter("content");
	session.setAttribute("content",content);
%>
<%
	String date = request.getParameter("date");
	session.setAttribute("date",date);
%>
<%
	String pid = request.getParameter("pid");
	session.setAttribute("pid",pid);
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
    
  </head>
  
  <body>
  		
    <div class="x-body">
        <form action="${pageContext.request.contextPath }/programme/updateSProgramme.action"  enctype="multipart/form-data" method="post">
         <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name"  value="${name}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>开始时间
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="startdate" value="${startdate}" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>总时长
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="duration"  value="${duration}"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>负责人
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="ename"  value="${ename}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>负责人电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="etel" value="${etel}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>地点
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="location" value="${location}"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>具体内容
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="content"  value="${content}" class="layui-input">
              </div>
          </div>
          <input type="hidden" name="pid" value="${pid}">
          <input type="hidden" name="date" value="${date}">
          <input type="hidden" name="id" value="${id}">
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
	  		
			document.getElementById("path1").onchange=function datename() {
				var date1=document.getElementById("path1").files[0].name;
				document.getElementById("path").value=date1;
			}
	 </script>
	 <script type="text/javascript">
	 /*关闭弹出框口*/
	 function x_admin_close(){
		 
	     var index = parent.layer.getFrameIndex(window.name);
	     parent.layer.close(index);
	     
	 }
	 </script>
	 
  </body>

</html>