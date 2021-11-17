package com.SpringMvc3;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value ="/hello" ,method = RequestMethod.GET)
	public String display(HttpServletRequest req,ModelMap m)
	{
		//read the provided form data
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("Sonu") && pass.equals("admin"))
		{
			String msg="Hello "+ name;
			//add a message to the model
			m.addAttribute("message1", msg);
			return "viewpage";
		}
		else
		{
			String msg="Sorry You entered Wrong Credentials";
			m.addAttribute("message2", msg);
			return "errorpage";
		}
	}

}

