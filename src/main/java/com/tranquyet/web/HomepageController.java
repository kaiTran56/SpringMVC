package com.tranquyet.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tranquyet.entity.People;

@Controller
public class HomepageController {

	@RequestMapping("/")

	public String showHomepage() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people");
		people.setTest();

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
