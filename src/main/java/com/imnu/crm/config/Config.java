package com.imnu.crm.config;

import java.io.IOException;
import java.util.Properties;

import javax.imageio.IIOException;
import javax.sql.DataSource;

import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;

//读取配置文件
@Configuration
//扫描包
@ComponentScan("com.imnu.crm")
//开启mvc的注解
@EnableWebMvc
//开启事务
@EnableTransactionManagement
//读取properties配置文件
@PropertySource("classpath:application.properties")
//读取Mapper接口
@MapperScan("com.imnu.crm.mapper")
public class Config {
	
	@Value("${jdbc.driver}")
	private String classdriver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${mybatis.type.alias.package}")
	private String aliasPackage;
	@Value("${mybatis.mapper.mapperLocations}")
	private String mapperLocations;
	//视图解析器
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	//DataSource 数据源
	@Bean
	public DataSource getDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setDriverClassName(classdriver);
		druidDataSource.setUrl(url);
		druidDataSource.setUsername(username);
		druidDataSource.setPassword(password);
		return druidDataSource;
	}
	//事务管理器
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	//创建SqlSessionFactoryBean
	
	@Bean
	public PageInterceptor getPageInterceptor(){
		PageInterceptor pageIntercptor=new PageInterceptor();
		Properties properties=new Properties();
		properties.setProperty("value", "true");
		pageIntercptor.setProperties(properties);
		return pageIntercptor;
	}

	// sqlSessionFactory
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource,PageInterceptor pageInterceptor) throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		// 别名
		sqlSessionFactoryBean.setTypeAliasesPackage(aliasPackage);
		
		PathMatchingResourcePatternResolver classPathResource = new PathMatchingResourcePatternResolver();
		// mapper.xml配置文件
		sqlSessionFactoryBean.setMapperLocations(classPathResource.getResources(mapperLocations));
		
		 //log4j配置
		 org.apache.ibatis.session.Configuration  configuration=new org.apache.ibatis.session.Configuration();
		 configuration.setLogImpl(Log4jImpl.class);
		 sqlSessionFactoryBean.setConfiguration(configuration);

		//pageInterceptor的设置
		Interceptor[] plugins={pageInterceptor};
		sqlSessionFactoryBean.setPlugins(plugins);
		return sqlSessionFactoryBean;
	}
		
	@Bean
	public MultipartResolver multipartResolver()  throws IIOException
	{
		return new StandardServletMultipartResolver();
	}
}
