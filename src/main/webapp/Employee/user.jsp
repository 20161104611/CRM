<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html  class="x-admin-sm">
<head>
	<meta charset="UTF-8">
	<title>CRM</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/font.css">
	<link rel="stylesheet" href="http://localhost:8080/CRM/assets1/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript"src="https://cdn.bootcss.com/blueimp-md5/2.10.0/js/md5.min.js"></script>
    <script src="http://localhost:8080/CRM/assets1/lib/layui/layui.js" charset="utf-8"></script>

    <script type="text/javascript" src="http://localhost:8080/CRM/assets1/js/xadmin.js"></script>
    <script type="text/javascript" src="http://localhost:8080/CRM/assets1/js/cookie.js"></script>
    <script>
        // 是否开启刷新记忆tab功能
        // var is_remember = false;
    </script>
</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
       
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${user.name}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a href="http://localhost:8080/CRM/Employee/emp_password.jsp" >修改密码</a></dd>
              <dd><a href="http://localhost:8080/CRM/Employee/emp_edit.jsp" >修改用户信息</a></dd>
              <dd><a onclick="x_admin_show('切换帐号','http://www.baidu.com')">切换帐号</a></dd>
              <dd><a href="http://localhost:8080/CRM/login.jsp">退出</a></dd>
            </dl>
          </li>
          
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>客户管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    
                    <li>
                        <a _href="${pageContext.request.contextPath }/user/findUserByPage1.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>全部客户列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath }/clients/findClientsByPage.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>潜在客户</cite>
                        </a>
                    </li >
                    
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>商品管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li date-refresh="1">
                        <a _href="${pageContext.request.contextPath }/commodity/commodityall.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>鞋子列表</cite>
                            
                        </a>
                    </li>
                    <li date-refresh="1">
                        <a _href="${pageContext.request.contextPath }/commodity/commodityallbag.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>背包列表</cite>
                            
                        </a>
                    </li>
                    <li date-refresh="1">
                        <a _href="${pageContext.request.contextPath }/commodity/commodityallclothes.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>上衣列表</cite>
                            
                        </a>
                    </li>
                    <li date-refresh="1">
                        <a _href="${pageContext.request.contextPath }/commodity/commodityallpants.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>裤子列表</cite>
                            
                        </a>
                    </li>
                    <li date-refresh="1">
                        <a _href="${pageContext.request.contextPath }/commodity/commodityallsocks.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>袜子列表</cite>
                            
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>合同管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath }/contract/findContractByPage.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>全部合同</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>营销计划</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath }/market/findMarketByPage.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>全部营销计划</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="http://localhost:8080/CRM/Employee/SetMarket/smak_sel.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>营销计划跟踪</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>现场销售管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath }/programme/findProgrammeByPage.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>全部日程</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath }/quote/findQuoteByPage.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>报价表管理</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath }/eorder/findOrderByPage.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>订单管理</cite>
                        </a>
                    </li >
                     <li>
                        <a _href="http://localhost:8080/CRM/Employee/Order/ord_find.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>订单查询</cite>
                        </a>
                    </li >
                    
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>留言管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath }/massage/findMassageAllByPage.action">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>留言回复</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>图标字体</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="unicode.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>图标对应字体</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>其它页面</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="login.html" target="_blank">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>登录页面</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="error.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>错误页面</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
                <dl>
                    <dd data-type="this">关闭当前</dd>
                    <dd data-type="other">关闭其它</dd>
                    <dd data-type="all">关闭全部</dd>
                </dl>
          </div>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='http://localhost:8080/CRM/Backstage/welcome.jsp' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
          <div id="tab_show"></div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2017 x-admin v2.3 All Rights Reserved</div>  
    </div>
    <!-- 底部结束 -->
    <script>
    //百度统计可去掉
    var _hmt = _hmt || [];
    (function() {
      var hm = document.createElement("script");
      hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
      var s = document.getElementsByTagName("script")[0]; 
      s.parentNode.insertBefore(hm, s);
    })();
    </script>
</body>
</html>