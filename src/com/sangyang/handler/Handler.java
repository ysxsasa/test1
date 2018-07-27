package com.sangyang.handler;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sangyang.impl.FilghtImplDao;
import com.sangyang.vo.Filght;

@Controller
public class Handler {
	@Autowired
	private FilghtImplDao dao;
	@RequestMapping("/queryfil")
	public ModelAndView queryfil( ){
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",dao.queryFilght() );
		mv.setViewName("main");
		return mv;
		
	}
	@RequestMapping("/add")
	public String add( Filght filght){
		dao.addFilght(filght);
		return "redirect:queryfil.sm";
	}
	
	@RequestMapping("/upd")
	public ModelAndView queryupd( Integer hid){
		ModelAndView mv=new ModelAndView();
		Filght queryupd = dao.queryupd(hid);
		mv.addObject("queryupd",queryupd);
		mv.setViewName("update");
		return mv;
	}
	
	@RequestMapping("/upda")
	public String queryupda( Filght filght){
		dao.queryupda(filght);
		return "redirect:queryfil.sm";
	}
	
}
