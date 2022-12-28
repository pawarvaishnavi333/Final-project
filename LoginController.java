package com.laptopshopwithsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.laptopshopwithsb.form.LoginForm;
import com.laptopshopwithsb.form.SignupForm;


@Controller
public class LoginController {
	// to get login form page
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm() {
		//return html page name
		return "login";
	}
	//checking for login credentials
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String login(@ModelAttribute("loginForm") LoginForm loginForm, Model model) {
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		if("admin".equals(username) && "admin".equals(password)) {
			// if username and password is correct , we are returning home page
			return "home";
		}
		// if username or password is wrong
		model.addAttribute("invalidCredentials", true);
		return "login";
		}
	
	
	
	
	
	
	
	// to get signup form page
	
		@RequestMapping(value="/signup", method=RequestMethod.GET)
		public String getsignupForm() {
			//return html page name
			return "signup";
		}
		//checking for login credentials
		
		@RequestMapping(value="/userdb", method=RequestMethod.POST)
		public String signup(@ModelAttribute("signup") SignupForm signupForm, Model model) {
			String username = signupForm.getUsername();
			String password = signupForm.getPassword();
			
			if("vaishnavi".equals(username) && "vaishu".equals(password)) {
				// if username and password is correct , we are returning home page
				return "userdb";
			}
			// if username or password is wrong
			model.addAttribute("invalidCredentials", true);
			return "signup";
			}
		@RequestMapping(value="/veritys", method=RequestMethod.GET)
		public String getVarities() {
			//return html page name
			return "veritys";
		}
		@RequestMapping(value="/logout", method=RequestMethod.GET)
		public String getLogout() {
			//return html page name
			return "login";
		}
		@RequestMapping(value="/home", method=RequestMethod.GET)
		public String getHome() {
			//return html page name
			return "home";
		}
		
		
		
		
		@RequestMapping(value="/lenovo1", method=RequestMethod.GET)
		public String getLenovo1() {
			//return html page name
			return "lenovo1";
		}
		@RequestMapping(value="/lenovo2", method=RequestMethod.GET)
		public String getLenovo2() {
			//return html page name
			return "lenovo2";
		}
		@RequestMapping(value="/lenovo3", method=RequestMethod.GET)
		public String getLenovo3() {
			//return html page name
			return "lenovo3";
		}
		@RequestMapping(value="/lenovo4", method=RequestMethod.GET)
		public String getLenovo4() {
			//return html page name
			return "lenovo4";
		}
		@RequestMapping(value="/hp1", method=RequestMethod.GET)
		public String getHp1() {
			//return html page name
			return "hp1";
		}
		@RequestMapping(value="/hp2", method=RequestMethod.GET)
		public String getHp2() {
			//return html page name
			return "hp2";
		}
		@RequestMapping(value="/hp3", method=RequestMethod.GET)
		public String getHp3() {
			//return html page name
			return "hp3";
		}
		@RequestMapping(value="/hp4", method=RequestMethod.GET)
		public String getHp4() {
			//return html page name
			return "hp4";
		}
		
		@RequestMapping(value="/shopping1", method=RequestMethod.GET)
		public String getshopping1() {
			//return html page name
			return "shopping1";
		}
		@RequestMapping(value="/shopping2", method=RequestMethod.GET)
		public String getshopping2() {
			//return html page name
			return "shopping2";
		}
		@RequestMapping(value="/shopping3", method=RequestMethod.GET)
		public String getshopping3() {
			//return html page name
			return "shopping3";
		}
		@RequestMapping(value="/shopping4", method=RequestMethod.GET)
		public String getshopping4() {
			//return html page name
			return "shopping4";
		}
		
		

}
