package com.imnu.crm.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//相当于xml文件
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	//加载Spring IOC 配置
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{};
	}
	//加载DispatcherServlet的URL配置文件 相当于加载Config.java
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {Config.class};
	}
	//DispatcherServlet拦截请求设置
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"*.action"};
	}
	@Override
	protected void customizeRegistration(Dynamic registration) {
		registration.setMultipartConfig(new MultipartConfigElement("D:/img",20971520,41943040,0));
	}

}
