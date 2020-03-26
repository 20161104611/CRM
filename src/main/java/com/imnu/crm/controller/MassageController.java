package com.imnu.crm.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imnu.crm.pojo.Massage;
import com.imnu.crm.pojo.Smassage;
import com.imnu.crm.pojo.User;
import com.imnu.crm.service.MassageService;
import com.imnu.crm.service.SmassageService;
import com.imnu.crm.service.UserService;

@Controller
@RequestMapping("/massage")
public class MassageController {

	@Autowired
	public MassageService massageService;
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public SmassageService sMassageService;
	
	@RequestMapping("/add")
	public String addMassage(Massage massage,HttpSession session,HttpServletRequest request) {
		
		Integer mid = Integer.parseInt(request.getParameter("mid"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date=df.format(new Date());// new Date()为获取当前系统时间
        
        System.out.println("时间转换为时间戳:"+dateToStamp(date));
        
        massage.setSdate(dateToStamp(date));
        massage.setDate(date);
        massageService.addMassage(massage);
		return "redirect:findMassageByPage.action?mid="+mid;
	}
	
	@RequestMapping("/findMassageByPage")
	public ModelAndView findMassageByPage(@RequestParam(required = true, defaultValue = "1") int page,int mid) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Massage> list = massageService.findMassageByPage(page,mid);
		//按照时间戳排序
				Collections.sort(list, new Comparator<Massage>(){

		            @Override
		            public int compare(Massage stu1, Massage stu2) {
		                // TODO Auto-generated method stub
		                return Integer.parseInt(stu1.getSdate())-Integer.parseInt(stu2.getSdate());
		            }

		        });
		PageInfo<Massage> pageInfo = new PageInfo<Massage>(list);
		List<Smassage> list1 = sMassageService.findMassageAllByPage(page);
		//按照时间戳排序
		Collections.sort(list1, new Comparator<Smassage>(){

            @Override
            public int compare(Smassage stu1, Smassage stu2) {
                // TODO Auto-generated method stub
                return Integer.parseInt(stu1.getSdate())-Integer.parseInt(stu2.getSdate());
            }

        });
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("smassage", list1);
		mv.setViewName("Backstage/message");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("delMassage")
	@ResponseBody
	public void DelectMarket(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		massageService.DelectMassageById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	
	@RequestMapping("/findUserByPage")
	public ModelAndView findUserByPage1(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 3);
		List<User> list = userService.findUserByPage1(page);


		PageInfo<User> pageInfo = new PageInfo<User>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/Contract/cnt_name");
		System.out.println(pageInfo);
		return mv;
	}
	/*
	 * 时间转化为时间戳函数
	 */
	public static String dateToStamp(String s){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String res = "";    
        if (!"".equals(s)) {
        	try {
        		res = String.valueOf(sdf.parse(s).getTime()/1000);
			} catch (Exception e) {
				System.out.println("传入了null值");
			}			
		}else {	
			long time = System.currentTimeMillis();  
			res = String.valueOf(time/1000);
		}
                 
        return res;         
    }
	
	@RequestMapping("/findMassageAllByPage")
	public ModelAndView findMassageAllByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Smassage> list = sMassageService.findMassageAllByPage(page);
		//按照时间戳排序
		Collections.sort(list, new Comparator<Smassage>(){

	            @Override
	            public int compare(Smassage stu1, Smassage stu2) {
	                // TODO Auto-generated method stub
	                return Integer.parseInt(stu1.getSdate())-Integer.parseInt(stu2.getSdate());
	            }

	        });
	       
		PageInfo<Smassage> pageInfo = new PageInfo<Smassage>(list);
		List<Massage> list1 = massageService.findMassageAllByPage(page);
		//按照时间戳排序
		Collections.sort(list1, new Comparator<Massage>(){

            @Override
            public int compare(Massage stu1, Massage stu2) {
                // TODO Auto-generated method stub
                return Integer.parseInt(stu1.getSdate())-Integer.parseInt(stu2.getSdate());
            }

        });
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("massage",list1);
		mv.setViewName("Employee/SMassage/smg_list");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("/addSmassage")
	public String addSMassage(Smassage sMassage,HttpSession session,HttpServletRequest request) {
		
		Integer mid = Integer.parseInt(request.getParameter("mid"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date=df.format(new Date());// new Date()为获取当前系统时间
        
        System.out.println("时间转换为时间戳:"+dateToStamp(date));
        
        sMassage.setSdate(dateToStamp(date));
        sMassage.setDate(date);
        sMassage.setMid(mid);
        sMassageService.addSMassage(sMassage);
		return "redirect:findMassageAllByPage.action";
	}
	
	@RequestMapping("/addSmassage1")
	public String addSMassage1(Smassage sMassage,HttpSession session,HttpServletRequest request) {
		
		Integer mid = Integer.parseInt(request.getParameter("mid"));
		Integer hid = Integer.parseInt(request.getParameter("hid"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date=df.format(new Date());// new Date()为获取当前系统时间
        
        System.out.println("时间转换为时间戳:"+dateToStamp(date));
        
        sMassage.setSdate(dateToStamp(date));
        sMassage.setDate(date);
        sMassage.setMid(mid);
        sMassageService.addSMassage(sMassage);
        return "redirect:findMassageByPage.action?mid="+hid;
	}

}
