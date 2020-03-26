package com.imnu.crm.controller;

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
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imnu.crm.pojo.Clients;
import com.imnu.crm.pojo.ERecord;
import com.imnu.crm.service.ClientsService;
import com.imnu.crm.service.ERecordService;

@Controller
@RequestMapping("/clients")
public class ClientsController {
	/**
	 * 潜在客户
	 */
	@Autowired
	public ClientsService clientsService;
	/**
	 * 潜在客户联系信息
	 */
	@Autowired
	public ERecordService eRecordService;
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	@RequestMapping("/findClientsByPage")
	public ModelAndView findClientsByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		List<Clients> list = clientsService.findUserByPage(page);


		PageInfo<Clients> pageInfo = new PageInfo<Clients>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/emp_list");
		System.out.println(pageInfo);
		return mv;
	}
	/**
	 * 添加潜在客户
	 * @param clients
	 * @param session
	 * @return
	 */
	@RequestMapping("/addClients")
	public String addClients(Clients clients ,HttpSession session) {
		
		clientsService.addClients(clients);
		
		return "redirect:findClientsByPage.action";
	}
	
	/**
	 * 删除潜在客户
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping("delectClients")
	@ResponseBody
	public void DelectClients(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		clientsService.DelectClientsById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	
	/**
	 * 添加联系记录
	 * @param eRecord
	 * @param session
	 * @return
	 */
	@RequestMapping("/addERecord")
	public String addERecord(ERecord eRecord ,HttpSession session) {
		System.out.println(eRecord);
		Calendar c = Calendar.getInstance();
        c.setTime(eRecord.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        eRecord.setDate(c.getTime());
		int eId=eRecord.geteId();
		System.out.println("id="+eId);
		eRecordService.addERecord(eRecord);
		
		return "redirect:updateClientsZT.action?id="+eId;
	}
	
	/**
	 * 修改潜在客户的联系状态为已联系
	 * @param clients
	 * @param id
	 * @param session
	 * @return
	 */
	@RequestMapping("/updateClientsZT")
	public String updateClientsZT(Clients clients ,int id,HttpSession session) {
		clients.setKehuztai("已联系");
		clientsService.updateClientsZT(clients,id);
		System.out.println("id="+id);
		return "redirect:findClientsByPage.action";
	}
	
	/**
	 * 根据id查询全在客户的所有联系信息
	 * @param page
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping("/findERecordByPage")
	public ModelAndView findERecordByPage(@RequestParam(required = true, defaultValue = "1") int page,HttpServletRequest request,HttpSession session) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 10);
		int id = Integer.parseInt(request.getParameter("eId"));
		System.out.println(id);
		List<ERecord> list = eRecordService.findUserByPage(page,id);
		session.setAttribute("id", id);

		PageInfo<ERecord> pageInfo = new PageInfo<ERecord>(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/Clients/cot_all");
		System.out.println(pageInfo);
		return mv;
	}
	
}
