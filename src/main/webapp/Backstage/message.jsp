<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="x-admin-sm">

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
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/font.css">
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="http://localhost:8080/CRM/assets1/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://localhost:8080/CRM/assets1/js/xadmin.js"></script>
    <script type="text/javascript" src="http://localhost:8080/CRM/assets1/js/cookie.js"></script>
    
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
     <c:forEach items="${pageInfo.list }" var="massage">
     	<div style="width: 100%;">
     	<div style="float: left;width: 10%;height: 120px;"><img class="avatar-img" src="http://localhost:8080/img/${user.img}" style="width: 100px;height:100px;margin-left: 50px" pxalt="" /></div><div style="float:right;width:89%;height: 150px;">主题：${massage.title}<br>留言内容：${massage.context}</div>
     	</div>
     	
     	<div style="margin-left:60px;width:300px; height: 100px">
     	${massage.date}&nbsp;&nbsp;&nbsp;
     	<a title="删除" onclick="member_del(this,'${massage.id}')" href="javascript:;">
                <i class="layui-icon">删除</i>
        </a>
        </div>
        <table>
         <c:forEach items="${smassage}" var="smassage">
        	<c:if test="${massage.id eq smassage.mid }">
	      	
	      		<tr>
	      			<td>${smassage.name}回复${smassage.sname}&nbsp;:<p style="width: 300px">${smassage.context}<p><br></td>
	      			<td>${smassage.date}</td>
	      			<c:set var="sname" value="${smassage.name}" scope="request"/>
		            <td>
		            
		            <input type="button" id="sbt${smassage.id}" value="回复" onclick="xx('sdiv${smassage.id}','sbt${smassage.id}')"/>
						<div id="sdiv${smassage.id}" style="display: none; width: 240px;height: 300px;" >
					<form action="${pageContext.request.contextPath }/massage/addSmassage1.action" method="post">
						<div class="layui-form-item">
		              <label  class="layui-form-label">
		                  <span class="x-red">*</span>留言人
		              </label>
		              <div class="layui-input-inline">
		                  <input type="text" name="name" value="${user.name}" class="layui-input">
		              </div>
		          </div>
		          <input type="hidden" name="mid" value="${massage.id}" class="layui-input">
		          <input type="hidden" name="hid" value="${user.id}" class="layui-input">
		          <input type="hidden" name="sname" value="${sname}" class="layui-input">
		          <div class="layui-form-item">
		          
		              <label for="L_email" class="layui-form-label">
		                  <span class="x-red">*</span>主题
		              </label>
		              <div class="layui-input-inline">
		                  <input type="text" id="L_email" name="title" lay-verify="email"
		                  autocomplete="off" class="layui-input">
		              </div>
		              
		          </div>
		          
		           <div class="layui-form-item">
		              <label for="L_username" class="layui-form-label">
		                  <span class="x-red">*</span>留言内容
		              </label>
		              <div class="layui-input-inline">
		                  <textarea  type="text" row="100" cols="50" name="context"></textarea>
		              </div>
		          </div>      
		              
		          <div class="layui-form-item">
		              <label for="L_repass" class="layui-form-label">
		              </label>
		              <button  class="layui-btn" type="submit" onclick="x_admin_close()">提交</button>
		          </div>
					</form>
					</div>
					</td>
					
	      		</tr>
          </c:if>
		</c:forEach>
		</table>
     </c:forEach>
     <table>
      <tr>
      <td>
        <form action="${pageContext.request.contextPath }/massage/add.action" method="post">
          <div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>留言人
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name" value="${user.name}" class="layui-input">
              </div>
          </div>
          <input type="hidden" name="mid" value="${user.id}" class="layui-input">
          <div class="layui-form-item">
          
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>主题
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_email" name="title" lay-verify="email"
                  autocomplete="off" class="layui-input">
              </div>
              
          </div>
          
           <div class="layui-form-item">
              <label for="L_username" class="layui-form-label">
                  <span class="x-red">*</span>留言内容
              </label>
              <div class="layui-input-inline">
                  <textarea  type="text" row="100" cols="50" name="context"></textarea>
              </div>
          </div>          
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" type="submit" onclick="x_admin_close()">提交</button>
          </div>
      </form>
      </td>
      </tr>
      </table>
     </div>
    
    <script>
    function member_del(obj,id){
         layer.confirm('确认要删除吗？',function(index){ 
            //发异步删除数据
        	$.ajax({
                type: "Post",
                url: "${pageContext.request.contextPath }/massage/delMassage.action",      //你的controller地址
                data: {'id' : id,},
                dataType : 'text',
                success: function (data) {
              	  if(data=="1")
              	{
              		$(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
              	}
              	  
                },
                error:function()
                {
                }
        });
         }); 
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
function xx(div,id){
  var obt=document.getElementById(id);
  var odiv=document.getElementById(div);
  
    if(odiv.style.display=="none"){
       odiv.style.display="block";
      obt.value="取消";
    }
    else{
     odiv.style.display="none";
      obt.value="回复";
    }
 
}
</script>
  </body>

</html>