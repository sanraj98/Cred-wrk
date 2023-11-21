package com.cruds;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlrcls {
	@Autowired
	private BikeDaoIn bin;
	@Autowired
	private UsersDaoIn usrd;
	@RequestMapping("/lok")
	public ModelAndView lokin() {
		ModelAndView min=new ModelAndView();
		min.setViewName("Login.jsp");
		return min;
	}
	@RequestMapping("/rg")
	public ModelAndView regisfrm(Model mr) {
		ModelAndView mrs=new ModelAndView();
		//Users urs=new Users();
		//mr.addAttribute("users", urs);
		mrs.setViewName("Reg.jsp");
		return mrs;
	}
	@RequestMapping("/main")
	public ModelAndView mainpg() {
		return new ModelAndView("main.jsp");
	}
	@GetMapping("/showfrm")
	public ModelAndView showfrm(Model ma) {
		ModelAndView mn=new ModelAndView();
		Bikes bek=new Bikes();
		ma.addAttribute("bikr", bek);
		mn.setViewName("addform.jsp");
		return mn;
	}
	@GetMapping("/updfrm")
	public ModelAndView updfrm(Model mu,@RequestParam("upid")int upid) {
		Bikes b2=bin.getbik(upid);
		ModelAndView mup=new ModelAndView();
		System.out.println(b2);
		mu.addAttribute("bir", b2);
		mup.setViewName("updatefrm.jsp");
		return mup;
	}
	@PostMapping("/addfrm")
	public ModelAndView addbik(@ModelAttribute("bikr")Bikes byk) {
		ModelAndView mi=new ModelAndView();
		bin.addbik(byk);
		mi.setViewName("/showlist");
		return mi;
	}
	@RequestMapping("/showlist")
	public ModelAndView showlst() {
		ModelAndView ml=new ModelAndView();
		List<Bikes> bk=bin.getlist();
		for(Bikes bl:bk) {
			System.out.println(bl);
		}
		ml.addObject("bik",bk);
		ml.setViewName("showlist.jsp");
		return ml;
	}
	@RequestMapping("/delete")
	public ModelAndView delet(@RequestParam("dele")int del) {
		ModelAndView md=new ModelAndView();
		bin.delt(del);
		md.setViewName("/showlist");
		return md;
	}
	@PostMapping("/update")
	public ModelAndView updatb(@ModelAttribute("bir")Bikes b4) {
		ModelAndView mu=new ModelAndView();
		bin.updat(b4);
		mu.setViewName("/showlist");
		return mu;
	}
	@PostMapping("/reg")
	public ModelAndView reg(@RequestParam("uN")String nm,@RequestParam("pas")String upas,@RequestParam("emal")String uem,@RequestParam("sex")String usx,@RequestParam("dt")String dat) throws ParseException{
		ModelAndView mav=new ModelAndView();
		Date dst=new SimpleDateFormat("yyyy-mm-dd").parse(dat);
		usrd.regis(nm, upas, uem, usx, dst);
		mav.setViewName("Login.jsp");
		return mav;
	}
	@PostMapping("/log")
	public ModelAndView log(@RequestParam("un")String ur,@RequestParam("psd")String pd) {
		boolean sts;
		ModelAndView mg=new ModelAndView();
		sts=usrd.logi(ur, pd);
		if(sts==true) {
			mg.setViewName("main.jsp");
			return mg;
		}else {
			mg.setViewName("/rg");
			return mg;
		}
	}
}
