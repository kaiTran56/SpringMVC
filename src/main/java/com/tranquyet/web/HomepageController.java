package com.tranquyet.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomepageController {

	@RequestMapping("/")

	public String showHomepage() {
		return "homepage";
	}

	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		return "Hello, welcome to Login";
	}
	@RequestMapping("/homepage")
	@ResponseBody
	public String greeting() {
		return "Hello World, I'm Kai, Welcome to the New World!";
	}
}
