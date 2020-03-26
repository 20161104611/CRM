<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Nixon : Profile</title>
	
	<!-- ================= Favicon ================== -->
    <!-- Standard -->
    <link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
    <!-- Retina iPad Touch Icon-->
    <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
    <!-- Retina iPhone Touch Icon-->
    <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
    <!-- Standard iPad Touch Icon--> 
    <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
    <!-- Standard iPhone Touch Icon--> 
    <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">
	
	<!-- Styles -->
    <link href="http://localhost:8080/CRM/assets/fontAwesome/css/fontawesome-all.min.css" rel="stylesheet">
    <link href="http://localhost:8080/CRM/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="http://localhost:8080/CRM/assets/css/lib/mmc-chat.css" rel="stylesheet" />
    <link href="http://localhost:8080/CRM/assets/css/lib/sidebar.css" rel="stylesheet">
    <link href="http://localhost:8080/CRM/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="http://localhost:8080/CRM/assets/css/lib/nixon.css" rel="stylesheet">
    <link href="http://localhost:8080/CRM/assets/css/style.css" rel="stylesheet">
    <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.2.min.js "></script>
    <script type="text/javascript" src="http://localhost:8080/CRM/js/jquery-2.2.3.min.js"></script>
</head>

<body>

    <div class="sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures">
        <div class="nano">
            <div class="nano-content">
                <ul>
                    <li class="active"><a class="sidebar-sub-toggle"><i class="ti-home"></i> Dashboard <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="http://localhost:8080/CRM/index.jsp">Dashboard 1</a></li>
                             
                        </ul>
                    </li>					
					
                      
                      
                    <li><a href="http://localhost:8080/CRM/home.jsp"   ><i class="ti-user"></i> 用户信息</a></li>
					<li><a class="sidebar-sub-toggle" ><i class="ti-layout"></i> 合同 <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="http://localhost:8080/CRM/nike/index.jsp">合同查询</a></li>
                            <li><a href="${pageContext.request.contextPath }/commodity/CRMall.action">我的合同</a></li>
                        </ul>
                    </li>
					<li><a class="sidebar-sub-toggle"><i class="ti-panel"></i>留言<span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="${pageContext.request.contextPath }/massage/findMassageByPage.action?mid=${user.id}">用户留言</a></li>
                        </ul>
                    </li>
					<li><a class="sidebar-sub-toggle"><i class="ti-bar-chart-alt"></i>  Charts  <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="chart-flot.html">Flot</a></li>
                              
                        </ul>
                    </li>	
					
					<li><a class="sidebar-sub-toggle"><i class="ti-layout-grid4-alt"></i> Table <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="table-basic.html">Basic</a></li> 
                        </ul>
                    </li>
					
					<li><a class="sidebar-sub-toggle"><i class="ti-heart"></i> Icons <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="font-themify.html">Themify</a></li>
                        </ul>
                    </li>
					
					 					
					
					<li><a href="form-basic.html"><i class="ti-view-list-alt"></i> Basic Form </a></li>					
					
					<li><a class="sidebar-sub-toggle"><i class="ti-files"></i> Invoice <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="invoice.html">Basic</a></li>
                            <li><a href="invoice-editable.html">Editable</a></li>
                        </ul>
                    </li>
					
					<li><a class="sidebar-sub-toggle"><i class="ti-target"></i> Pages <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="page-login.html">Login</a></li>
                            <li><a href="page-register.html">Register</a></li>
                            <li><a href="page-reset-password.html">Forgot password</a></li>
                        </ul>
                    </li>
					
                    <li><a target="_blank" href="#"><i class="ti-file"></i> Documentation</a></li>
                    <li><a href="http://localhost:8080/CRM/login.jsp"><i class="ti-close"></i> Logout</a></li>

                </ul>
            </div>
        </div>
    </div><!-- /# sidebar -->




    <div class="header">
        <div class="pull-left">
                        <div class="logo">
                <a href="index.html">
                    <img id="logoImg" 
                    src="http://localhost:8080/CRM/logo/logo.png" 
                    data-logo_big="logo/logo.png"
                    data-logo_small="logo/logoSmall.png"
                    alt="Nixon" />
                </a>
            </div>
            <div class="hamburger sidebar-toggle">
                <span class="ti-menu"></span>
            </div>
        </div>

        <div class="pull-right p-r-15">
            <ul>
                <li class="header-icon dib"><i class="ti-bell"></i>
                    <div class="drop-down">
                        <div class="dropdown-content-heading">
                            <span class="text-left">Recent Notifications</span>
                        </div>
                        <div class="dropdown-content-body">
                            <ul>
                                <li>
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/3.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Mr. Jane</div>
                                            <div class="notification-text">5 members joined today </div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/3.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Mariam</div>
                                            <div class="notification-text">likes a photo of you</div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/3.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Tasnim</div>
                                            <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/3.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Jane Roe</div>
                                            <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="text-center">
                                    <a href="#" class="more-link">See All</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li class="header-icon dib"><i class="ti-email"></i>
                    <div class="drop-down">
                        <div class="dropdown-content-heading">
                            <span class="text-left">2 New Messages</span>
                            <a href="app-email.html"><i class="ti-pencil-alt pull-right"></i></a>
                        </div>
                        <div class="dropdown-content-body">
                            <ul>
                                <li class="notification-unread">
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Jane Doe</div>
                                            <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                        </div>
                                    </a>
                                </li>

                                <li class="notification-unread">
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/2.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Jane Roe</div>
                                            <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/3.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Jane Doe</div>
                                            <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <img class="pull-left m-r-10 avatar-img" src="http://localhost:8080/CRM/assets/images/avatar/2.jpg" alt="" />
                                        <div class="notification-content">
                                            <small class="notification-timestamp pull-right">02:34 PM</small>
                                            <div class="notification-heading">Jane Roe</div>
                                            <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="text-center">
                                    <a href="#" class="more-link">See All</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <!-- 右侧小消息区 -->
				<li class="header-icon dib chat-sidebar-icon"><i class="ti-comments"></i></li>
                <li class="header-icon dib"><img class="avatar-img" src="http://localhost:8080/img/${user.img}" alt="" /> <span class="user-avatar">${user.name} <i class="ti-angle-down f-s-10"></i></span>
                    <div class="drop-down dropdown-profile">
                        
                        <div class="dropdown-content-body">
                            <ul>
                                <li><a href="http://localhost:8080/CRM/user_edit.jsp"><i class="ti-wallet"></i> <span>修改用户信息</span></a></li>
                                <li><a href="http://localhost:8080/CRM/user_password.jsp"><i class="ti-write"></i> <span>修改用户密码</span></a></li>
                                <li><a href="http://localhost:8080/CRM/login.jsp"><i class="ti-power-off"></i> <span>Logout</span></a></li>
                            </ul>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>

	<div class="chat-sidebar">
        <!-- BEGIN chat -->
        <div id="mmc-chat" class="color-default">
            <!-- BEGIN CHAT BOX -->
            <div class="chat-box">
                <!-- BEGIN CHAT BOXS -->
                <ul class="boxs"></ul>
                <!-- END CHAT BOXS -->
                <div class="icons-set">
                    <div class="stickers">
                        <div class="had-container">
                            <div class="row">
                                <div class="s12">
                                    <ul class="tabs" style="width: 100%;height: 60px;">
                                        <li class="tab col s3">
                                            <a href="#tab1" class="active">
                                                 <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" />
                                            </a>
                                        </li>
                                        <li class="tab col s3"><a href="#tab2">Test 2</a></li>
                                    </ul>
                                </div>
                                <div id="tab1" class="s12 tab-content">
                                    <ul>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                        <li> <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="" /></li>
                                    </ul>
                                </div>
                                <div id="tab2" class="s12 tab-content">Test 2</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END CHAT BOX -->
            <!-- BEGIN SIDEBAR -->
            <div id="sidebar" class="right scroll">
                <div class="had-container">
                    <!-- BEGIN USERS -->
                    <div class="users">

                        <ul class="user-list">
                            <!-- BEGIN USER-->
                            <li class="user-tooltip" data-id="1" data-status="online" data-username="Rufat Askerov" data-position="left" data-filter-item data-filter-name="rufat askerov">
                                <!-- BEGIN USER IMAGE-->
                                <div class="user-image">
                                    <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" class="avatar" alt="Rufat Askerov" />
                                </div>
                                <!-- END USER IMAGE-->
                                <!-- BEGIN USERNAME-->
                                <span class="user-name">Rufat Askerov</span>
								<span class="user-show"></span>
                                <!-- END USERNAME-->
                            </li>
                            <!-- END USER-->
                            <!-- BEGIN USER-->
                            <li class="user-tooltip" data-id="3" data-status="online" data-username="Alice" data-position="left" data-filter-item data-filter-name="alice">
                                <div class="user-image">
                                    <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" class="avatar" alt="Alice" />
                                </div>
                                <span class="user-name">Alice</span>
								<span class="user-show"></span>
                            </li>

                            <!-- BEGIN USER-->
                            <li class="user-tooltip" data-id="7" data-status="offline" data-username="Michael Scofield" data-position="left" data-filter-item data-filter-name="michael scofield">
                                <div class="user-image">
                                    <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" class="avatar" alt="Michael Scofield" />
                                </div>
                                <span class="user-name">Michael Scofield</span>
								<span class="user-show"></span>
                            </li>

                            <!-- BEGIN USER-->
                            <li class="user-tooltip" data-id="5" data-status="online" data-username="Irina Shayk" data-position="left" data-filter-item data-filter-name="irina shayk">
                                <div class="user-image">
                                    <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" class="avatar" alt="Irina Shayk" />
                                </div>
                                <span class="user-name">Irina Shayk</span>
								<span class="user-show"></span>
                            </li>

                            <!-- BEGIN USER-->
                            <li class="user-tooltip" data-id="6" data-status="offline" data-username="Sara Tancredi" data-position="left" data-filter-item data-filter-name="sara tancredi">
                                <div class="user-image">
                                    <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" class="avatar" alt="Sara Tancredi" />
                                </div>
                                <span class="user-name">Sara Tancredi</span>
								<span class="user-show"></span>
                            </li>

                            <!-- BEGIN USER-->
                            <li class="user-tooltip" data-id="7" data-status="offline" data-username="Jane" data-position="left" data-filter-item data-filter-name="Jane">
                                <div class="user-image">
                                    <img src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" class="avatar" alt="Jane" />
                                </div>
                                <span class="user-name">Jane</span>
								<span class="user-show"></span>
                            </li>
                        </ul>
						<div class="chat-user-search">
							<div class="input-group">
								<span class="input-group-addon"><i class="ti-search"></i></span>
								<input type="text" class="form-control" placeholder="Search"  data-search />
							</div>
						</div>
                    </div>
                    <!-- END USERS -->

                </div>
            </div>
            <!-- END SIDEBAR -->
        </div>
        <!-- END chat -->
    </div>
    <!-- END chat Sidebar-->

    <div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-0">
                        <div class="page-header">
                            <div class="page-title">
                                <h1>Dashboard 1</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 p-0">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">Dashboard</a></li>
                                    <li><a href="#">Pages</a></li>
                                    <li class="active">Profile</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="main-content">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="card alert">
                                <div class="card-body">
									<div class="user-profile">
										<div class="row">
											<div class="col-lg-4">
												<div class="user-photo m-b-30">
												<!-- 头像 -->
													<img class="img-responsive" src="http://localhost:8080/img/${user.img}" alt="" />
												</div>
												
												
											</div>
											<div class="col-lg-8">
												<div class="user-profile-name">${user.name }	</div>
												<div class="user-Location"><i class="ti-location-pin"></i> ${user.location }</div>
												<!-- 职责 -->
												<div class="user-job-title">Product Designer</div>
												<div class="ratings">
													<h4>Ratings</h4>
													<div class="rating-star">
														<span>8.9</span>
														<i class="ti-star color-primary"></i>
														<i class="ti-star color-primary"></i>
														<i class="ti-star color-primary"></i>
														<i class="ti-star color-primary"></i>
														<i class="ti-star"></i>
													</div>
												</div>
												<div class="custom-tab user-profile-tab">
													<ul class="nav nav-tabs" role="tablist">
														<li role="presentation" class="active"><a href="#1" aria-controls="1" role="tab" data-toggle="tab">About</a></li>
													</ul>
													<div class="tab-content">
														<div role="tabpanel" class="tab-pane active" id="1">
															<div class="contact-information">
																<h4>User information</h4>
																<div class="phone-content">
																	<span class="contact-title">Phone:</span>
																	<span class="phone-number">${user.phone }</span>
																</div>
																<div class="address-content">
																	<span class="contact-title">QQ:</span>
																	<span class="mail-address">${user.qq }</span>
																</div>
																<div class="email-content">
																	<span class="contact-title">Email:</span>
																	<span class="contact-email">${user.email}</span>
																</div>
																<div class="website-content">
																	<span class="contact-title">WeChat:</span>
																	<span class="contact-website">${user.weixin}</span>
																</div>
																
															</div>
															<div class="basic-information">
																<h4>Basic information</h4>
																<div class="birthday-content">
																	<span class="contact-title">Birthday:</span>
																	<span class="birth-date"><fmt:formatDate value="${user.date}" pattern="yyyy-MM-dd"/></span>
																</div>
																<div class="gender-content">
																	<span class="contact-title">Gender:</span>
																	<span class="gender">${user.gender}</span>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
                            </div>
                        </div><!-- /# column -->
						<div class="col-lg-6">
							<div class="row">
								<div class="col-lg-3">
									<div class="card">
										<div class="stat-widget-one">
											<div class="profile-widget">
												<div class="stat-text">Job Done</div>
												<div class="stat-digit">19</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-lg-3">
									<div class="card">
										<div class="stat-widget-one">
											<div class="profile-widget">
												<div class="stat-text">Ongoing</div>
												<div class="stat-digit">6</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-lg-3">
									<div class="card">
										<div class="stat-widget-one">
											<div class="profile-widget">
												<div class="stat-text">Reject</div>
												<div class="stat-digit">6</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-lg-3">
									<div class="card">
										<div class="stat-widget-one">
											<div class="profile-widget">
												<div class="stat-text">Upcomming</div>
												<div class="stat-digit">29</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-12">
									<div class="card alert">
										<div class="card-header">
											<h4>Task </h4>
											<div class="card-header-right-icon">
												<ul>
													<li class="card-close" data-dismiss="alert"><i class="ti-close"></i></li>
													 
												</ul>
											</div>
										</div>
										<div class="todo-list">
											<div class="tdl-holder">
												<div class="tdl-content">
													<ul>
														<li><label><input type="checkbox"><i></i><span>get up</span><a href='#' class="ti-close"></a></label></li>
														<li><label><input type="checkbox"><i></i><span>don't give up the fight.</span><a href='#' class="ti-close"></a></label></li>
														<li><label><input type="checkbox" checked><i></i><span>stand up</span><a href='#' class="ti-close"></a></label></li>
														<li><label><input type="checkbox"><i></i><span>don't give up the fight.</span><a href='#' class="ti-close"></a></label></li>
														<li><label><input type="checkbox" checked><i></i><span>do something else</span><a href='#' class="ti-close"></a></label></li>
													</ul>
												</div>
												<input type="text" class="tdl-new form-control" placeholder="Write new item and hit 'Enter'...">
											</div>
										</div>
									</div><!-- /# card -->
								</div>
							</div>
						</div><!-- /# column -->
                    </div><!-- /# row -->
					<div class="row">
						<div class="col-lg-6">
                            <div class="card alert">
                                <div class="card-header">
                                    <h4>Recent Project </h4>
									<div class="card-header-right-icon">
										<ul>
											<li class="card-close" data-dismiss="alert"><i class="ti-close"></i></li>
											<li class="card-option drop-menu"><i class="ti-settings" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" role="link"></i>
												<ul class="card-option-dropdown dropdown-menu">
													<li><a href="#"><i class="ti-loop"></i> Update data</a></li>
													<li><a href="#"><i class="ti-menu-alt"></i> Detail log</a></li>
													<li><a href="#"><i class="ti-pulse"></i> Statistics</a></li>
													<li><a href="#"><i class="ti-power-off"></i> Clear ist</a></li>
												</ul>
											</li>
											 
										</ul>
									</div>
                                </div>
                                <div class="card-body">
                                    <table class="table table-responsive table-hover ">
                                        <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>Status</th>
                                                <th>Date</th>
                                                <th>Price</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Kolor Tea Shirt For Man</td>
                                                <td><span class="badge badge-primary">Ongoing</span></td>
                                                <td>January 22</td>
                                                <td class="color-primary">$21.56</td>
                                            </tr>
                                            <tr>
                                                <td>Kolor Tea Shirt For Women</td>
                                                <td><span class="badge badge-success">Complete</span></td>
                                                <td>January 30</td>
                                                <td class="color-success">$55.32</td>
                                            </tr>
                                            <tr>
                                                <td>Blue Backpack For Baby</td>
                                                <td><span class="badge badge-danger">Rejected</span></td>
                                                <td>January 25</td>
                                                <td class="color-danger">$14.85</td>
                                            </tr>
                                            <tr>
                                                <td>Kolor Tea Shirt For Man</td>
                                                <td><span class="badge badge-primary">Ongoing</span></td>
                                                <td>January 22</td>
                                                <td class="color-primary">$21.56</td>
                                            </tr>
                                            <tr>
                                                <td>Kolor Tea Shirt For Women</td>
                                                <td><span class="badge badge-success">Complete</span></td>
                                                <td>January 30</td>
                                                <td class="color-success">$55.32</td>
                                            </tr>
                                            <tr>
                                                <td>Blue Backpack For Baby</td>
                                                <td><span class="badge badge-danger">Rejected</span></td>
                                                <td>January 25</td>
                                                <td class="color-danger">$14.85</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div><!-- /# column -->
						<div class="col-lg-6">
                            <div class="card alert">
                                <div class="card-header">
                                    <h4>Recent Comments </h4>
                                    <div class="card-header-right-icon">
                                        <ul>
                                            <li class="card-close" data-dismiss="alert"><i class="ti-close"></i></li>
                                             
                                        </ul>
                                    </div>
                                </div>
                                <div class="recent-comment">
									<div class="media">
										<div class="media-left">
											<a href="#"><img class="media-object" src="http://localhost:8080/CRM/assets/images/avatar/1.jpg" alt="..."></a>
										</div>
										<div class="media-body">
											<h4 class="media-heading">John Doe</h4>
											<p>Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. </p>
											<div class="comment-action">
												<div class="badge badge-success">Approved</div>
												<span class="m-l-10">
													<a href="#"><i class="ti-check color-success"></i></a>
													<a href="#"><i class="ti-close color-danger"></i></a>
													<a href="#"><i class="fa fa-reply color-primary"></i></a>
												</span>
											</div>
											<p class="comment-date">May 20, 2018</p>
										</div>
									</div>
									<div class="media">
										<div class="media-left">
											<a href="#"><img class="media-object" src="http://localhost:8080/CRM/assets/images/avatar/2.jpg" alt="..."></a>
										</div>
										<div class="media-body">
											<h4 class="media-heading">Jane Roe</h4>
											<p>Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. </p>
											<div class="comment-action">
												<div class="badge badge-warning">Pending</div>
												<span class="m-l-10">
													<a href="#"><i class="ti-check color-success"></i></a>
													<a href="#"><i class="ti-close color-danger"></i></a>
													<a href="#"><i class="fa fa-reply color-primary"></i></a>
												</span>
											</div>
											<p class="comment-date">May 20, 2018</p>
										</div>
									</div>
									<div class="media no-border">
										<div class="media-left">
											<a href="#"><img class="media-object" src="http://localhost:8080/CRM/assets/images/avatar/3.jpg" alt="..."></a>
										</div>
										<div class="media-body">
											<h4 class="media-heading">Mr. Jane</h4>
											<p>Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. </p>
											<div class="comment-action">
												<div class="badge badge-danger">Rejected</div>
												<span class="m-l-10">
													<a href="#"><i class="ti-check color-success"></i></a>
													<a href="#"><i class="ti-close color-danger"></i></a>
													<a href="#"><i class="fa fa-reply color-primary"></i></a>
												</span>
											</div>
											<div class="comment-date">May 20, 2018</div>
										</div>
									</div>
								</div>
							</div><!-- /# card -->
						</div><!-- /# column -->
					</div>     </div>
     <!-- /# main content -->Copyright &copy; 2019.Company name All rights reserved.<a target="_blank" href="http://www.aspku.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
            </div><!-- /# container-fluid -->
        </div><!-- /# main -->
    </div><!-- /# content wrap -->






    <script src="http://localhost:8080/CRM/assets/js/lib/jquery.min.js"></script><!-- jquery vendor -->
    <script src="http://localhost:8080/CRM/assets/js/lib/jquery.nanoscroller.min.js"></script><!-- nano scroller -->
    <script src="http://localhost:8080/CRM/assets/js/lib/sidebar.js"></script><!-- sidebar -->
    <script src="http://localhost:8080/CRM/assets/js/lib/bootstrap.min.js"></script><!-- bootstrap -->
    <script src="http://localhost:8080/CRM/assets/js/lib/mmc-common.js"></script>
    <script src="http://localhost:8080/CRM/assets/js/lib/mmc-chat.js"></script>
    <script src="http://localhost:8080/CRM/assets/js/scripts.js"></script><!-- scripit init-->


    
	


</body>

</html>