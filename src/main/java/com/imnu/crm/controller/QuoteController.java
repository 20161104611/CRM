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
import com.imnu.crm.pojo.Quote;
import com.imnu.crm.service.QuoteService;

@Controller
@RequestMapping("/quote")
public class QuoteController {

	@Autowired
	public QuoteService quoteService;
	
	@RequestMapping("/addQuote")
	public String addQuote(Quote quote,MultipartFile img1,HttpSession session) {
		
		String result=uploadMultipartFile(img1);
		System.out.println(result);
		System.out.println(quote);
		
		if(result!="error") {
			quoteService.addQuote(quote);
		}
		else
		{
			System.out.println("上传错误");
		}
		return "redirect:findQuoteByPage.action";
	}
	
	@RequestMapping("/findQuoteByPage")
	public ModelAndView findQuoteByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Quote> list = quoteService.findQuoteByPage(page);


		PageInfo<Quote> pageInfo = new PageInfo<Quote>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/Quote/qte_list");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("delectQuote")
	@ResponseBody
	public void delectQuote(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		quoteService.DelectQuoteById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	@RequestMapping("updateQuote")
	public String UpdateMarket(Quote quote,HttpServletRequest request,MultipartFile img1,HttpServletResponse response,HttpSession session) throws IOException {
		String result=uploadMultipartFile(img1);
		System.out.println(result);
		System.out.println("修改");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		quoteService.updateQuote(id,quote);
		return "redirect:findQuoteByPage.action";
	}
	
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
}
