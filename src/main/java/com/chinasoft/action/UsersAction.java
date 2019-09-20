package com.chinasoft.action;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.biz.Usersbiz;
import com.chinasoft.entity.Users;

@Controller
@RequestMapping("/")
public class UsersAction {
	@Autowired
	private Usersbiz ubiz;

	public Usersbiz getUbiz() {
		return ubiz;
	}

	public void setUbiz(Usersbiz ubiz) {
		this.ubiz = ubiz;
	}
	
	@RequestMapping("/checkLogin")
	public ModelAndView checkLogin(String username,String password) {
		ModelAndView mav=new ModelAndView();
		Users u=ubiz.checkLogin(username, password);
		if (u!=null) {
			mav.setViewName("main.jsp");
		}else {
			mav.setViewName("login.jsp");
		}
		return mav;
	}
	
}
