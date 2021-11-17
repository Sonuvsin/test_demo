package com.ashraf.mvc_firstass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index")
	public String home()
	{
		
		System.out.println("This is index page and has a hyperlink once u click on hyperlink it will redirect to Helloworld controller");
		
		return "index";
	}
	
}
