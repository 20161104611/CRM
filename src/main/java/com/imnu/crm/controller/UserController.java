package com.imnu.crm.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imnu.crm.pojo.User;
import com.imnu.crm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	/**
	 * 用户登录验证
	 * @param user
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login(User user,HttpSession session,HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		User u = userService.login(user);
		
		System.out.println(u);
		if(u!=null)
		{
			//session.setAttribute("user", u);
			if(u.getFlag().equals("1"))
			{
				session.setAttribute("user", u);
				List<User> list = userService.fildAll();
				mv.addObject("list", list);
				mv.setViewName("Backstage/user");
			}
			else if(u.getFlag().equals("3"))
			{
				session.setAttribute("user", u);
				mv.setViewName("home");
			}
			else {
				session.setAttribute("user", u);
				List<User> list = userService.fildAll1();
				mv.addObject("list", list);
				mv.setViewName("Employee/user");
			}
			mv.addObject("user",u);
			return mv;
		}
		else
		{
			mv.setViewName("login");
			return mv;
		}
		
	}
	
	
	/**
	 * 注册
	 * @param user
	 * @param img1
	 * @param session
	 * @return
	 */
	@RequestMapping("/register")
	public ModelAndView register(User user,HttpSession session) {
		
		
		ModelAndView mv = new ModelAndView();
		Calendar c = Calendar.getInstance();
        c.setTime(user.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        user.setDate(c.getTime());
		mv.setViewName("login");
			userService.register(user);
		
		return mv;
	}
	
	/**
	 * 验证用户账号是否已经存在
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping("/verifyname")
	public void VerifyName(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		String usercord = request.getParameter("usercord");
		PrintWriter out = response.getWriter();
		//trim() 去除字符串的头尾空格
		if(usercord.trim().equals(""))
		{
			out.print(2);//2是不能为空
		}
		else {
			int sum = userService.VerifyName(usercord);
			if(sum==0)
			{
				out.print(1);//1用户名已存在
			}
			else
			{
				out.print("error");//用户名可以用
			}
		}
	}
	
	/**
	 * 上传头像
	 * @param img1
	 * @return
	 */
	@RequestMapping("/upload")
	public String uploadMultipartFile(MultipartFile img1) {
		String filename = img1.getOriginalFilename();//原文件名
		System.out.println(filename);
		File dest = new File("D:\\img",filename);
		try {
			img1.transferTo(dest);
			return filename;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "error";
		
	}
	/*
	 * 查询所用户信息(不包括管理员，通过flag字段控制)
	 */
	@RequestMapping("userall")
	public ModelAndView SelectUserAll()
	{
		List<User> list = new ArrayList<User>();
		ModelAndView mv = new ModelAndView();
		list = userService.fildAll();
		mv.addObject("list", list);
		
		mv.setViewName("Backstage/list");
		return mv;
		
	}
	
	/**
	 * 删除用户信息
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping("delectuser")
	@ResponseBody
	public void DelectUser(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		userService.DelectUserById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	/*
	 * 修改用户信息
	 */
	@RequestMapping("updateuser")
	public String UpdateUser(User user,HttpServletRequest request,MultipartFile img1,HttpServletResponse response,HttpSession session) throws IOException {
		String result=uploadMultipartFile(img1);
		System.out.println(result);
		Calendar c = Calendar.getInstance();
        c.setTime(user.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        user.setDate(c.getTime());
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		userService.updateUser(id,user);
		return "redirect:http://localhost:8080/CRM/Employee/user.jsp";
	}
	
	@RequestMapping("updateuser1")
	public ModelAndView UpdateUser1(User user,HttpServletRequest request,MultipartFile img1,HttpServletResponse response,HttpSession session) throws IOException {
		String result=uploadMultipartFile(img1);
		System.out.println(result);
		Calendar c = Calendar.getInstance();
        c.setTime(user.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        user.setDate(c.getTime());
		int id = Integer.parseInt(request.getParameter("id"));
		ModelAndView mv = new ModelAndView();
		System.out.println(id);
		userService.updateUser(id,user);
		session.setAttribute("user", user);
		mv.setViewName("home");
		return mv;
		
	}
	@RequestMapping("updatepassword1")
	public ModelAndView UpdatePassword1(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String oldpass = request.getParameter("oldpass");
		String newpass = request.getParameter("newpass");
		ModelAndView mv = new ModelAndView();
		userService.updatepassword(id,oldpass,newpass);
		mv.setViewName("home");
		return mv;
	}
	
	/**
	 * 修改密码
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("updatepassword")
	public String UpdatePassword(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String oldpass = request.getParameter("oldpass");
		String newpass = request.getParameter("newpass");
		userService.updatepassword(id,oldpass,newpass);
		return "login";
	} 
	@RequestMapping("updatepassword2")
	public String UpdatePassword2(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		System.out.println("++++++++++++++");
		String usercord = request.getParameter("usercord");
		System.out.println(usercord);
		int id = Integer.parseInt(request.getParameter("id"));
		String oldpass = request.getParameter("oldpass");
		String newpass = request.getParameter("newpass");
		userService.updatepassword(id,oldpass,newpass);
		return "login";
	}
	@RequestMapping("/findUserByPage")
	public ModelAndView findUserByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 3);
		List<User> list = userService.findUserByPage(page);


		PageInfo<User> pageInfo = new PageInfo<User>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Backstage/list");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("/findUserByPage1")
	public ModelAndView findUserByPage1(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 3);
		List<User> list = userService.findUserByPage1(page);


		PageInfo<User> pageInfo = new PageInfo<User>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/list");
		System.out.println(pageInfo);
		return mv;
	}
	

}

