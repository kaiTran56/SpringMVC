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

		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people");
		people.setTest();
		((ClassPathXmlApplicationContext) context).close();
		return "homepage";
	}

	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people");
		((ClassPathXmlApplicationContext) context).close();
		return people.setTest();
	}

	@RequestMapping("/homepage")
	@ResponseBody
	public String greeting() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people");
		((ClassPathXmlApplicationContext) context).close();
		return people.setTest();
	}
}
