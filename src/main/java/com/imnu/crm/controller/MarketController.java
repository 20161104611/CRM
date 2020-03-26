package com.imnu.crm.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
import com.imnu.crm.pojo.Market;
import com.imnu.crm.pojo.Setmarket;
import com.imnu.crm.service.MarketService;
import com.imnu.crm.service.SetMarketService;

@Controller
@RequestMapping("/market")
public class MarketController {
	/**
	 * 营销计划
	 */
	@Autowired
	public MarketService marketService;
	/**
	 * 营销计划跟踪
	 */
	@Autowired
	public SetMarketService setMarketService;
	/**
	 * 添加营销计划
	 * @param market
	 * @param path1
	 * @param session
	 * @return
	 */
	@RequestMapping("/addMarket")
	public String addMarket(Market market ,MultipartFile path1,HttpSession session) {
		
		String result=uploadMultipartFile(path1);
		System.out.println(result);
		System.out.println(market);
		
		if(result!="error") {
			marketService.addERecord(market);
		}
		else
		{
			System.out.println("上传错误");
		}
		return "redirect:findMarketByPage.action";
	}
	
	/**
	 * 分页查询营销计划（10条一页）
	 * @param page
	 * @return
	 */
	@RequestMapping("/findMarketByPage")
	public ModelAndView findMarketByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Market> list = marketService.findContractByPage(page);
		PageInfo<Market> pageInfo = new PageInfo<Market>(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);
		mv.setViewName("Employee/Market/mak_list");
		System.out.println(pageInfo);
		return mv;
	}
	
	/**
	 * 删除营销计划
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping("delectMarket")
	@ResponseBody
	public void DelectMarket(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		marketService.DelectMarketById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	
	/**
	 * 修改营销计划
	 * @param market
	 * @param request
	 * @param path1
	 * @param response
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("updateMarket")
	public String UpdateMarket(Market market,HttpServletRequest request,MultipartFile path1,HttpServletResponse response,HttpSession session) throws IOException {
		String result=uploadMultipartFile(path1);
		System.out.println(result);
		System.out.println("修改");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		marketService.updateMarket(id,market);
		return "redirect:findMarketByPage.action";
	}
	
	
	/**
	 * 上传文件
	 * @param path1
	 * @return
	 */
	@RequestMapping("/upload")
	public String uploadMultipartFile(MultipartFile path1) {
		String filename = path1.getOriginalFilename();//原文件名
		System.out.println(filename);
		File dest = new File("D:\\img",filename);
		try {
			path1.transferTo(dest);
			return filename;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "error";
		
	}
	
	/**
	 * 添加营销计划跟踪记录
	 * @param setMarket
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping("/addSetMarket")
	public String addSetMarket(Setmarket setMarket,HttpSession session,HttpServletRequest request) {
		
		String id = request.getParameter("mid");
		System.out.println(id);
		System.out.println(setMarket);
		
		setMarketService.addSetMarket(setMarket);
		
		return "redirect:sumSetMarket.action?mid="+id;
	}
	/*
	 * 通过输入的营销项目名
	 * 查询对应项目的id值
	 * 并把营销项目名放到session容器中
	 */
	@RequestMapping("findMarketByName")
	public String findMarketByName(HttpServletRequest request,HttpSession session)
	{
		
		String name = request.getParameter("name");
		System.out.println(name);
		
		int id = marketService.selMarketByName(name);
		System.out.println(id);
		if(id==0)
		{
			return "redirect:findSetMarketByPage.action?id="+id;
		}
		else
		{
			session.setAttribute("mname", name);
			return "redirect:findSetMarketByPage.action?id="+id;
		}
	}
	
	/**
	 * 根据id分页查询营销计划跟踪记录
	 * @param page
	 * @param id
	 * @return
	 */
	@RequestMapping("/findSetMarketByPage")
	public ModelAndView findSetMarketByPage(@RequestParam(required = true, defaultValue = "1") int page,int id) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Setmarket> list = setMarketService.findSetMarketByPage(page,id);
		PageInfo<Setmarket> pageInfo = new PageInfo<Setmarket>(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("mid",id);
		mv.setViewName("Employee/SetMarket/smak_sel");
		System.out.println(pageInfo);
		return mv;
	}
	
	/**
	 * 修改营销计划跟踪记录内容
	 * @param setMarket
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/updateSetMarket")
	public String updateSetMarket(Setmarket setMarket,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
		
		System.out.println("修改");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		int mid = Integer.parseInt(request.getParameter("mid"));
		System.out.println(mid);
		double shjshour = Double.parseDouble(request.getParameter("shjshour"));
		System.out.println(shjshour);
		setMarket.setShjshour(shjshour);
		setMarketService.updateSetMarket(id,setMarket);
		return "redirect:sumSetMarket.action?mid="+mid;
	}
	
	
	/**
	 * 计算营销计划的实际收入
	 * @param setMarket
	 * @param mid
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/sumSetMarket")
	public String sumSetMarket(Setmarket setMarket,int mid,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
		
		System.out.println("总计");
		double sum=setMarketService.sumSetMarket(mid);
		System.out.println("sum"+sum);
		return "redirect:updateMarketShour.action?id="+mid+"&sum="+sum;
	}
	
	
	/**
	 * 修改营销计划的实际收入
	 * @param market
	 * @param id
	 * @param sum
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/updateMarketShour")
	public String updateMarketShour(Market market,int id,double sum,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
		
		System.out.println("总计");
		marketService.updateMarketShour(id,sum);
		return "redirect:findSetMarketByPage.action?id="+id;
	}
	
	
	/**
	 * 删除营销计划跟踪记录
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("delectSetMarket")
	public String DelectSetMarket(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		int mid = Integer.parseInt(request.getParameter("mid"));
		System.out.println(mid);
		setMarketService.DelectSetMarketById(id);
		return "redirect:sumSetMarket.action?mid="+mid;
	}
}
