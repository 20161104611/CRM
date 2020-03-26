<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="x-admin-sm">
  
  <head>
<%
	String id = request.getParameter("id");
	session.setAttribute("id",id);
%>
<%
	String no = request.getParameter("no");
	session.setAttribute("no",no);
%>
<%
	String name = request.getParameter("name");
	session.setAttribute("name",name);
%>
<%
	String uname = request.getParameter("uname");
	session.setAttribute("uname",uname);
%>

<%
	String utel = request.getParameter("utel");
	session.setAttribute("utel",utel);
%>
<%
	String ename = request.getParameter("ename");
	session.setAttribute("ename",ename);
%>
<%
	String etel = request.getParameter("etel");
	session.setAttribute("etel",etel);
%>
<%
	String money = request.getParameter("money");
	session.setAttribute("money",money);
%>
<%
	String date = request.getParameter("date");
	session.setAttribute("date",date);
%>
<%
	String flag = request.getParameter("flag");
	session.setAttribute("flag",flag);
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
        <form action="${pageContext.request.contextPath }/eorder/updateOrder.action" enctype="multipart/form-data" method="post">
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>订单号
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="no" value="${no}" readonly  unselectable="on" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>订单名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="name" name="name" value="${name}"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>甲方负责人
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="uname" name="uname"  value="${uname}"   class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>甲方电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="utel" name="utel"   value="${utel}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>乙方负责人
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="ename" name="ename"   value="${ename}"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>乙方电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="etel" name="etel"   value="${etel}"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>订单总额
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="money" name="money"  value="${money}"   class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>订单交易日期
              </label>
              <div class="layui-input-inline">
                  <input type="date" id="date1" name="date1" class="layui-input" >
                  <input type="text" name="date" id="date"  value="${date}"  class="form-control">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>订单状态
              </label>
              <div class="layui-input-inline">
              <c:if test="${flag=='交易中'}">
               	  <select id="flag" name="flag"  class="select" >
						<option>交易中</option>
						<option>交易完成</option>
				  </select>
			  </c:if>
			 <c:if test="${flag!='交易中'}">
               	  <select id="flag" name="flag"  class="select" >
						<option>交易完成</option>
						<option>交易中</option>
				  </select>
			  </c:if>
              </div>
          </div>
          <input type="hidden" name="id" value="${id}">
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" type="submit" onclick="x_admin_close()">修改</button>
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
	 <script>
			document.getElementById("date1").onchange=function datename() {
				var date1 = $("#date1").val();
				document.getElementById("date").value=date1;
			}
	 </script>
	  <script>
	  		
			document.getElementById("c_path1").onchange=function datename() {
				var date1=document.getElementById("c_path1").files[0].name;
				document.getElementById("c_path").value=date1;
			}
	 </script>
	 <script>
			document.getElementById("l_date1").onchange=function datename() {
				var date1 = $("#l_date1").val();
				document.getElementById("l_date").value=date1;
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