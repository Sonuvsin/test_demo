package com.springmvc6;

import javax.validation.Valid;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
@Controller  
public class CustomerController {  
  
    @RequestMapping("/hello")  
    public String display(Model m)  
    {  
        m.addAttribute("cust", new Customer());  
        return "viewpage";  
    }  
    @RequestMapping("/helloagain")  
    public String submitForm( @Valid @ModelAttribute("cust") Customer e, BindingResult br)  
    {  
        if(br.hasErrors())  
        {  
            return "viewpage";  
        }  
        else  
        {  
        return "final";  
        }  
    }  
}  