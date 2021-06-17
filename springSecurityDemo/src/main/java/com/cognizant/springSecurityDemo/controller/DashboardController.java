package com.cognizant.springSecurityDemo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.springSecurityDemo.entity.User;

@Controller
public class DashboardController {
	/*  we can pass user object to any controller using @AuthenticationPrincipal */
	
	@RequestMapping("/dashboard")
	public String getDashboard(@AuthenticationPrincipal User user, ModelMap model) {
		
		model.put("user", user);
		
		return "dashboard";
	}
}
