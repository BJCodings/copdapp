package com.copdapp.copdapp.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.copdapp.copdapp.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService service;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
		
	@GetMapping("/testinput")
	public String testIntput() {
		return "testInput";
	}
	
	@PostMapping("/saveTest")
	public String saveTest(@RequestParam (required = false) String user,
						   @RequestParam (required = false, defaultValue = "0") int q1,
						   @RequestParam (required = false, defaultValue = "0") int q2,
						   @RequestParam (required = false, defaultValue = "0") int q3,
						   @RequestParam (required = false, defaultValue = "0") int q4,
						   @RequestParam (required = false, defaultValue = "0") int q5,
						   @RequestParam (required = false, defaultValue = "0") int q6,
						   @RequestParam (required = false, defaultValue = "0") int q7,
						   @RequestParam (required = false, defaultValue = "0") int q8,
						   ModelMap model) {
		
		if(!user.isEmpty()) {
			if(service.createNewCatTest(user, q1, q2, q3, q4, q5, q6, q7, q8)) {
				model.put("saved", "Your Test was saved successfull.");
				return "saveTest";
			}
			else {
				model.put("notsaved", "Your Test didn't saved!!! Try aggain.");
				return "testInput";
			}
		}
		else {
			model.put("error", "UserName is Required");
			return "testInput";
		}
	}
	
	@GetMapping("/connect")
	public String connectUser() {
		return "connect";
	}
	
	@PostMapping("/checkuser")
	public String checkUser(@RequestParam(required = false) String user) {
		if(service.checkIfUserExist(user)) {
			return "login";
		}
		else return "signup";
	}
	
}
