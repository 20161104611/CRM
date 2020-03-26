<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="x-admin-sm">
<%
	String id = request.getParameter("id");
	session.setAttribute("id",id);
%>
<%
	String name = request.getParameter("name");
	session.setAttribute("name",name);
%>
<%
	String khgongsi = request.getParameter("khgongsi");
	session.setAttribute("khgongsi",khgongsi);
%>
<%
	String khhangy = request.getParameter("khhangy");
	session.setAttribute("khhangy",khhangy);
%>
<%
	String khusuoyr = request.getParameter("khusuoyr");
	session.setAttribute("khusuoyr",khusuoyr);
%>
<%
	String kehuztai = request.getParameter("kehuztai");
	session.setAttribute("kehuztai",kehuztai);
%>
<%
	String kehuzhiw = request.getParameter("kehuzhiw");
	session.setAttribute("kehuzhiw",kehuzhiw);
%>
<%
	String kehusjih = request.getParameter("kehusjih");
	session.setAttribute("kehusjih",kehusjih);
%>
<%
	String kehemail = request.getParameter("kehemail");
	session.setAttribute("kehemail",kehemail);
%>

  <head>

    <title>欢迎页面-X-admin2.1</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/font.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/xadmin.css">
    <script type="text/javascript" src="http://localhost:8080/CRM/assets1/js/xadmin.js"></script> 
    
    <script type="text/javascript" src="http://localhost:8080/CRM/js/area.js"></script>
    
    
 

  </head>
  
  <body>
  		<table class="layui-table x-admin">
        <thead>
          <tr>
            <td>姓名</td>
            <td><input type="text" value="${name}" readonly  unselectable="on" ></td>
          </tr>
          <tr>
            <td>公司</td>
            <td><input type="text" value="${khgongsi}" readonly  unselectable="on" ></td>
          </tr>
          <tr>
            <td>行业</td>
            <td><input type="text" value="${khhangy}" readonly  unselectable="on" ></td>
            </tr>
          <tr>
            <td>潜在客户所有人</td>
            <td><input type="text" value="${khusuoyr}" readonly  unselectable="on" ></td>
            </tr>
          <tr>
            <td>状态</td>
            <td><input type="text" value="${kehuztai}" readonly  unselectable="on" ></td>
          </tr>
          <tr>
            <td>职务</td>
            <td><input type="text" value="${kehuzhiw}" readonly  unselectable="on" ></td>
          </tr>
          <tr>
            <td>手机号</td>
            <td><input type="text" value="${kehusjih}" readonly  unselectable="on" ></td>
          </tr>
          <tr>
            <td>邮箱</td>
            <td><input type="text" value="${kehemail}" readonly  unselectable="on" ></td>
          </tr>
        </thead>
        </table>
    <div class="x-body">
    	用户联系情况：<br>
    	<br>
        <form action="${pageContext.request.contextPath }/clients/addERecord.action" method="post">
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>负责人
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name"  class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>联系时间
              </label>
              <div class="layui-input-inline">
                  <input type="date" id="date1" name="date1" class="layui-input" >
                  <input type="hidden" name="date" id="date"   class="form-control">
              </div>
          </div>
          
           <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>联系内容
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="neirong" class="layui-input">
              </div>
          </div>
          
          <input type="hidden" name="eId" value="${id}">
          
          
          
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
	 
  </body>

</html>