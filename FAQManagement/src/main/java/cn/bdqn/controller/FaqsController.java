package cn.bdqn.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.bdqn.pojo.Classes;
import cn.bdqn.pojo.Faqs;
import cn.bdqn.service.ClassesService;
import cn.bdqn.service.FaqsService;

@Controller
public class FaqsController {

	@Autowired
	private FaqsService faqsService;
	
	@Autowired
	private ClassesService classesService;


	public void setFaqsService(FaqsService faqsService) {
		this.faqsService = faqsService;
	}

	@RequestMapping(value="f.html" ,method = RequestMethod.GET)
	public String provider(Model model,@RequestParam(value="title",required=false)String title,HttpSession session){
		if (session.getAttribute("fList")!=null) {
			session.removeAttribute("fList");
		}
		if(title != null && !"".equals(title)){
			try {
				title =new String(title.getBytes("ISO-8859-1"), "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		Map<String, Object> map = new HashMap<String, Object>();
		if(title != null && !"".equals(title)){
			map.put("title", title);
		}
		List<Faqs> fList=faqsService.findByAll(map);
		System.out.println(fList.size());

		session.setAttribute("fList", fList);

		return"fquery";
	}

	//跳转到添加页面    
	@RequestMapping(value="add.html")
	public String add(HttpSession session){
		//获取下拉框的  list
		List<Classes> cList=classesService.findByAll();
		session.setAttribute("cList", cList);
		return "add";
	}

	//添加的的实现方法
	@RequestMapping("addC.html")
	public String addC(HttpSession session,
			@RequestParam("id")Integer id,
			@RequestParam("title")String title,
			@RequestParam("content")String content){
		Faqs f=new Faqs();
		f.setClassid(id);
		f.setTitle(title);
		f.setContent(content);
		f.setCreatedate(new Date());
		Integer result=faqsService.saveFaqs(f);
		if(result==1){
			return "redirect:f.html";
		}else{
			return "add";
		}
	}

}
