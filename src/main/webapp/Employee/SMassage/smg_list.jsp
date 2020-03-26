<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html class="x-admin-sm">

  <head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.1</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
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
    <style type="text/css">
    	td{
    		width: 5px;
    		height: 5px;
    	}
    	tr{
    		width: 5px;
    		height: 5px;
    	}
    	th{
    		width: 5px;
    		height: 5px;
    	}
    </style>
    
  </head>
  
  <body class="">
 
 
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a onclick="x_admin_show('添加日程','http://localhost:8080/CRM/Employee/SProgramme/spro_add.jsp?pid=${id}&date=${date}',500,300)" href="javascript:;">新建日程</a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
     <%-- <form action="./Backstage/"></form> --%>
      <table class="layui-table x-admin">
        <thead>
          <tr>
            
            <th>姓名</th>
            <th>标题</th>
            <th>时间</th>
            <th>内容</th>
            <th>时间戳</th>
            <th>啦啦啦</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${massage}" var="massage">
		      <tr>
	            <td>${massage.name}</td>
	            <td>${massage.title}</td>
	            <td>${massage.date}</td>
	            <td>${massage.context}</td>
	            <td>${massage.sdate}</td>
	            <c:set var="sname" value="${massage.name}" scope="request"/>
	            <td><input type="button" id="bt${massage.id}" value="回复" onclick="xx('div${massage.id}','bt${massage.id}')"/>
				<div id="div${massage.id}" style="display: none; width: 240px;height: 300px;" >
			<form action="${pageContext.request.contextPath }/massage/addSmassage.action" method="post">
				<div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>留言人
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name" value="${user.name}" class="layui-input">
              </div>
          </div>
          <input type="hidden" name="mid" value="${massage.id}" class="layui-input">
          <input type="text" name="sname" value="${sname}" class="layui-input">
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
			</div></td>
	          </tr>
	          <c:forEach items="${pageInfo.list }" var="smassage">
        	<c:if test="${massage.id eq smassage.mid }">
	      <tr style="margin-left: 60px">
            <td>${smassage.name}回复${sname}</td>
            <td>${smassage.title}</td>
            <td>${smassage.date}</td>
            <td>${smassage.context}</td>
            <td>${smassage.sdate}</td>
            <c:set var="sname" value="${smassage.name}" scope="request"/>
            <td>
            <input type="button" id="sbt${smassage.id}" value="回复" onclick="xx('sdiv${smassage.id}','sbt${smassage.id}')"/>
				<div id="sdiv${smassage.id}" style="display: none; width: 240px;height: 300px;" >
			<form action="${pageContext.request.contextPath }/massage/addSmassage.action" method="post">
				<div class="layui-form-item">
              <label  class="layui-form-label">
                  <span class="x-red">*</span>留言人
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="name" value="${user.name}" class="layui-input">
              </div>
          </div>
          <input type="hidden" name="mid" value="${massage.id}" class="layui-input">
          <input type="text" name="sname" value="${sname}" class="layui-input">
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
			</c:forEach>
        
			
			
      
	</tbody>
	</table>
	
    </div>

    <script>
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });


      });
    </script>
    <script>
    function member_del(obj,id){
         layer.confirm('确认要删除吗？',function(index){ 
            //发异步删除数据
        	$.ajax({
                type: "Post",
                url: "${pageContext.request.contextPath }/programme/delectSProgramme.action",      //你的controller地址
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
    /*用户-停用*/
    function member_stop(obj,id){
        layer.confirm('确认要停用吗？',function(index){

            if($(obj).attr('title')=='启用'){

              //发异步把用户状态进行更改
              $(obj).attr('title','停用')
              $(obj).find('i').html('&#xe62f;');

              $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
              layer.msg('已停用!',{icon: 5,time:1000});

            }else{
              $(obj).attr('title','启用')
              $(obj).find('i').html('&#xe601;');

              $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
              layer.msg('已启用!',{icon: 5,time:1000});
            }
            
        });
    }
    </script>
    <script>
    layui.use('table', function(){
      var table = layui.table;
      
      //监听单元格编辑
      table.on('edit(test)', function(obj){
        var value = obj.value //得到修改后的值
        ,data = obj.data //得到所在行所有键值
        ,field = obj.field; //得到字段
        layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改为：'+ value);
      });

      //头工具栏事件
      table.on('toolbar(test)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id);
        switch(obj.event){
          case 'getCheckData':
            var data = checkStatus.data;
            layer.alert(JSON.stringify(data));
          break;
          case 'getCheckLength':
            var data = checkStatus.data;
            layer.msg('选中了：'+ data.length + ' 个');
          break;
          case 'isAll':
            layer.msg(checkStatus.isAll ? '全选': '未全选');
          break;
        };
      });
    });
    
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
<script type="text/javascript">
function yy(div,id){
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
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>
      
  </body>

</html>