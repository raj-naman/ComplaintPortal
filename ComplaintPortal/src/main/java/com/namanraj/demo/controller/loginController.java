package com.namanraj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.namanraj.demo.dao.LoginRepo;
import com.namanraj.demo.model.User;

@RestController
public class loginController 
{
	@Autowired
	LoginRepo loginrepo;
	
	// SAC Login
	
	@RequestMapping("/saclogin")
	public ModelAndView sac()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("saclogin.jsp");
		return mv;
	}
	
	@RequestMapping("/login-sac")
	public ModelAndView loginSac(@ModelAttribute User user)
	{
		ModelAndView mv = new ModelAndView();
		if(loginrepo.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return new ModelAndView("redirect:/welcomesac.jsp");
		}
		else {
			mv.setViewName("saclogin.jsp");
			return mv;
		}
		
	}
	
	// Food Commitee Login
	
	@RequestMapping("/fcomlogin")
	public ModelAndView foodcom()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("foodcomlogin.jsp");
		return mv;
	}
	
	@RequestMapping("/login-fcom")
	public ModelAndView loginFoodCom(@ModelAttribute User user)
	{
		ModelAndView mv = new ModelAndView();
		if(loginrepo.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return new ModelAndView("redirect:/welcomefcom.jsp");
		}
		else {
			mv.setViewName("foodcomlogin.jsp");
			return mv;
		}
		
	}
	
	// Warden Login
	
	@RequestMapping("/wardenlogin")
	public ModelAndView warden()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("wardenlogin.jsp");
		return mv;
	}
	
	@RequestMapping("/login-warden")
	public ModelAndView loginWarden(@ModelAttribute User user)
	{
		ModelAndView mv = new ModelAndView();
		if(loginrepo.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return new ModelAndView("redirect:/welcomewarden.jsp");
		}
		else {
			mv.setViewName("wardenlogin.jsp");
			return mv;
		}
		
	}
	
	// Sports Commitee Login

	@RequestMapping("/sportcomlogin")
	public ModelAndView sports()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sportcomlogin.jsp");
		return mv;
	}
	
	@RequestMapping("/login-sportscom")
	public ModelAndView loginSportcom(@ModelAttribute User user)
	{
		ModelAndView mv = new ModelAndView();
		if(loginrepo.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return new ModelAndView("redirect:/welcomesportcom.jsp");
		}
		else {
			mv.setViewName("sportcomlogin.jsp");
			return mv;
		}
		
	}


}
