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
import com.imnu.crm.pojo.Programme;
import com.imnu.crm.pojo.Sprogramme;
import com.imnu.crm.service.ProgrammeService;
import com.imnu.crm.service.SProgrammeService;

@Controller
@RequestMapping("/programme")
public class ProgrammeController {
	
	@Autowired
	public ProgrammeService programmeService;
	
	@Autowired
	public SProgrammeService sProgrammeService;
	
	@RequestMapping("/addProgramme")
	public String addProgramme(Programme programme,HttpSession session) {
		
		System.out.println(programme);
		
		programmeService.addProgramme(programme);
		
		return "redirect:findProgrammeByPage.action";
	}
	
	@RequestMapping("/findProgrammeByPage")
	public ModelAndView findProgrammeByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 3);
		List<Programme> list = programmeService.findProgrammeByPage(page);


		PageInfo<Programme> pageInfo = new PageInfo<Programme>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/Programme/pro_list");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("delectProgramme")
	@ResponseBody
	public void delectProgramme(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		programmeService.DelectProgrammeById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	@RequestMapping("updateProgramme")
	public String updateProgramme(Programme programme,HttpServletRequest request,MultipartFile path1,HttpServletResponse response,HttpSession session) throws IOException {
		
		System.out.println("修改");
		
		
		Calendar c = Calendar.getInstance();
        c.setTime(programme.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        programme.setDate(c.getTime());
        
        
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		programmeService.updateProgramme(id,programme);
		return "redirect:findProgrammeByPage.action";
	}
	
	@RequestMapping("/findSProgrammeByPage")
	public ModelAndView findSProgrammeByPage(@RequestParam(required = true, defaultValue = "1") int page,int id) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Sprogramme> list = sProgrammeService.findSProgrammeByPage(page,id);
		

		PageInfo<Sprogramme> pageInfo = new PageInfo<Sprogramme>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/SProgramme/spro_list");
		System.out.println(pageInfo);
		return mv;
	}
	
	@RequestMapping("/addSProgramme")
	public String addSProgramme(Sprogramme sProgramme,HttpSession session,HttpServletRequest request) {
		
		System.out.println(sProgramme);
		int pid = Integer.parseInt(request.getParameter("pid"));
		System.out.println(pid);
		sProgrammeService.addProgramme(sProgramme);
		
		return "redirect:findSProgrammeByPage.action?id="+pid;
	}
	
	@RequestMapping("updateSProgramme")
	public String updateSProgramme(Sprogramme sProgramme,HttpServletRequest request,MultipartFile path1,HttpServletResponse response,HttpSession session) throws IOException {
		
		System.out.println("修改");
		Calendar c = Calendar.getInstance();
        c.setTime(sProgramme.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        sProgramme.setDate(c.getTime());
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		int pid = Integer.parseInt(request.getParameter("pid"));
		System.out.println(pid);
		sProgrammeService.updateSProgramme(id,sProgramme);
		return "redirect:findSProgrammeByPage.action?id="+pid;
	}
	
	@RequestMapping("delectSProgramme")
	@ResponseBody
	public void delectSProgramme(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		sProgrammeService.DelectSProgrammeById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
}
