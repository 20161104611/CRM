<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html class="x-admin-sm">
  
  <head>
    <title>欢迎页面-X-admin2.1</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <script type="text/javascript" src="./js/cookie.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="x-body">
        <form action="${pageContext.request.contextPath }/user/updatepassword.action" method="post" class="layui-form">
          <div class="layui-form-item">
              <label for="L_username" class="layui-form-label"> 昵称</label>
              <div class="layui-input-inline">
                  <input type="text" id="L_username" name="name" disabled="" value="${user.name}" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>旧密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_repass" name="oldpass" required="" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>新密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_pass" name="newpass" required="" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  6到16个字符
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>确认密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_repass" name="repass" required="" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <input type="hidden" name="id" id="id" value="${user.id}" class="form-control">
          <input type="hidden" name="usercord" id="usercord" value="${user.usercord}" class="form-control">
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  type="submit" class="layui-btn" onclick="x_admin_close()">
                 	 修改
              </button>
          </div>
      </form>
    </div>
    <script>
            layui.use(['form','layer'], function(){
                $ = layui.jquery;
              var form = layui.form
              ,layer = layui.layer;
            
              //监听提交
              form.on('submit(save)', function(data){
                console.log(data);
                //发异步，把数据提交给php
                layer.alert("修改成功", {icon: 6},function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    parent.layer.close(index);
                });
                return false;
              });
              
              
            });
        </script>
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