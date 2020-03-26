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
        <a href="http://localhost:8080/CRM/Employee/Programme/pro_add.jsp">新建日程</a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
     <%-- <form action="./Backstage/"></form> --%>
      <table class="layui-table x-admin">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>名称</th>
            <th>时间</th>
            <th>地点</th>
            <th>负责人</th>
            <th>负责人电话</th>
            <th>操作</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageInfo.list }" var="programme">
	      <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${programme.name}</td>
            <td><fmt:formatDate value="${programme.date}" pattern="yyyy-MM-dd"/></td>
            <td>${programme.location}${programme.tlocation}</td>
            <td>${programme.ename}</td>
            <td>${programme.etel}</td>
            <td class="td-manage">
             <a title="修改"  onclick="x_admin_show('修改','http://localhost:8080/CRM/Employee/Programme/pro_edit.jsp?id=${programme.id}&name=${programme.name}&ename=${programme.ename}&etel=${programme.etel}&location=${programme.location}&tlocation=${programme.tlocation}&date=<fmt:formatDate value="${programme.date}" pattern="yyyy-MM-dd"/>',1000,600)" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>
              </a>
              <a title="查看具体日程"  onclick="x_admin_show('查看具体日程','http://localhost:8080/CRM/programme/findSProgrammeByPage.action?id=${programme.id}&date=<fmt:formatDate value="${programme.date}" pattern="yyyy-MM-dd"/>',1000,600)" href="javascript:;">
                <i class="layui-icon">&#xe631;</i>
              </a>
              <a title="删除" onclick="member_del(this,'${programme.id}')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
              </a>
            </td>
          </tr>
			</c:forEach>
			<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
	
				<td align="center" width="100%" colspan="11">
				当前${pageInfo.pageNum}页,
              	共${pageInfo.pages}页,
                             共${pageInfo.total}条记录
				<a
					href="${ pageContext.request.contextPath }/programme/findProgrammeByPage.action?page=1">首页</a>
					|<a
					href="${ pageContext.request.contextPath }/programme/findProgrammeByPage.action?page=${pageInfo.pageNum==1?1:pageInfo.pageNum-1}">上一页</a>
					| <a
					href="${ pageContext.request.contextPath }/programme/findProgrammeByPage.action?page=${pageInfo.pageNum==pageInfo.pages?pageInfo.pages:pageInfo.pageNum+1}">下一页</a>
					|<a
					href="${ pageContext.request.contextPath }/programme/findProgrammeByPage.action?page=${pageInfo.pages}">尾页</a></td>
	
			</tr> 
      
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
                url: "${pageContext.request.contextPath }/programme/delectProgramme.action",      //你的controller地址
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
    
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>
      
  </body>

</html>