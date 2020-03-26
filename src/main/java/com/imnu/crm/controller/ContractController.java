package com.imnu.crm.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imnu.crm.pojo.Contract;
import com.imnu.crm.service.ContractService;

@Controller
@RequestMapping("/contract")
public class ContractController {
	/**
	 * 合同管理
	 */
	@Autowired
	public ContractService contractService;
	/**
	 * 添加合同
	 * @param contract
	 * @param cPath1
	 * @param session
	 * @return
	 */
	@RequestMapping("/addContract")
	public String addContract(Contract contract ,MultipartFile cPath1,HttpSession session) {
		
		String result=uploadMultipartFile(cPath1);
		System.out.println(result);
		System.out.println(contract);
		
		Calendar c = Calendar.getInstance();
        c.setTime(contract.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        contract.setDate(c.getTime());
        
        
        c.setTime(contract.getlDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        contract.setlDate(c.getTime());
        
		if(result!="error") {
			contractService.addERecord(contract);
		}
		else
		{
			System.out.println("上传错误");
		}
		return "redirect:findContractByPage.action";
	}
	/**
	 * 分页查询所有合同
	 * @param page
	 * @return
	 */
	@RequestMapping("/findContractByPage")
	public ModelAndView findContractByPage(@RequestParam(required = true, defaultValue = "1") int page) {
		// PageHelper插件 select * from product limit 6,10;
		System.out.println(page);
		PageHelper.startPage(page, 3);
		List<Contract> list = contractService.findContractByPage(page);


		PageInfo<Contract> pageInfo = new PageInfo<Contract>(list);
//		new JsonResult(pageInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageInfo", pageInfo);

		mv.setViewName("Employee/Contract/cnt_list");
		System.out.println(pageInfo);
		return mv;
	}
	/**
	 * 删除合同信息
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping("delectContract")
	@ResponseBody
	public void DelectContract(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception
	{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		contractService.DelectContractById(id);
		PrintWriter out = response.getWriter();
		out.print("1");
	}
	/**
	 * 上传文件
	 * @param cPath1
	 * @return
	 */
	@RequestMapping("/upload")
	public String uploadMultipartFile(MultipartFile cPath1) {
		String filename = cPath1.getOriginalFilename();//原文件名
		System.out.println(filename);
		File dest = new File("D:\\img",filename);
		try {
			cPath1.transferTo(dest);
			return filename;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "error";
		
	}
	/**
	 * 修改合同信息
	 * @param contract
	 * @param request
	 * @param cPath1
	 * @param response
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("updatecontract")
	public String UpdateUser(Contract contract,HttpServletRequest request,MultipartFile cPath1,HttpServletResponse response,HttpSession session) throws IOException {
		String result=uploadMultipartFile(cPath1);
		System.out.println(result);
		System.out.println("修改");
		Calendar c = Calendar.getInstance();
        c.setTime(contract.getDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        contract.setDate(c.getTime());
        
        
        c.setTime(contract.getlDate());
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        contract.setlDate(c.getTime());
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		contractService.updateContract(id,contract);
		return "redirect:findContractByPage.action";
	}
	/**
	 * 下载文件（下载速度太慢，弃用）
	 * @param filename
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/download",method=RequestMethod.GET)
    public void download(@RequestParam(value="filename")String filename,
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        //模拟文件，myfile.txt为需要下载的文件  
//        String path = request.getSession().getServletContext().getRealPath("D:\\img")+"\\"+filename;  
		String path = "D:\\img\\"+filename;  
		//获取输入流  
        System.out.println(path);
        @SuppressWarnings("resource")
		InputStream bis = new BufferedInputStream(new FileInputStream(new File(path)));
        //转码，免得文件名中文乱码  
        filename = URLEncoder.encode(filename,"UTF-8");  
        //设置文件下载头  
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
        response.setContentType("multipart/form-data");   
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
    }
}
