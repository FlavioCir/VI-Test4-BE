package it.epicode.flaviocirillo.D4S6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@PostMapping("/login_success")
	@ResponseBody
	public String login_success() {
		return "login success";
	}
	
}
