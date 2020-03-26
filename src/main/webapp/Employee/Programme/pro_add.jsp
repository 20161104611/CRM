<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="x-admin-sm">
  
<head>
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
        <form action="${pageContext.request.contextPath }/programme/addProgramme.action" enctype="multipart/form-data" method="post">
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>时间
              </label>
              <div class="layui-input-inline">
                  <input type="date" id="date1" name="date1" class="layui-input" >
                  <input type="text" name="date" id="date"    class="form-control">
              </div>
             
          </div>
          <div class="layui-form-item">
          <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>地址
              </label>	
				<select id="s_province" name="s_province"  ></select>
				<select id="s_city" name="s_city" ></select>
				<select id="s_county" name="s_county"  ></select>
				<script type="text/javascript">_init_area();</script>
             
          </div>
            <div class="layui-form-item">
           <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>详细地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="tlocation" name="tlocation"   class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>负责人
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="ename" name="ename"   class="layui-input">
              </div>
              
          </div>
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>负责人电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="etel" name="etel"    class="layui-input">
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
	 <script>
		document.getElementById("s_county").onchange=function locationname() {
			var s_province = $("#s_province").val();
			var s_city = $("#s_city").val();
			var s_county = $("#s_county").val();
			document.getElementById("location").value=s_province+s_city+s_county;
		}
	</script>
  </body>

</html>