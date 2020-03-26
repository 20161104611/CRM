package com.imnu.crm.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.imnu.crm.pojo.Eorder;
import com.imnu.crm.pojo.Sorder;
import com.imnu.crm.service.EOrderService;
import com.imnu.crm.service.SorderService;

@Controller
@RequestMapping("/eorder")
public class OrderController {
	
	@Autowired
	public EOrderService orderService;
	
	@Autowired
	public SorderService sOrderService;
	
	@RequestMapping("/addOrder")
	public String addOrder(Eorder eOrder,HttpSession session) {
		
		Calendar c = Calendar.getInstance();
        c.setTime(eOrder.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        eOrder.setDate(c.getTime());
        
		System.out.println(eOrder);
		
		eOrder.setNo("000000"+eOrder.getNo());
		orderService.addOrder(eOrder);
		
		return "redirect:findOrderByPage.action";
	}
	
	@RequestMapping("/findOrderByPage")
	public ModelAndView findOrderByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Eorder> list = orderService.findOrderByPage(page);


		PageInfo<Eorder> pageInfo = new PageInfo<Eorder>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/Order/ord_list");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("delectOrder")
	@ResponseBody
	public void delectOrder(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		orderService.DelectOrderById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	@RequestMapping("updateOrder")
	public String updateOrder(Eorder eOrder,HttpServletRequest request,MultipartFile path1,HttpServletResponse response,HttpSession session) throws IOException {
		
		System.out.println("修改");
		
		
		Calendar c = Calendar.getInstance();
        c.setTime(eOrder.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        eOrder.setDate(c.getTime());
        
        
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		orderService.updateOrder(id,eOrder);
		return "redirect:findOrderByPage.action";
	}
	
	
	@RequestMapping("findOrderByNo")
	public String findOrderByNo(HttpServletRequest request,HttpSession session)
	{
		String no = request.getParameter("no");
		System.out.println(no);
		//ModelAndView mv = new ModelAndView();
		List<Eorder> list = orderService.findOrderByNo(no);
		//mv.addObject("eorder", list);
		session.setAttribute("eorder", list);
		//mv.setViewName("Employee/Order/ord_list");
		return "redirect:findOrderByPage.action";
		
	}
	
	@RequestMapping("/addSOrder")
	public String addSOrder(Sorder sOrder,HttpSession session,HttpServletRequest request) {
		System.out.println(sOrder);
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		sOrderService.addSOrder(sOrder);
		
		return "redirect:sumSorderByEid.action?eid="+eid;
	}
	
	@RequestMapping("/findSOrderByPage")
	public ModelAndView findSOrderByPage(@RequestParam(required = true, defaultValue = "1") int page,int eid) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Sorder> list = sOrderService.findSOrderByPage(page,eid);


		PageInfo<Sorder> pageInfo = new PageInfo<Sorder>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/SOrder/sod_list");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("delectSOrder")
	public String delectSOrder(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		int eid = Integer.parseInt(request.getParameter("eid"));
		System.out.println(eid);
		sOrderService.DelectSOrderById(id);
		return "redirect:sumSorderByEid.action?eid="+eid;
	}
	@RequestMapping("updateSOrder")
	public String updateSOrder(Sorder sOrder,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
		
		System.out.println("修改");
		int eid = Integer.parseInt(request.getParameter("eid"));
		int id = Integer.parseInt(request.getParameter("id"));
		sOrderService.updateSOrder(id,sOrder);
		return "redirect:sumSorderByEid.action?eid="+eid;
	}
	
	@RequestMapping("sumSorderByEid")
	public String sumSorderByEid(Sorder sOrder,int eid,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
		System.out.println("总计");
		double sum = sOrderService.sumSorderByEid(eid);
		return "redirect:updateEorderByMoney.action?id="+eid+"&sum="+sum;
	}
	@RequestMapping("updateEorderByMoney")
	public String updateEorderByMoney(Eorder eOrder,int id,double sum,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
		
		orderService.updateEorderByMoney(id,sum);
		return "redirect:findOrderByPage.action?eid="+id;
	}
}
